public class RedheadDuck extends Duck {

	public RedheadDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}
	
	public void display()
	{
		System.out.println("Display: I look like a Duck with a nice red head.");
	}
}
