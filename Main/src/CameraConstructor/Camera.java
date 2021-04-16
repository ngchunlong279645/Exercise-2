package CameraConstructor;

import java.util.Scanner;

public class Camera {
	Scanner scan = new Scanner(System.in);
	String model,color,zoom;
	double price,weight;
	int minISO,maxISO;
	char waterproof;
	

	//default construcctor
	Camera(){
		System.out.print("Enter model\t\t :");
		this.model=scan.next()+scan.nextLine();
		System.out.print("Enter color\t\t :");
		this.color=scan.next()+scan.nextLine();
		System.out.print("Enter price\t\t :");
		this.price=scan.nextDouble();
		System.out.print("Enter weight\t\t :");
		this.weight=scan.nextDouble();
		System.out.print("Enter Optical Zoom\t :");
		this.zoom=scan.next()+scan.nextLine();
		System.out.print("Enter Minimum ISO\t :");
		this.minISO=scan.nextInt();
		System.out.print("Enter Maximum ISO\t :");
		this.maxISO=scan.nextInt();
		System.out.print("Have waterproof?(Y/N)\t :");
		this.waterproof=scan.next().charAt(0);
	}
	
	//Parameterized constructor
	Camera(String m,String c,double p,double w,String z,int min,int max,char wtr){
		this.model=m;
		this.color=c;
		this.price=p;
		this.weight=w;
		this.zoom=z;
		this.minISO=min;
		this.maxISO=max;
		this.waterproof=wtr;
	}
	
	
	
	
	
	
	
	
	
	
	

	}
