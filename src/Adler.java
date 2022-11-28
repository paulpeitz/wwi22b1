
public class Adler extends Tier {

	protected Adler(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
// Welchen Ton macht eigentlich ein Adler	
	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): schreit");	
	}

}
