package CameraModify;

public class Main {

	public static void main(String[] args) {
		
		Camera canon = new Camera();
		System.out.println();
		System.out.println(">>>>>>>CANON CAMERA<<<<<<<");
		System.out.println("Model\t\t :"+canon.getModel());
		System.out.println("Color\t\t :"+canon.getColor());
		System.out.println("Price\t\t :RM"+canon.getPrice());
		System.out.println("Total price for 5:RM"+canon.totalPrice());
		System.out.println("Weight\t\t :"+canon.getWeight()+"g");
		System.out.println("Optical Zoom\t :"+canon.getZoom());
		System.out.println("MinISO\t\t :"+canon.getMinISO());
		System.out.println("MaxISO\t\t :"+canon.getMaxISO());
		System.out.println("Waterproof\t :"+canon.getWaterproof());

		Camera sony = new Camera("A7","Black",7900,120,"x20",200,16000,'N');
		System.out.println();
		System.out.println("<<<<<<<SONY  CAMERA>>>>>>>");
		System.out.println("Model\t\t :"+sony.getModel());
		System.out.println("Color\t\t :"+sony.getColor());
		System.out.println("Price\t\t :RM"+sony.getPrice());
		System.out.println("Total price for 5:RM"+sony.totalPrice());
		System.out.println("Weight\t\t :"+sony.getWeight()+"g");
		System.out.println("Optical Zoom\t :"+sony.getZoom());
		System.out.println("MinISO\t\t :"+sony.getMinISO());
		System.out.println("MaxISO\t\t :"+sony.getMaxISO());
		System.out.println("Waterproof\t :"+sony.getWaterproof());
	}

}
