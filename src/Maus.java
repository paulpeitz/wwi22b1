
public class Maus extends Tier {
	public Maus(String name) {
		super(name);
	}
	
	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): piepst");		
	}

}
