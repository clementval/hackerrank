all: run

Solution.class: Solution.java
	javac -Xlint:unchecked Solution.java

run: Solution.class 
	java Solution < sample_input

clean: 
	rm -f *.class
