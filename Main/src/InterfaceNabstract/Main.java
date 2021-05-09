package InterfaceNabstract;

public class Main {

	public static void main(String[] args) {

		Apple a = new Apple("APPLE",2.5,25);	//(name,price,quantity)
		System.out.println(a+"\n");
		
		RedApple r = new RedApple("RED APPLE",3,5,"RED","CHINA");	//(name,price,quantity,color,country)
		System.out.println(r+"\n");
		
		GreenApple g = new GreenApple("GREEN APPLE",1.25,9,"RED",'M');	//(name,price,quantity,color,size)
		System.out.println(g+"\n");
		
		Durian d = new Durian("DURIAN",5,'y');	//(name,weight,husk)
		System.out.println(d+"\n");
		
		Orange o = new Orange("ORANGE",8,"Korea");	//(name,price,country)
		System.out.println(o+"\n");
		

	}

}
