package parallel;

public class MultiThreading {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		a.test1();
		b.start();
	}

}

class A {

	public void test1() {
		System.out.println("Thread Id " +Thread.currentThread().getId());
		for (int i = 0; i <= 3; i++) {
			System.out.println("A class  " + i);

		}
	}
}

class B extends Thread{	
	// run() and start() 
	public void run() {
		System.out.println("Thread Id " + Thread.currentThread().getId());
		for (int i = 0; i <= 3; i++) {
			System.out.println("B class  " +i);

		}
	}


}
