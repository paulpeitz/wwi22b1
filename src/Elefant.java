
public class Elefant extends Tier {

	protected Elefant(String name) {
		super(name);

	}

	@Override
	public void gibLaut() {
		System.out.println("Der " + this.getClass().getName() + " trötet.");

	}

}
