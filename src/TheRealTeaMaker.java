
public class TheRealTeaMaker {
	public static void main(String[] args) {
		TeaBag teabag=new TeaBag(TeaBag.MINT);
		Kettle kettle=new Kettle();
		Cup cup=new Cup();
		kettle.getWater();
		kettle.boil();
		cup.makeTea(teabag, kettle.getWater());
	}

	public TheRealTeaMaker() {
		// TODO Auto-generated constructor stub
	}

}
