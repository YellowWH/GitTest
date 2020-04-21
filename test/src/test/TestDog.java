package test;

class Animal{
	public void move(){
		System.out.println("an can move");
	}
	Animal(){
		System.out.println("SuperClass()");
	}
}
	 
class Dog extends Animal{
	public void move(){
		System.out.println("dog can move and run");
	}
}
	 
public class TestDog{
	public static void main(String args[]){
	Animal a = new Animal(); //
	Animal b = new Dog(); //
	 
	a.move();//
	 
	b.move();//
	}
}