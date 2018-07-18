package mavDemPak;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterTest;

public class MavDemC {
  @Test
  public void f() {
	  
	// TODO Auto-generated method stub
	   System.out.println( "Ave Maria Praise the Lord!" );
	   
	   System.out.println( "Ave Maria Praise the Lord Lead us HOLY SPIRIT!" );


	 	System.setProperty("webdriver.gecko.driver","C:\\Users\\vt.jessie\\JES\\SELENIUM\\geckodriver.exe");

//	 	System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
//	 	System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"D:\\JES\\SELENIUM\\tmp\\logs.txt");
	 	
	 	//Set Firefox Headless mode as TRUE
		FirefoxOptions options = new FirefoxOptions();
		options.setHeadless(true);
/*		
	 	
	 	ProfilesIni profile = new ProfilesIni();
	 	
	 	FirefoxProfile myPro = profile.getProfile("default");
	 	
	 	DesiredCapabilities dc =DesiredCapabilities.firefox();
	 	
	 	dc.setCapability(FirefoxDriver.PROFILE, "default");
	 	dc.setCapability("marionette", true);
*/	 	
	 	WebDriver driver = new FirefoxDriver( );
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
   	
       String baseUrl = "http://demo.guru99.com/test/newtours/";
       String expectedTitle = "Welcome: Mercury Tours";
       String actualTitle = "";

       // launch Fire fox and direct it to the Base URL
       driver.get(baseUrl);

       // get the actual value of the title
       actualTitle = driver.getTitle();

       /*
        * compare the actual title of the page with the expected one and print
        * the result as "Passed" or "Failed"
        */
       if (actualTitle.contentEquals(expectedTitle)){
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed");
       }
      
       //close Fire fox
        driver.close();
      
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
