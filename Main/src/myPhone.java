
public class myPhone {

	String Brand = "Apple";
	int price = 1999;
	String color = "Black";
	int volume=10;
	
	void startCall() {
		System.out.println("Hello how are you ?");
	}
	
	void endCall() {
		System.out.println("bye bye see u next time!");
	}
	
	void printVol (int volume) {
		System.out.println("The volume will become \t: "+volume);
	}
	
	void volup () {
		volume++;
	}
	
	void voldown ()	{
		volume--;
		
	}
}
