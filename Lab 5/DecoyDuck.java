public class DecoyDuck extends Duck {

	public DecoyDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new MuteQuack();
	}

	public void display()
	{
		System.out.println("Display: I only look like a duck!");
	}
}
