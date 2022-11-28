
public class Hase extends Tier {
	
	protected Hase( String name) {
		super(name);
	}
	
	@Override
	public void gibLaut() {
		System.out.println(this.getName() + " (" + this.getClass().getName() + "): mümmelt");		
	}
}
