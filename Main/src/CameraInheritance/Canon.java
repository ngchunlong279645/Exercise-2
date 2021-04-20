package CameraInheritance;

public class Canon extends Camera {

	private int month;
	private double rate;
	private double interest;
	
	
	
	public Canon() {
		super();
	}
	
	public void setMonth(int month) {
		this.month=month;
	}
	
	public void setRate(double rate) {
		this.rate=rate;
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
