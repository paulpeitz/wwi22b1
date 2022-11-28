
public class Wolf extends Tier {

	protected Wolf(String name) {
		super(name);
	}
	
	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): schreit");

	}

}
