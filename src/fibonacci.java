class fibonacci{
	public static void main( String[] args ) {
		System.out.println("Fibonacci until 50");
		int a = 1, // sort of a chained statement for same types
		    b = 1;
		System.out.println(a); // printing a out of the loop
		while( a< 50 ) {
			System.out.println(b);
			b = a + b;
			a = b - a;
		}
	}
}
