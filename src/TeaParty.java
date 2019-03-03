
public class TeaParty {
	private String name;
	private boolean isWoman;
	private boolean isKnighted;

	public String welcome(String name, boolean isWoman, boolean isKnighted) {
		if(isKnighted ==true) {
			return "Sir";
		}
		else {
			return null;
		}
	}
}