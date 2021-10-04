
public class HitState implements State {

	Hammer hammer;
	
	public HitState(Hammer hammer) {
		this.hammer = hammer;
	}

	@Override
	public void start() {
		System.out.println("Hammer hits something");	
	}
	
	@Override
	public void stop() {
		System.out.println("Hammer stops to hit...");	
	}

}
