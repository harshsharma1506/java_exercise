package BITS_ASSIGNMENT1;
import java.io.*;

class caseChecker{
	public static void main(String[] args) throws FileNotFoundException {
		try {
			BufferedReader br = new BufferedReader(new FileReader("file.txt"));
			String line = br.readLine();
			if ( line!= null ){
				for (char c: line.toCharArray()) {
					if (Character.isUpperCase(c) && !Character.isWhitespace(c)) {
					  char b = Character.toLowerCase(c);
					  System.out.println(b);
					}
					else {
						System.out.println(c);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
