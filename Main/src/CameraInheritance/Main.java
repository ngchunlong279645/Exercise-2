package CameraInheritance;

public class Main {

	public static void main(String[] args) {
		
		Camera objCam = new Camera ();
		System.out.println("");
		System.out.println(objCam.toString());
		System.out.printf("Total Price\t\t\t\t: RM%.2f\n",objCam.getTotalPrice());
		System.out.println("----------------------------------------------------");
		System.out.println();
		
		Canon objCanon = new Canon();
		objCanon.setMonth(6);
		objCanon.setRate(2.5);
		System.out.println("");
		System.out.println(objCanon.toString());
		System.out.printf("Total Price without interest\t\t: RM%.2f\n",objCanon.getTotalPrice());
		System.out.printf("Total Interest\t\t\t\t: RM%.2f\n",objCanon.getInterest());
		System.out.printf("Total Price with interest\t\t: RM%.2f\n",objCanon.getTotalPayment());
		System.out.printf("Payment Per Month\t\t\t: RM%.2f\n",objCanon.payment_PerMonth());
		System.out.println("----------------------------------------------------");
		

	}

}
