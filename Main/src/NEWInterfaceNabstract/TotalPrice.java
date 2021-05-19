package NEWInterfaceNabstract;

interface TotalPrice {
	
	double getTotalPrice(double quantity);
	double getTotalPrice(double price, double quantity);
	double getTotalPrice(double price, double quantity, double discount);

}
