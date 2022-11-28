
public class Uhu extends Tier {

	protected Uhu(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void gibLaut() {
		
		System.out.println(this.getName() + "(" + this.getClass().getName() + "): ruft: UUUUHUHHH");
		
	}

}
