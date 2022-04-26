
import PageObject.AppData;
import PageObject.FirstPage;
import PageObject.MainPage;
import PageObject.SecondPage;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Registration extends AppData {

    @Test
    public void registration() throws InterruptedException {
        AppData Data = new AppData();

        System.setProperty(Data.NameDriver, Data.PathDriver);
        ChromeDriver driver = new ChromeDriver();
        driver.get(Data.DomURL);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        (new MainPage(driver)).clickSignIn();
        (new FirstPage(driver)).firstRegistration();
        (new SecondPage(driver)).secondRegistration();

    }


}

