
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration extends UserInfo {

    private final By BtnSignIn = By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a");
    private final By InputEmail = By.id("email_create");
    private final By BtnRegistration = By.id("SubmitCreate");

    private final By RadioBtnGender = By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]/label");
    private final By InputFirstName = By.id("customer_firstname");
    private final By InputLastName = By.id("customer_lastname");
    private final By InputPassword = By.id("passwd");

    private final By InputAdressFirstName = By.id("firstname");
    private final By InputAdressLastName = By.id("lastname");
    private final By InputAdressCompanyName = By.id("address1");
    private final By InputAdressCity = By.id("city");
    private final By SelectAdressState = By.id("id_state");
    private final By InputAdressPostalCode = By.id("postcode");
    private final By SelectAdressCountry = By.id("id_country");
    private final By InputPhone = By.id("phone_mobile");
    private final By BtnFinish = By.id("submitAccount");

    @Test
    public void registration() throws InterruptedException {
        UserInfo Data = new UserInfo();

        System.setProperty("webdriver.chrome.driver","D:\\tools\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get(Data.DomURL);

        driver.manage().window().maximize();
        driver.findElement(BtnSignIn).click();
        driver.findElement(InputEmail).sendKeys(Data.Email);
        driver.findElement(BtnRegistration).click();

        Thread.sleep(5000);
        driver.findElement(RadioBtnGender).click();
        setValueAttribute(driver, InputFirstName, Data.FirstName);
        setValueAttribute(driver, InputLastName, Data.LastName);
        setValueAttribute(driver, InputPassword, Data.Password);

        setValueAttribute(driver, InputAdressFirstName, Data.FirstName);
        setValueAttribute(driver, InputAdressLastName, Data.LastName);
        setValueAttribute(driver, InputAdressCompanyName, Data.CompanyName);
        setValueAttribute(driver, InputAdressCity, Data.City);
        setSelectValue(driver, SelectAdressState, "1");
        setValueAttribute(driver, InputAdressPostalCode,Data.PostalCode);
        setSelectValue(driver, SelectAdressCountry, "21");
        setValueAttribute(driver, InputPhone, Data.Phone);
        driver.findElement(BtnFinish).click();
    }

    private void setSelectValue(ChromeDriver driv, By locator, String value) {
        WebElement Elem = driv.findElement(locator);
        Select SelectElem = new Select(Elem);
        SelectElem.selectByValue(value);
    }

    private void setValueAttribute(ChromeDriver driv, By locator, String valueAtr){
        JavascriptExecutor js = (JavascriptExecutor) driv;
        WebElement elem = driv.findElement(locator);
        js.executeScript("arguments[0].setAttribute('" + "value" + "', '" + valueAtr + "');", elem);
    }
}

