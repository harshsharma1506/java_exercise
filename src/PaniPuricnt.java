package BITS_ASSIGNMENT1;
import java.util.Scanner;
/*
 * Write a java program that counts the number of pani puris you can eat. 
 * If you can eat only 10 pani puris, you break out of the loop saying "I am done". 
 * Else continue eating pani puris and print 
 * "I am eating ith pani puri". Get the number of pani puris you can eat from the user.
 */
class PaniPuriCntr{
	public static void main( String[] args ) {
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the number of pani puris you can eat");
		int Num = obj1.nextInt();
		int puriCount = 0;
		while(puriCount < Num) {
			int cntDisplay = puriCount + 1;
			System.out.println("I am eating " + cntDisplay +"th"+ " pani puri");
			puriCount++;
		}
		System.out.println("I am done");
	}
}
