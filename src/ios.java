import java.io.*;

public class ReadFileExample {
    public static void main(String[] args) {
        // Specify the path to your file
        String filePath = "example.txt";  // Replace with your file path
        
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            // Read file line by line and print to console
            while ((line = reader.readLine()) != null) {
                System.out.println(line);  // Print each line to the console
            }
        } catch (IOException e) {
            e.printStackTrace();  // Handle exception if file is not found or cannot be read
        }
    }
}
