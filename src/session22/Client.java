package session22;
public class Client {
	public static void main(String[] args) {
//	Animal a1 = new Animal(1, "yellow");
//	Animal a2 = new Animal(12,"red");
//		System.out.println(a1.age +" " + a1.color);
//		System.out.println(a2.age +"  "+ a2.color);
//		a1.eat();
		Student s1 = new Student("kunal", 10);
		Student s2 = new Student("hardik", 20);
	    System.out.println(s1.name+" " + s1.age);
	    System.out.println(s2.name +"  " + s2.age);
	    System.out.println("********************");
		test2(s1,s2);
		System.out.println(s1.name+" " + s1.age);
	    System.out.println(s2.name +"  " + s2.age);
	}
	private static void test1(Student s1, Student s2) {
		Student t = s1;
		s1= s2;
		s2= t;
	}
	public static void test2(Student s1, Student s2) {
		s2 = new Student();
		int tempa = s1.age;
		s1.age = s2.age;
		s2.age = tempa;
		s1 = new Student();
		String tempn = s1.name;
		s1.name = s2.name;
		s2.name = tempn;
	}
	
	
	
}
