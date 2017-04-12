all: run


LogRecord.class: LogRecord.java
	javac LogRecord.java

Solution.class: Solution.java LogRecord.class
	javac Solution.java

run: Solution.class
	java Solution < sample_input1
