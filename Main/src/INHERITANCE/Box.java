package INHERITANCE;

public class Box extends Rectangle //Box (child/Subclass) extends means as inheret data and method from Rectangle (Parent/Super class)

{
    private double height;
   
    public Box(double L, double W, Double H){
    	
       super(L,W); //super=parent(Rectangle)
    	
       height = H;
    	
    }
    
    public double getHeight(){
       return height;
    }
    
    public double area() {
       return  2  * (getLength() * getWidth() + getLength() * height 
	+ getWidth() * height);
    } 
    
    public double volume() {
       return super.area() * height;
    }
    
    public String toString() {
       return super.toString() + "height = " + height;
    }

} // end for class Box extends