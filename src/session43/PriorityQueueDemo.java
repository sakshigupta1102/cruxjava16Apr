package session43;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
		pq.add(90);
		pq.add(77);
		pq.add(2);
		pq.add(50);
		pq.add(100);
		pq.add(22);
//		while(!pq.isEmpty()){
//			System.out.println(pq.remove());
//		}
		PriorityQueue<Student> spq = new PriorityQueue(new Studentcomp());
		spq.add(new Student(5, 50));
		spq.add(new Student(2, 20));
		spq.add(new Student(4, 40));
		spq.add(new Student(9, 90));
		while(!spq.isEmpty()){
			System.out.println(spq.remove());
		}
		
	}
}
class Student{
	int age;
	int marks;
	public Student(int age, int marks) {
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", marks=" + marks + "]";
	}
	
	
}
class Studentcomp implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.age- o2.age;
	}
	
}
