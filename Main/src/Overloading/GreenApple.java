package Overloading;

public class GreenApple extends Apple {
	protected char export;
	protected String color;
	
	public GreenApple() {
		super();
		export=' ';
		color=null;
	}
	
	public GreenApple(String name,int q,int p,char e,String c) {
		super(name,q,p);
		setInfo(name,q,p,e,c);
	}
	
	public void setInfo(String name,int q,int p,char e,String c) {
		if(e=='y')
			export='y';
		else if (e=='n')
			export='n';
		else
			export=' ';
		if(c!=null)
			color=c;
		else
			color=null;
	}
	
	public char getExport() {
		return export;
	}
	
	public String getColor() {
		return color;
	}
	
	public String toString() {		//overriding method
		return "Type\t\t: "+name+"\n"+
				"Quantity\t: "+quantity+"\n"+
				"Unit Price\t: RM "+price+"\n"+
				"Export\t\t: "+export+"\n"+
				"Color\t\t: "+color+"\n";

}
}
