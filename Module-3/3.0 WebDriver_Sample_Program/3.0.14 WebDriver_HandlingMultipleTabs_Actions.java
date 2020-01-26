//Switch between two tabs using Actions-
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tab_Handle_Actions {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.stqatools.com");

		Actions action = new Actions(driver);

		// Switch to Second Tab
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();

		// Switch to First Tab
		action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();

	}

}
