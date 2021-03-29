
public class phoneBen {
	
	String Brand = "Samsung";
	int price = 2999;
	String color = "Pink";
	int volume=21;
	
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
