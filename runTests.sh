rm *.class
echo "compiling ......"
echo "____________________________________________________"
javac -cp junit-4.10.jar TextFileTest.java TextFile.java
echo "running Tests ......"
echo "____________________________________________________"
java -cp ".;junit-4.10.jar" org.junit.runner.JUnitCore TextFileTest
