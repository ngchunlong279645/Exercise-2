package CameraModify;

import java.util.Scanner;

public class Camera {
	Scanner scan = new Scanner(System.in);
	private String model,color,zoom;
	private double price,weight;
	private int minISO,maxISO;
	private char waterproof;
	private double total;
	
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
	
	public String getModel() {
		return this.model;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getZoom() {
		return this.zoom;
	}
	
	public int getMinISO() {
		return this.minISO;
	}
	
	public int getMaxISO() {
		return this.maxISO;
	}
	
	public char getWaterproof() {
		return this.waterproof;
	}
	
	public double totalPrice() {
		this.total = this.price*5;
		return this.total;
	}
}
