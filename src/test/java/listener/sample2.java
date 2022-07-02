package listener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class sample2 {
			
		@Test(retryAnalyzer = Retry.class)
		public void sample() {
			System.out.println("Iam Sample");
			Assert.assertTrue(true);
			System.out.println("Iam Pass");
		}
		
		@Test(retryAnalyzer = Retry.class)
		public void sample1() {
			System.out.println("Iam Sample1");
			Assert.assertTrue(false);
		}
	}

	

