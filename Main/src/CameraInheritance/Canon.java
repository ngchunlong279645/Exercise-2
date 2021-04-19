package CameraInheritance;

public class Canon extends Camera {

	private int month;
	private double rate;
	private double interest;
	
	
	
	public Canon() {
		super();
		System.out.print("Installment Period (months)\t\t: ");
		month=scan.nextInt();
		System.out.print("The Interest Rate (%)\t\t\t: ");
		rate=scan.nextDouble();
	}
	
	public double getInterest(){
	    interest=super.getTotalPrice()*rate/100; 
	    return interest;
	    }
	
	public double getTotalPayment() {
		return super.getTotalPrice() + interest;
	}
	
	public double payment_PerMonth(){
		return getTotalPayment()/month;
	}
	
	public String toString() {
		return  super.toString()+"\nInstallment Period\t\t\t: "+month
								+"\nInterest Rate\t\t\t\t: "+rate+"%";
	
	}
	
	
}
