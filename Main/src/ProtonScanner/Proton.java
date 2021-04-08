package ProtonScanner;

import java.util.Scanner;

public class Proton {
	Scanner scan = new Scanner (System.in);

	void maxspeed() {
		System.out.println("Enter a speed : ");
		int s = scan.nextInt();
		System.out.println("The maximun speed is "+s);
	}
	
	void color() {
		System.out.println("Enter brand and color:");
		scan.nextLine();
		String b = scan.nextLine();
		String c = scan.nextLine();
		System.out.println("The car brand is "+b);
		System.out.println("The car color is "+c);
	}
}
