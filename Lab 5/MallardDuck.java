public class MallardDuck extends Duck {

	public MallardDuck() {
		flyBehaviour = new FlyWithWings();
		quackBehaviour = new Quack();
	}

	public void display() {
		System.out.println("Display: I look like a lovely Mallard Duck");
	}
}
