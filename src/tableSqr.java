class tableSqr{
	public void sqr( int lim  ) {  // user to give the limit
    	int eng = 0; 
		while( eng < lim ) {
			eng += 1;
			int sqr_holder = eng * eng;
			System.out.println("Square of" +" " + eng + " " + "is" + " " + sqr_holder );
		}
	}
	public static void main( String[] args) {
        final int test_arg = 12; // with final you can define a constant 
    //    test_arg = 7;   
        tableSqr obj = new tableSqr();
        obj.sqr(test_arg);
	}
}
