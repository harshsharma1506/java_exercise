package BITS_ASSIGNMENT1;
import java.util.Scanner;

/*
 * Write a Java program that gets the number of students n and the marks of the n students 
 * using while, do..while and for loops, calculate the total and average of the marks 
 * and print total and average.
 */

class wrapLogic{
	public static int total, average ;       // static attributes 
	
/*	if for loop is selected below method is called */
	
	public static int forCall( String[] str, int num) {
		int lenStr = str.length;
		for ( int i = 0; i < lenStr; i++ ) {
			int sepInt = Integer.parseInt(str[i]);
			total = total + sepInt;
		}
		average = total / num;
		return 0;
	}
	
/*	if while loop is selected below method is called */	
	
	public static int whileCall( String[] str, int num) {
		int counter = 0;
		int lenStr = str.length;
		while (counter < lenStr ) {
			int sepInt = Integer.parseInt(str[counter]);
			total = total + sepInt;
			counter ++;
		}
		average = total / num;
		return 0;
	}
	
/*	if do while loop is selected below method is called */	
	
	public static int doWhileCall( String[] str, int num) {
		int counter = 0;
		int lenStr = str.length;
		do {
			int sepInt = Integer.parseInt(str[counter]);
			total = total + sepInt;
			counter++;
		}
		while(counter < lenStr);
		average = total / num;
		return 0;
	}
	
	public static void logic( ) {
		Scanner numStudent = new Scanner(System.in);  
		System.out.println("Enter number of students");
		String numStu = numStudent.nextLine();
		int numStuin = Integer.parseInt(numStu);  // integer conversion for the number 
		Scanner markStu = new Scanner(System.in);
		System.out.println("Enter marks of students Separated by a comma");
		String markString = markStu.nextLine();
		Scanner method = new Scanner(System.in);
		System.out.println("Write the loop we shall use"); // let the user select the loop
		String methContain = method.nextLine();                                    
	    String[] marks = markString.split(","); 
	    int lenMarks = marks.length;
	    if ( lenMarks != numStuin ) {              // validation for marks count        
	    	System.out.println("Marks are incomplete");
	    }
	    else {
	    	switch (methContain) {
	    	case "for":
	    		wrapLogic.forCall(marks, numStuin);
	    	    break;
	    	case "while":
	    		wrapLogic.whileCall(marks, numStuin);
	    	    break;
	    	case "do-while":
	    		wrapLogic.doWhileCall(marks, numStuin);
	    	}
	    }
	}
}

class marksAvgTotal{
	public static void main(String[] args) {
		wrapLogic.logic();
		System.out.println("Total is: "+ wrapLogic.total);
	    System.out.println("Average is: "+ wrapLogic.average);	
	}
}
