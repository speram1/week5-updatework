
public class Bought implements State {

	Hammer hammer;
	
	public Bought(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void start() {

		System.out.println("Hammer has bought");	

	}
	
	@Override
	public void stop() {

		System.out.println("hammer has  stooped to buy...");	

	}

}
