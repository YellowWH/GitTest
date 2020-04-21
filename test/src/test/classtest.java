package test;

public class classtest{
	public static void main(String args[]) {
		System.out.println("------SubClass ------");
	    SubClass1 sc1 = new SubClass1();
	    System.out.println("------------");
	    SubClass1 sc2 = new SubClass1(100); 
	    System.out.println("------SubClass2 ------");
	    SubClass2 sc3 = new SubClass2();
	    System.out.println("------------");
	    SubClass2 sc4 = new SubClass2(200); 
	}
}

class SuperClass{
	private int n;
	SuperClass(){
		System.out.println("SuperClass()");
	}
	SuperClass(int n){
		System.out.println("SuperClass(int n)" + n);
		this.n = n;
	}
	public void superClassTest(int n) {
		System.out.println("SuperClassTest(int n)" + n);
	}
}
class SubClass1 extends SuperClass{
	private int n;
	
	SubClass1(){
		super(300);
		System.out.println("SubClass1");
	}
	
	public SubClass1(int n) {
		super.superClassTest(300);
		
//		super(300);
		System.out.println("SubClass1(int n)" + n);
		this.n=n;
	}

}

class SubClass2 extends SuperClass{
	private int n;
	
	SubClass2(){
		super(300);
		System.out.println("SubClass2");
	}
	
	public SubClass2(int n) {
		System.out.println("SubClass2(int n )"+n);
		this.n=n;
	}
}