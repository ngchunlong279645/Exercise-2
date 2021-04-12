package ProtonSetterGetter;

public class Main {

	public static void main(String[] args) {
	
		Proton p = new Proton();
		
		p.setBrand("X70");
		p.setColor("RED");
		p.setSpeed(200);
		p.setWeight(950.66);
		p.setBootSpace(250.36);
		
		System.out.println("Brand : " + p.getBrand());
		System.out.println(p.getColor());
		System.out.println(p.getSpeed());
		System.out.println(p.getWeight());
		System.out.println("Boot Space : " + p.getBootSpace() + "Kg");
			
		p.fullThrottle();
	
		}

}
