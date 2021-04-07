package PhoneProfile;

public class Main {

	public static void main(String[] args) {
		phone huawei = new phone();    //create new object from class phone name as huawei.
		phone vivo = new phone();	   //create second object from class phone name as vivo.
		phone samsung = new phone();   //create third object from class phone name as samsung.
		phone sony = new phone();	   //create forth object from class phone name as sony.
		phone asus = new phone();	   //create fifth object from class phone name as asus.
		
		System.out.println("VIVO SPECIFICATION");	
		vivo.printSpec("V10","RED",399,55.6,'Y');
		vivo.convert(399, "Thailand");
		vivo.payment(399, 6);
		vivo.totalPrice(399, 5);	
		vivo.promotion(5);
		
		System.out.println("HUAWEI SPECIFICATION");	
		huawei.printSpec("Nova3", "BLACK", 299, 49.5,'N');
		huawei.convert(299, "USA");
		huawei.payment(299, 5);
		huawei.totalPrice(299, 2);
		huawei.promotion(2);
		
		System.out.println("SAMSUNG SPECIFICATION");	
		samsung.printSpec("NOTE10","PINK",999,70.8,'N');
		samsung.convert(999, "China");
		samsung.payment(999, 9);
		samsung.totalPrice(999, 3);
		samsung.promotion(3);
		
		System.out.println("SONY SPECIFICATION");	
		sony.printSpec("Xperia 6","GREY",899,66.8,'Y');
		sony.convert(899, "Japan");
		sony.payment(899, 8);
		sony.totalPrice(899, 6);
		sony.promotion(6);
		
		System.out.println("ASUS SPECIFICATION");	
		asus.printSpec("ROG 5","WHITE",599,95.2,'Y');	
		asus.convert(599, "USA");
		asus.payment(599, 3);
		asus.totalPrice(599, 4);
		asus.promotion(4);
	}
}

