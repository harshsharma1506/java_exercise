package BITS_ASSIGNMENT1;
import java.io.*;
class test {
	static String filepath = "test.txt";
	static int[] num = {45, 5, 6, 2, 11};
	public static void main(String[] args) throws IOException {
	try (BufferedWriter dio = new BufferedWriter( new FileWriter(filepath) )){
		for (int i : num ) {
		if ( i % 2 == 0) {
		dio.write(i);
		}
		}
		dio.close();
    BufferedReader doi = new BufferedReader( new FileReader(filepath));
    int j = doi.read();
    while(j != -1 || j == 0) {
    	String line = doi.readLine();
    	System.out.print(line);
    	j--;
    }
    	
	}}}
