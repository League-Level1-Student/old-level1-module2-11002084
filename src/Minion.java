
public class Minion {
	private String name;
	private int eyes;
	private String color;
	private String master;
	
	public Minion(String name,int eyes, String color, String master){
		this.name=name;
		this.eyes=eyes;
		this.color=color;
		this.master=master;
	}
	public void setMaster(String master) {
		this.master=master;
	}
	public Object getName() {
		return name;
	}
	public Object getColor() {
		return color;
	}
	public Object getEyes() {
		return eyes;
	}
	public Object getMaster() {
		return master;
	}

}
