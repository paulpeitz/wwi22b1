
public class Giraffe extends Tier {
	
	public Giraffe (String name) {
		super (name);
	}

	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): keine Ahnung");		
	}

}