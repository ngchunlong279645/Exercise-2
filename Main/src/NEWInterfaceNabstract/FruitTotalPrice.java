package NEWInterfaceNabstract;

class AppleTotalPrice implements TotalPrice {
	
	public double getTotalPrice(double quantity) {
		double price = 2;
		return price*quantity;
	}

	public double getTotalPrice(double price, double quantity) {
		return price*quantity;
	}

	public double getTotalPrice(double price, double quantity, double discount) {
		return  (price*quantity)*(1-discount);
	}
}


class OrangeTotalPrice implements TotalPrice{
	
	public double getTotalPrice(double weight) {
		double price = 10;
		return price*weight;
	}
	
	public double getTotalPrice(double price, double weight) {
		return price*weight;
	}

	public double getTotalPrice(double price, double weight, double tax) {
		return  (price*weight)*(1+tax);
	}
}
