    package config;
    import org.testng.ITestContext ;		
    import org.testng.ITestListener ;		
    import org.testng.ITestResult ;		

    public class Listener implements ITestListener						
    {
	    // When Test case get Started, this method is called.		

		public void onTestStart(ITestResult result) {
		    System.out.println("tests cases started and details are :"+result.getName());					
	
		}
	    // When Test case success , this method is called.		

		public void onTestSuccess(ITestResult result) {
		    System.out.println("tests cases passed and details are :"+result.getName());					
	
		}
	    // When Test case get failed, this method is called.		

		public void onTestFailure(ITestResult result) {
			
		    System.out.println("tests cases failed and details are :"+result.getName());					
	
		}
	    // When Test case get Skipped, this method is called.		

		public void onTestSkipped(ITestResult result) {
		    System.out.println("tests cases skipped and details are :"+result.getName());					

         }
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
			
		}
		public void onStart(ITestContext context) {
			
		}
		public void onFinish(ITestContext context) {
			
		}
    }
