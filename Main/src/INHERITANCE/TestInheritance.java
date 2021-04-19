package INHERITANCE;

public class TestInheritance {

	public static void main(String[] args) {
		Rectangle objRec = new Rectangle (4, 5);
		Box objBox = new Box(5.2, 4.3, 2.4);
		
		System.out.println(objRec);
		System.out.println(" Area of Rectangle = " + objRec.area());

		System.out.println(objBox);
		System.out.println(" Area of Box = " + objBox.area());
		System.out.println(" Volume of Box = " + objBox.volume());

	}

}
