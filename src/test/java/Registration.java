
import AppInfo.UserInfo;
import PageObject.FirstPage;
import PageObject.MainPage;
import PageObject.SecondPage;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Registration {

    private UserInfo data = new UserInfo();

    @Test
    public void registration() throws InterruptedException {

        System.setProperty(data.nameDriver, data.pathDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.get(data.domUrl);

        driver.manage().window().maximize();

        (new MainPage(driver)).clickSignIn();
        (new FirstPage(driver)).firstRegistration();
        Thread.sleep(5000);
        (new SecondPage(driver)).secondRegistration();

    }


}

