import java.util.*;
import java.text.*;

class Solution {


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    List<LogRecord> logs = new ArrayList<>();

    DateFormat logDateFormat =
        new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    logDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));


    for(int i = 0; i < n; ++i) {
      String dateToken1 = sc.next();
      String dateToken2 = sc.next();
      String action = sc.next();
      String name = sc.next();

      try {
        Date logDate = logDateFormat.parse(dateToken1 + " " + dateToken2);
        if(action.equals("Entry")) {
          LogRecord log = new LogRecord(name, LogRecord.RecordType.ENTRY, logDate.getTime());
          logs.add(log);
        } else {
          LogRecord log = new LogRecord(name, LogRecord.RecordType.EXIT, logDate.getTime());
          logs.add(log);
        }
      } catch(Exception ex) {
        System.err.println(ex.getMessage());
        System.err.println("Cannot read log: " + n + name);
      }
    }


    // First question
    if(isRuleViolated(logs)) {
      System.out.println("RULE HAS BEEN VIOLATED");
    } else {
      System.out.println("RULE HAS NOT BEEN VIOLATED");
    }

    printMinuteLog(logs);

  }

  private static boolean isRuleViolated(List<LogRecord> logs) {
    int count = 0;
    for(LogRecord log : logs) {
      if(log.getRecordType() == LogRecord.RecordType.ENTRY) {
        ++count;
      } else if(log.getRecordType() == LogRecord.RecordType.EXIT) {
        --count;
      }

      if(count > 60) {
        return true;
      }
    }
    return false;
  }

  private static void printMinuteLog(List<LogRecord> logs) {
    long currentMin = 0;
    int count = 0;
    for(LogRecord log : logs) {
      if(currentMin == 0) {
        currentMin = log.getTimestamp() / 60000;
      }
      if(log.getTimestamp() / 60000 != currentMin){
        long logMin = log.getTimestamp() / 60000;

        long min = logMin - currentMin;

        for(int i = 0; i < (int)min; ++i) {
          printLine(currentMin + i, count);
        }
        currentMin = logMin;
      }

      // Counting
      if(log.getRecordType() == LogRecord.RecordType.ENTRY) {
        ++count;
      } else if(log.getRecordType() == LogRecord.RecordType.EXIT) {
        --count;
      }
    }

    printLine(currentMin, count);



  }

  private static void printLine(long minutes, int count){
    Date logDate = new Date(minutes * 60000);
    System.out.println(logDate + " persons in: " + count);
  }

}
