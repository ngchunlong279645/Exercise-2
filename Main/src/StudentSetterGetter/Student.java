package StudentSetterGetter;

public class Student {
	String name;
	int age;
	int height;
	int weight;
	String city;
	String hp;
	int sem;
	double cgpa;

// Create Setter Method	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setHeight(int height) {
		this.height=height;
	}
	
	public void setWeight(int weight) {
		this.weight=weight;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public void setHp(String hp) {
		this.hp=hp;
	}
	
	public void setSem(int sem) {
		this.sem=sem;
	}
	
	public void setCGPA(double cgpa) {
		this.cgpa=cgpa;
	}
	
// Create Getter Method
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getHp() {
		return hp;
	}
	
	public int getSem() {
		return sem;
	}
	
	public double getCGPA() {
		return cgpa;
	}
	
	
	
	
	
	

}
