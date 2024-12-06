package BITS_ASSIGNMENT1;
import java.util.Arrays;
import java.util.Scanner;

class matrix{
	public static int[][] matrix;
	public static int[][] matrix_fin;
	public static void transpose(int rc, int cc) {
		int row_hlder;
		row_hlder = rc;
		rc = cc;
		cc = row_hlder;
		matrix_fin = new int[rc][cc];
		for (int m = 0; m < rc; m++) {
			for (int n = 0; n < cc ; n++) {
				matrix_fin[m][n] = matrix[n][m]; 
			}
		}
		System.out.println("Hey");
	}
	
	public static void printer(int ro_ct, int r_ct) {
		int e = 0;
		System.out.println("Actual:");
		while(e < ro_ct) {
			System.out.println(Arrays.toString(matrix[e]));
			e++;
		}
		e = 0;
		System.out.println("Transposed :");
		while(e < r_ct) {
			System.out.println(Arrays.toString(matrix_fin[e]));
			e++;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Number of rows:");
		int rows_cnt = sc.nextInt();
		System.out.println("Number of columns:");
		int col_cnt = sc.nextInt();
		matrix = new int[rows_cnt][col_cnt];
		for (int i = 0; i < rows_cnt; i++) {
		System.out.println("Please input the row of matrix values");
		for (int j = 0; j < col_cnt; j++) {
			int num = sc.nextInt();
			matrix[i][j] = num;
		}
		}
		transpose(rows_cnt,col_cnt);
		printer(rows_cnt,col_cnt);
	}
}
