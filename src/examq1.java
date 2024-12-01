package exam_prac;
import java.util.Scanner;
/*
* we need old salary of the employee 
* experience in terms of years 
* both will be in integer form or double
*/
class examq{
	public void salaryCalc(int years, int salary) {
		double newSalary;
		if(years > 3 && years <= 5) {
			double f_1 = 0.05 * salary;
			double f_2 = 0.1 * salary;
			newSalary = ( salary - f_1 ) + f_2;
		    System.out.println(newSalary);
		}
		else if (years > 5 && years <= 10 ) {
			double f_1 = 0.1 * salary;
			double f_2 = 0.1 * salary;
			newSalary = ( salary - f_1 ) + f_2;
			System.out.println(newSalary);
		}
		else if (years > 10 && years <= 20 ) {
			double f_1 = 0.2 * salary;
			double f_2 = 0.1 * salary;
			newSalary = ( salary - f_1 ) + f_2;
			System.out.println(newSalary);
		}
		else {
			double f_1 = 0.05 * salary;
			double f_2 = 0.1 * salary;
			newSalary = ( salary - f_1 ) + f_2;
		    System.out.println(newSalary);
		}
	}
	// will be the main input & output spot 
	public static void main(String[] args){
		Scanner obj1 = new Scanner(System.in);
		System.out.println("Enter the years of exp :-");
		int yearOfExp = obj1.nextInt();
		System.out.println("Old salary:-");
		int salaryOld = obj1.nextInt();
		examq caller = new examq();
		caller.salaryCalc(yearOfExp, salaryOld);
	}
}
