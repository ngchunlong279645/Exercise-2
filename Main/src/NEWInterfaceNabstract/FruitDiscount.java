package NEWInterfaceNabstract;

class AppleDiscount implements Discount { 
	public double rateOfDiscount(){
		return 0.15;
		}    
}

class DurianDiscount implements Discount {
	public double rateOfDiscount(){
		return 0.20;
		}  	  
}

class RedAppleDiscount implements Discount{
	public double rateOfDiscount() {
		return 0.25;
	}
}

