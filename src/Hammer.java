
public class Hammer {
	State bought;
	State hit;
	State sold;
	State soldout;

	State state;

	
	public Hammer() {
		bought = new Bought(this);
		hit = new HitState(this);
		sold = new Sold(this);
		soldout = new SoldOut(this);
		
		state = bought;
	}

	public void startstate()
	{
		state.start();
	}
	
	public void stop()
	{
		state.stop();
	}
	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public State getBought() {
		return bought;
	}

	public State getHit() {
		return hit;
	}

	public State getSold() {
		return sold;
	}

	public State getSoldout() {
		return soldout;
	}
	
	
	


}
