class tableSqr{
	public void sqr( int lim  ) { 
		int eng = 0;
		while( eng < lim ) {
			eng += 1;
			int sqr_holder = eng * eng;
			System.out.println("Square of" +" " + eng + " " + "is" + " " + sqr_holder );
		}
	}
	public static void main( String[] args) {
        int test_arg = 12;
        tableSqr obj = new tableSqr();
        obj.sqr(test_arg);
	}
}
