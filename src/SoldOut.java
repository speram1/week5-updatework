
public class SoldOut implements State {

	Hammer hammer;
	
	public SoldOut(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void start() {

		System.out.println("Hammer has sold out");	

	}
	
	@Override
	public void stop() {

		System.out.println("hammer has  stooped to sell out...");	

	}

}
