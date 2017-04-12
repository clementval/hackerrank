/**
 *
 */
public class LogRecord {

  public enum RecordType { ENTRY, EXIT };

  private long _timestamp;
  private RecordType _recordType;
  private String _name;

  public LogRecord(String name, RecordType recordType, long timestamp){
    _name = name;
    _recordType = recordType;
    _timestamp = timestamp;
  }

  public RecordType getRecordType(){
    return _recordType;
  }

  public long getTimestamp(){
    return _timestamp;
  }

  public String getName(){
    return _name;
  }
}