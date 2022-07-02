package parallel;

import org.testng.annotations.Test;

public class Parallel1 {
	
	@Test
	public void test() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test");
	}
	
	@Test
	public void test1() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test1");
	}

	@Test
	public void test2() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test3");
	}
	
	@Test
	public void test4() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test4");
	}
	
	@Test
	public void test5() {
		System.out.println("Thread ID "+ Thread.currentThread().getId());
		System.out.println("test5");
	}
	
}
