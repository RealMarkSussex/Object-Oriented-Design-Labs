public abstract class Duck {

	protected FlyBehaviour flyBehaviour;
	protected QuackBehaviour quackBehaviour;

	public void performFly() {
		flyBehaviour.fly();
	}

	public void performQuack() {
		quackBehaviour.quack();
	}

	public abstract void display();
}
