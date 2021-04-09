package Login_Validations.Facebook;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginValidaitons {
	
	
	            public static void launchBrowser() {
	            	 try {
	            		  String propval = "webdriver.chrome.driver";
	            		  String driverpath = "C:\\Users\\User\\eclipse-workspace\\Facebook\\chromedriver.exe";	            		
	            		  System.setProperty(propval, driverpath);
	            		  WebDriver driver = new ChromeDriver();
	            		  driver.get("https://facebook.com");
	            		  driver.manage().window().maximize();
	            		  Thread.sleep(2500);
	            		  driver.findElement(By.id("email")).click();
	            		  driver.findElement(By.id("email")).clear();
	            		  driver.findElement(By.id("email")).sendKeys("8008508148");	            		 
	            		  driver.findElement(By.id("pass")).click();
	            		  driver.findElement(By.id("pass")).clear();
	            		  driver.findElement(By.id("pass")).sendKeys("8008508148");
	            		  System.out.println("Task Completed"); 
	            	 }
	            	 catch(Exception E) {
	            		 E.printStackTrace();
	            	 }
	            }

}
