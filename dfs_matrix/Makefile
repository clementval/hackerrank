all: run

Solution.class: Solution.java
	javac Solution.java

run: Solution.class 
	java Solution < sample_input1
	java Solution < sample_input2

clean: 
	rm -f *.class
