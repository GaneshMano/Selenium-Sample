package parallel;

import org.testng.annotations.Test;

public class Parallel2 {
	
	@Test
	public void test6() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test6");
	}
	
	@Test
	public void test7() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test7");
	}

	@Test
	public void test8() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test8");
	}
	
	@Test
	public void test9() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test9");
	}
	
	@Test
	public void test10() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test10");
	}
	
	@Test
	public void test11() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test11");
	}
	
}
