package CameraConstructor;

public class Main {

	public static void main(String[] args) {
		
		Camera canon = new Camera();
			System.out.println();
			System.out.println(">>>>>>>CANON CAMERA<<<<<<<");
			System.out.println("Model\t\t :"+canon.model);
			System.out.println("Color\t\t :"+canon.color);
			System.out.println("Price\t\t :RM"+canon.price);
			System.out.println("Weight\t\t :"+canon.weight+"g");
			System.out.println("Optical Zoom\t :"+canon.zoom);
			System.out.println("MinISO\t\t :"+canon.minISO);
			System.out.println("MaxISO\t\t :"+canon.maxISO);
			System.out.println("Waterproof\t :"+canon.waterproof);
			
		
		Camera sony = new Camera("A7","Black",7900,120,"x20",200,16000,'N');
			System.out.println();
			System.out.println("<<<<<<<SONY  CAMERA>>>>>>>");
			System.out.println("Model\t\t :"+sony.model);
			System.out.println("Color\t\t :"+sony.color);
			System.out.println("Price\t\t :RM"+sony.price);
			System.out.println("Weight\t\t :"+sony.weight+"g");
			System.out.println("Optical Zoom\t :"+sony.zoom);
			System.out.println("MinISO\t\t :"+sony.minISO);
			System.out.println("MaxISO\t\t :"+sony.maxISO);
			System.out.println("Waterproof\t :"+sony.waterproof);
			
	

}
}
