package ProtonConstructor;

import java.util.Scanner;

public class Proton {
	String brand;
	String color;
	int maxSpeed;
	
	Scanner s = new Scanner(System.in);
	//default construcctor
	//Proton p = new Proton();
	Proton() {
		
		System.out.println("Enter Max Speed");
		this.maxSpeed = s.nextInt();
		s.nextLine();
		System.out.println("Enter Brand");
		this.brand = s.nextLine();
		s.nextLine();		
		System.out.println("Enter Color");
		this.color = s.nextLine();
		
			
	}
	
	
	//Parameterized constructor
	Proton(String b, String c, int s){
			this.brand=b;
			this.color=c;
			this.maxSpeed=s;
	}

}
