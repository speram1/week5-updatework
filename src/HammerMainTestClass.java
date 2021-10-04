public class HammerMainTestClass {

	public static void main(String[] args) {
	
	Hammer ham = new Hammer();
	ham.startstate();
	ham.stop();
	
	ham.setState(new Sold(ham));
	ham.startstate();
	ham.stop();

	ham.setState(new SoldOut(ham));
	ham.startstate();
	ham.stop();

	ham.setState(new HitState(ham));
	ham.startstate();
	ham.stop();


	}
}
