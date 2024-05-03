package UI_Testing;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		String xpath_current_pop = "//div[@class='maincounter-number']/span[@class='rts-counter']";
		String xpath_today_thisYear_pop = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";
		driver = new ChromeDriver();

		driver.get("https://www.worldometers.info/world-population/");
		int count = 1;
		while (count <= 20) {
			System.out.println(count + " sec");
			if (count == 21)
				break;
			System.out.println("current population count");
			printPopulationData(xpath_current_pop);
			System.out.println("Today and This Year population count");
			printPopulationData(xpath_today_thisYear_pop);
			Thread.sleep(1000);
			count++;

		}
	}

	public static void printPopulationData(String locator) {
			List<WebElement> List = driver.findElements(By.xpath(locator));
			for (WebElement e : List) {
			System.out.println(e.getText());
	}
 }
}
