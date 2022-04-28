package PageObject;

import AppInfo.UserInfo;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    UserInfo data = new UserInfo();

    private ChromeDriver driver;
    public BasePage(ChromeDriver paramDriver) {
        driver = paramDriver;
    }
}
