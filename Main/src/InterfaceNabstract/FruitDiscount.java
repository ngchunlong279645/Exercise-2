package InterfaceNabstract;

class AppleDiscount implements Discount {
	public double rateOfDiscount() {
		return 0.15;
	}
}

class DurianDiscount implements Discount{
	public double rateOfDiscount() {
		return 0.35;
	}
}

class OrangeDiscount implements Discount{
	public double rateOfDiscount() {
		return 0.45;
	}
}
