import java.io.*;
import java.util.Scanner;

class Test {
    public static int[] numCont = new int[5]; // Initialize the array with 5 elements
    public static String filepathOdd = "Odd.txt", filepathEven = "Even.txt";

    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);
        System.out.println("Print 5 numbers: ");

        // Read 5 numbers from the user
        for (int i = 0; i < 5; i++) {
            numCont[i] = obj1.nextInt();
        }

        // Create FileOutputStream for writing data to the files
        try (DataOutputStream dosOdd = new DataOutputStream(new FileOutputStream(filepathOdd));
             DataOutputStream dosEven = new DataOutputStream(new FileOutputStream(filepathEven))) {

            // Loop through the numbers and write them to the respective files
            for (int j = 0; j < numCont.length; j++) {
                if (numCont[j] % 2 == 0) {
                    // Write to Even file if the number is even
                    dosEven.writeInt(numCont[j]);
                } else {
                    // Write to Odd file if the number is odd
                    dosOdd.writeInt(numCont[j]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and display odd numbers from the "Odd.txt" file
        try (DataInputStream disOdd = new DataInputStream(new FileInputStream(filepathOdd))) {
            System.out.println("Odd numbers from the file:");
            while (disOdd.available() > 0) {
                System.out.println(disOdd.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and display even numbers from the "Even.txt" file
        try (DataInputStream disEven = new DataInputStream(new FileInputStream(filepathEven))) {
            System.out.println("Even numbers from the file:");
            while (disEven.available() > 0) {
                System.out.println(disEven.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
