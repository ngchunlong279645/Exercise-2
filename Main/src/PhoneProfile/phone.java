package PhoneProfile;

public class phone {
	// declare all type of variable and variable name
	String brand;
	int price,month,quantity;
	String color,country;
	double weight;
	char fingerprint;
	
	//method print specification
	void printSpec(String b,String c,int p,double w,char f) {
		System.out.println("Brand \t\t\t: "+b);
		System.out.println("Price \t\t\t: RM "+p);
		System.out.println("Color \t\t\t: "+c);
		System.out.println("Weight \t\t\t: "+w+" gram");
		System.out.println("Fingerprint \t\t: "+f);	
	}
	
	//method convert malaysia price to other country price 
	void convert(int price,String country) {
		double output=0;
		String unit=null;
			if(country.equals("USA")) {
				output=price*0.24;
				unit = "Dollar";
			}else if(country.equals("Japan")) {
				output=price*26.71;
				unit = "Yen";
			}else if(country.equals("China")) {
				output=price*1.59;
				unit = "RMB";
			}else if(country.equals("Thailand")) {
				output=price*7.58;
				unit = "Baht";
				}
		System.out.printf("Price in %-14s : %.2f %s%n",country,output,unit);
	}

	// method calculate price to be paid per how many month
	void payment(int price,int month) {
		double pay = (double) price/month;
		System.out.printf("Payment per %d months    : RM %.2f%n",month,pay);	
	}
	
	// method calculate total price
	void totalPrice(int price,int quantity) {
		int total =price * quantity;
		System.out.println("Total price of "+quantity+" phone  : RM "+total);
		System.out.println("=====================================");
	}
}// end class



