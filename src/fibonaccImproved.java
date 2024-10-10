class fibonaccImproved{
	public void looper( int limit) {
		int low = 1;
		int high = 0;
		for (int i = 2; i <= limit; i++) {
			high = high + low;
			if( high % 2 == 0) {
				System.out.println(high + "  "+ "eve");
			}
			else {
				System.out.println(high);
			}
			low = high - low;
		}
	}
	public static void main( String[] args) {
		fibonaccImproved obj1  = new fibonaccImproved();
		final int lim = 12;
		obj1.looper(lim);
	}
}
