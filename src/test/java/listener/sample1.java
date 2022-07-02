package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample1 {
			
		@Test
		public void sample() {
			System.out.println("Iam Sample");
			Assert.assertTrue(true);
		}
		
		@Test
		public void sample1() {
			System.out.println("Iam Sample1");
			Assert.assertTrue(false);
		}
	}

	

