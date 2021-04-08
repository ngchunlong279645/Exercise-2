package PhoneScanner;

public class Main {

	public static void main(String[] args) {
		Phone huawei = new Phone();    
		Phone vivo = new Phone();	 
		Phone samsung = new Phone();   
		Phone sony = new Phone();	   
		Phone asus = new Phone();
		
		System.out.println("VIVO SPECIFICATION");	
		vivo.printSpec();
		vivo.convert();
		vivo.payment();
		vivo.totalPrice();	
		vivo.promotion();
		
		System.out.println("HUAWEI SPECIFICATION");	
		huawei.printSpec();
		huawei.convert();
		huawei.payment();
		huawei.totalPrice();
		huawei.promotion();
		
		System.out.println("SAMSUNG SPECIFICATION");
		samsung.printSpec();
		samsung.convert();
		samsung.payment();
		samsung.totalPrice();
		samsung.promotion();
		
		System.out.println("SONY SPECIFICATION");	
		sony.printSpec();
		sony.convert();
		sony.payment();
		sony.totalPrice();
		sony.promotion();
		
		System.out.println("ASUS SPECIFICATION");	
		asus.printSpec();
		asus.convert();
		asus.payment();
		asus.totalPrice();
		asus.promotion();
	}

}
