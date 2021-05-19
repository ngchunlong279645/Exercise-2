package exampleInterfaceNabstract;

class AppleDiscount implements Discount { //lebih kurang sama dengan inherit guna extends
	
	public float rateOfDiscount(){
		return 9.15f;
		}  
	  
}

class DurianDiscount implements Discount {
	public float rateOfDiscount(){
		return 8.15f;
		}  
	  
}
