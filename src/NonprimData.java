import java.lang.String; // importing string which is in the reference of an object 
interface test_1{
	final byte var1 = 1;     
	void call_me();             // only define the method
}
class test_2 implements test_1{
	public void call_me() {
		System.out.println("You called an interface");
	}
	public static void test_intf() {
		test_2 hell = new test_2();
		hell.call_me();
	}
}
class test{
	static int[] array_test = { 1, 2, 4, 5};
	public void test_me( ){
		System.out.println( "Type of class as an object first then only I can be called");
	}
	public static void travers_array() {
		int len_array = array_test.length;
		System.out.println("Calling the traverser");
		for (int i = 0; i < len_array; i++) {
			System.out.println(array_test[i]);
		}
	}
	public static void main( String[] args) {
		String a = "hello my name is harsh"; // now we are able to use String
		System.out.println(a);
		test b = new test(); // b is type of class test now and an object 
		b.test_me(); // accessing the method
		test_2.test_intf(); // accessing the intf implementation class
		test.travers_array();
	}
}
