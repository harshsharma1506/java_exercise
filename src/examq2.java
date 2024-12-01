package exam_prac;
class aplhaChecker{
	public static String[] java_sucess = {"refer", "radar", "may", "tuesday"};
	public static String checker = "";
	public static int Num_Palin,
	                  Num_Vowel;
	public static void main(String[] args) {
		int Lenstr = java_sucess.length;
		for (int i = 0; i < Lenstr ;i++) {
			String iterator = java_sucess[i];
			for (int j = (iterator.length() - 1); j >= 0; j--) {
				if (iterator.charAt(j) == 'a' || iterator.charAt(j) == 'e'
						|| iterator.charAt(j) == 'i' || iterator.charAt(j) == 'o'
						|| iterator.charAt(j) == 'u')
				{
					Num_Vowel++;
				}
				checker = checker+iterator.charAt(j);
			    if (checker.equals(iterator) == true ) {
			    	Num_Palin++;
			    	checker = "";
			}
			
			}
		}
		System.out.println("Palindromes: " + Num_Palin);
		System.out.println("Vowels: " + Num_Vowel);
	}
}
