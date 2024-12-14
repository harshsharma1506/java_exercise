package BITS_ASSIGNMENT1;
import java.util.*;
import java.io.*;
class test {
public static void main( String[] args){
  Scanner sc = new Scanner( System.in );
  System.out.println("Number till which Fibonacci should go");
  int maxIteration = sc.nextInt();
  int[] fibonacciArray = new int[maxIteration];
  fibonacciArray[0] = 0;
  fibonacciArray[1] = 1;
  for ( int i = 2; i < maxIteration; i++){
    fibonacciArray[i] = fibonacciArray[ i - 1] + fibonacciArray[ i - 2];
  }
 System.out.println(Arrays.toString(fibonacciArray));
}
}
