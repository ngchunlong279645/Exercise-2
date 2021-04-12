package ProtonSetterGetter;

public class Proton {
	String brand;
	String color;
	int maxSpeed;
	double weight;
	double bootspace;
	
	
	  
	 // Create Setter Method
	  public void setBrand(String brand) {
	    this.brand = brand;
	  }
	  
	  public void setColor(String color) {
		    this.color = color;
	  }
	  
	  public void setSpeed(int maxSpeed) {
	    this.maxSpeed = maxSpeed;
	  }
	  
	  public void setWeight(double weight) {
		  this.weight = weight;
	  }
	  
	  public void setBootSpace(double bootspace) {
		  this.bootspace = bootspace;
	  }

	  // Create Getter Method
	  public Integer getSpeed() {
		  return this.maxSpeed;
	  }
	  
	  public String getBrand() {
		  return this.brand;
	  }
	  
	  public String getColor() {
	 	  return this.color;
 	  }
	  
	  public double getWeight() {
		  return this.weight;
	  }
	  
	  public double getBootSpace() {
		  return this.bootspace;
	  }
	  
	// Create a fullThrottle() method
	public void fullThrottle() {
		System.out.println("The car is going as fast as it can!");
	}
}
