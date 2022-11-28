
public class Hund extends Tier {

	protected Hund(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): bellt");	

	}

}
