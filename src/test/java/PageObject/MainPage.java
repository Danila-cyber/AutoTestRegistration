package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainPage {
    private ChromeDriver driver;
    public MainPage(ChromeDriver paramDriver) {
        driver = paramDriver;
    }
    private final By btnSignIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    public void clickSignIn() {
        driver.findElement(btnSignIn).click();
    }
}
