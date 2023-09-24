package session42;
public class Car {
	int speed;
	String color;
	int yom;

	public Car(int speed, String color, int yom) {
		super();
		this.speed = speed;
		this.color = color;
		this.yom = yom;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + ", yom=" + yom
				+ "]";
	}
	

}
