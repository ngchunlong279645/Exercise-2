package FruitExercise;

public class testRun {

	public static void main(String[] args) {
		
		Fruit objF = new Fruit(	"Fruit");
		System.out.println(objF);
		System.out.println();
		
		Orange objO= new Orange("Orange","USA",12,88);
		System.out.println(objO);
		System.out.println(objO.getName()+" contain "+objO.getVitA()+"% vitamin A & "+objO.getVitC()+"% vitamin C\n");
		
		Banana objB= new Banana("Banana",275);
		System.out.println(objB);
		System.out.println();
		
		Apple objA = new Apple("Apple",5,4);
		System.out.println(objA);
		System.out.println("Total price apple : RM "+objA.totalPrice()+"\n");
		
		greenApple objG = new greenApple("GREEN APPLE",20,2,20);
		System.out.println(objG);
		System.out.println("Total price Green Apple : RM "+objG.totalPrice());
		System.out.println("Total weight Green Apple(g) : "+objG.getTotalWeight());
		System.out.println("Total boxes : "+objG.getBox()+"\n");
		
		redApple objR =new redApple("RED APPLE", 10,5,"RED",'M');
		System.out.println(objR);
		System.out.println("Total price Red Apple : RM "+objR.totalPrice());
		System.out.println("Discount : "+objR.getDiscount()+"%");
		System.out.println("Total Payment : RM "+objR.payment()+"\n");
		
		

	}

}
