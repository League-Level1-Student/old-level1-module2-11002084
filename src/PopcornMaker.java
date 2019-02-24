
public class PopcornMaker {

	public static void main(String[] args) {
		Microwave microwave = new Microwave();
		Popcorn popcorn=new Popcorn("Caramel");
		microwave.putInMicrowave(popcorn);
		microwave.setTime(20);
		microwave.startMicrowave();
		popcorn.eat();
		System.out.println("But wait, your popcorn is burnt.");
	}

	public PopcornMaker() {
		// TODO Auto-generated constructor stub
	}
}
