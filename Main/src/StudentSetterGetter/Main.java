package StudentSetterGetter;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.setName("Lily");
		s1.setAge(18);
		s1.setHeight(165);
		s1.setWeight(45);
		s1.setCity("Sabah");
		s1.setHp("0125986730");
		s1.setSem(3);
		s1.setCGPA(3.92);
		
		s2.setName("Lucas");
		s2.setAge(38);
		s2.setHeight(175);
		s2.setWeight(78);
		s2.setCity("Johor");
		s2.setHp("0162016425");
		s2.setSem(1);
		s2.setCGPA(4.00);
		
	
		System.out.println("Name\t\t\t: "+s1.getName());
		System.out.println("Age\t\t\t: "+s1.getAge());
		System.out.println("Height\t\t\t: "+s1.getHeight()+" cm");
		System.out.println("Weight\t\t\t: "+s1.getWeight()+" kg");
		System.out.println("City\t\t\t: "+s1.getCity());
		System.out.println("H/P\t\t\t: "+s1.getHp());
		System.out.println("Sem\t\t\t: "+s1.getSem());
		System.out.println("CGPA\t\t\t: "+s1.getCGPA());
		System.out.println();
		
		System.out.println("Name\t\t\t: "+s2.getName());
		System.out.println("Age\t\t\t: "+s2.getAge());
		System.out.println("Height\t\t\t: "+s2.getHeight()+" cm");
		System.out.println("Weight\t\t\t: "+s2.getWeight()+" kg");
		System.out.println("City\t\t\t: "+s2.getCity());
		System.out.println("H/P\t\t\t: "+s2.getHp());
		System.out.println("Sem\t\t\t: "+s2.getSem());
		System.out.println("CGPA\t\t\t: "+s2.getCGPA());
		
		
	}

}
