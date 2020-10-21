public class RubberDuck extends Duck {

	public RubberDuck() {
		flyBehaviour = new FlyNoWay();
		quackBehaviour = new Squeak();
	}

	public void display() {
		System.out.println("Display: I look like a majestic yellow plastic duck.");
	}
}
