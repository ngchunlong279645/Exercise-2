package NEWInterfaceNabstract;

public class Main {

	public static void main(String[] args) {
		Apple a = new Apple("Apple", 2, 18); // (name,price,quantity)
		System.out.println();
		
		RedApple r = new RedApple("Red Apple", 2.5,20,"UK",'m');	// (name,price,quantity,country,size)
		System.out.println("Import from\t: "+r.getCountry());
		System.out.println("Size\t\t: "+r.getSize()+"\n");
		
		Durian d = new Durian("Durian",3,11,20,'Y');	// (name,price,quantity,weight,husk)
		System.out.println("Weight\t\t: "+d.getWeight()+" kg");
		System.out.println("Husk\t\t: "+d.hasHusk()+"\n");
		
		Orange o = new Orange("Orange",15,35);	// (name,price,weight)
		System.out.println();
		

	}

}
