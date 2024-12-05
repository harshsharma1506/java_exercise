package BITS_ASSIGNMENT1;
import java.util.Arrays;
import java.util.Scanner;
class test_1{
	public static int[] baby = new int[5];
	public static void sorter() {
		for (int j = 0; j < 4; j++ ) {
			int f = j +1;
			int plc_hlder;
			if(baby[j] > baby[f]) {
			   plc_hlder = baby[j];
		       baby[j] = baby[f];
		       baby[f] = plc_hlder;
			}
		}
		checker();
	}
	
	public static void checker() {
		for (int m = 0; m < baby.length - 1; m++) {
			if( baby[m]>baby[m+1] ) {
				sorter();
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(i < 5) {
		System.out.println("Give a number");
		int num1 = sc.nextInt();
		baby[i] = num1; 
		i++;
	}
		sorter();
		System.out.println(Arrays.toString(baby));
	}
}
