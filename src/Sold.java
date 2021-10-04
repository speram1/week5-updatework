
public class Sold implements State {

	Hammer hammer;
	
	public Sold(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void start() {

		System.out.println("Hammer has sold");	

	}
	
	@Override
	public void stop() {

		System.out.println("hammer has  stooped to sell...");	

	}

}
