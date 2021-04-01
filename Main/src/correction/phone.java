package correction;

public class phone {
	
	String brand;
	int price;
	String color;
	int volume;
	
	void getbrand() {
		System.out.println(brand);
	}
	
	void getprice() {
		System.out.println(price);
	}
	
	void getcolor() {
		System.out.println(color);
	}
	
	
	
	void volup () {
		volume++;
	}
	
	void voldown ()	{
		volume--;
		
	}

}
