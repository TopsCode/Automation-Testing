//switch between two tabs using switchTo() method-
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tab_Handle_SwitchTo {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.stqatools.com");

		// Store all currently open tabs in tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());

		// Click on link to open in new tab
		driver.findElement(By.id("Url_Link")).click();

		// Switch newly open Tab
		driver.switchTo().window(tabs.get(1));

		// Perform some operation on Newly open tab
		// Close newly open tab after performing some operations.
		driver.close();

		// Switch to old(Parent) tab.
		driver.switchTo().window(tabs.get(0));

	}

}
