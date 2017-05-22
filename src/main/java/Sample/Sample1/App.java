package Sample.Sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.firefox.marionette", "E://Selenium//geckodriver.exe");
    	WebDriver driver=new FirefoxDriver();
    	driver.get("https://www.google.co.in/");
        System.out.println( "Hello World!" );
    }
}
