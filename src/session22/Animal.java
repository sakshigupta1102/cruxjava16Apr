package session22;
public class Animal {
	String color;
	int age;
	Animal(int age, String color){
		this.age = age;
		this.color = color;
	}
	public void run(){
		System.out.println("animal is running");
	}
	public void eat(){
		System.out.println("Animal is eating");
	}
}
