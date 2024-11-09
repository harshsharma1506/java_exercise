package bits_assignments2024;
import java.util.HashMap;
public class online_shopping{
/*
 * Data declaration of registration modules
 */
	public static String name,
	                     email;
	public static int    mobile,
	                     pin;
	
/*
 * Data declaration of products and rates 
 */
	public static HashMap< String,Integer > productName = new HashMap<String, Integer>();
	public static String NameChosen;
	public static int productQty,
	                  billFin;

/*
 * Data declaration of the payment processors 
 */
	public static String[] paymentProc = {"Pay", "Pay", "Pay", "Pay" };
// making use of mobile as a param to registration , so that it can't be called without mobile number 
	public static void registration (int mob) {
		boolean flg_error = false; // flag to check for welcome message displayed or not based on error status 
		String mobCont = Integer.toString(mob);
		int len_mob = mobCont.length();
		if ( len_mob != 10 ) {
			System.out.println("Mobile Number should be of 10 digits");
			flg_error = true;
		}
		int len_name  = name.length();
		if ( len_name > 20 ) {
			System.out.println(
					"Exceeding the limit of name ( 20 characters )"
		    );	
			flg_error = true;
		}
		else {
			int len_email = 0;
			if( len_email == 0){    // only execute if email is given ( as it is optional )
			len_email = email.length();
			if( len_email > 0 ) {
			boolean emailCheck = email.contains("@");
			if (emailCheck == true) {
				emailCheck = email.contains(".");
				if (emailCheck == false) {
					System.out.println("email not in correct format ( . missing )");
	                flg_error = true;
				}
			}
			else {
				System.out.println("email not in correct format ( @ missing )");
				flg_error = true;
			}
			}}
			String pin_check = Integer.toString(pin);
			int len_pin = pin_check.length();
			if (len_pin != 6) {
				System.out.println("pin code is not correct");
				flg_error = true;
			}
		}
		if ( flg_error == false) {
			System.out.println("Login successful, Welcome to the store, we are happy to have you");
		}
	}
	
	public static void productShow() {
	  productName.put("Fan", 1150);
	  productName.put("Chair", 17800);
	  productName.put("Refrigerator",180000);
	  productName.put("Almirah", 19000);
	  System.out.println("Below are the Catalog of products with their price EA ( each )" + System.lineSeparator() + productName);
	  NameChosen = "Fan";
	  productQty = 5;
	  int Bill;
	  int price_chosen = productName.get(NameChosen);
	  Bill = price_chosen * productQty;
	  billFin = Bill;
	  System.out.println("Thanks for chosing " + productQty + " of " + NameChosen + " here is your bill " + Bill );
	}
	
	public static void paymentChoice() {
		System.out.println("We have the following payment processors - ");
		paymentProc[0] = "Gpay";
		paymentProc[1] = "PayTM";
		paymentProc[2] = "PhonePe";
		paymentProc[3] = "NetBanking";
		int len_proc = 4;
		for (int i = 0; i < len_proc; i++) {
			System.out.println(paymentProc[i]);
		}
// giving 1.8 percent as a fee 
	    String str_proc = "Gpay";
	    if (str_proc != null) {
	    	System.out.println(System.lineSeparator());
	    	System.out.println("Thanks for choosing " + str_proc + " adding 1.8 % of processor rate");
	        billFin = billFin + ( ( ( 18 / 10 ) * billFin ) / 100 );
	        System.out.println(billFin);
	    }
	}
	
	public static void main(String[] args) {
		mobile = 1234567890;
		name = "Harsh Sharma";
		pin = 990116;
		email = "harsh@123.com";
		registration(mobile);
		productShow();
		paymentChoice();
	}
}
