package config;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseTest{
     
		public WebDriver driver;
		
		@BeforeClass
		public void initChromeBrowser() {
			
		    System.setProperty("webdriver.chrome.driver", Paths.get("").toAbsolutePath() + "/src/main/java/webdriver/chromedriver.exe");
		
			Reporter.log("Browser Session Started", true);
			
	        driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
		}
		
		@AfterClass
		public void closeSession()
		{
			driver.quit();
			
			Reporter.log("Browser Session End", true);
		}
		
@AfterMethod
public void getScreenshot(ITestResult result) throws IOException{

if (ITestResult.FAILURE==result.getStatus())
{
	try {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        //The below method will save the screen shot in destination directory with name "screenshot.png"
         FileHandler.copy(scrFile, new File("C:\\\\Users\\\\yair-f\\\\yair-f\\\\tests-screenshots\\\\screenshot.png"));
         
         System.out.println("Placed screen shot in "+scrFile );
     } 
	catch (IOException e) {
         e.printStackTrace();
   
           }
	
       }

    }
}
