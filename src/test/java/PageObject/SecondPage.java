package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondPage {
    AppData data = new AppData();

    private ChromeDriver driver;
    public SecondPage(ChromeDriver paramDriver) {
        driver = paramDriver;
    }
    private final By radioBtnGender = By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[1]/label");
    private final By inputFirstName = By.id("customer_firstname");
    private final By inputLastName = By.id("customer_lastname");
    private final By inputPassword = By.id("passwd");

    private final By inputAddressFirstName = By.id("firstname");
    private final By inputAddressLastName = By.id("lastname");
    private final By inputAddressCompanyName = By.id("address1");
    private final By inputAddressCity = By.id("city");
    private final By selectAddressState = By.id("id_state");
    private final By inputAddressPostalCode = By.id("postcode");
    private final By selectAddressCountry = By.id("id_country");
    private final By inputPhone = By.id("phone_mobile");
    private final By btnFinish = By.id("submitAccount");

    public void secondRegistration() {
        driver.findElement(radioBtnGender).click();
        setValueAttribute(driver, inputFirstName, data.FirstName);
        setValueAttribute(driver, inputLastName, data.LastName);
        setValueAttribute(driver, inputPassword, data.Password);

        setValueAttribute(driver, inputAddressFirstName, data.FirstName);
        setValueAttribute(driver, inputAddressLastName, data.LastName);
        setValueAttribute(driver, inputAddressCompanyName, data.CompanyName);
        setValueAttribute(driver, inputAddressCity, data.City);
        setSelectValue(driver, selectAddressState, "1");
        setValueAttribute(driver, inputAddressPostalCode,data.PostalCode);
        setSelectValue(driver, selectAddressCountry, "21");
        setValueAttribute(driver, inputPhone, data.Phone);
        driver.findElement(btnFinish).click();
    }

    private void setSelectValue(ChromeDriver paramDriver, By locator, String value) {
        WebElement elem = paramDriver.findElement(locator);
        Select SelectElem = new Select(elem);
        SelectElem.selectByValue(value);
    }

    private void setValueAttribute(ChromeDriver paramDriver, By locator, String valueAtr){
        JavascriptExecutor js = (JavascriptExecutor) paramDriver;
        WebElement elem = paramDriver.findElement(locator);
        js.executeScript("arguments[0].setAttribute('" + "value" + "', '" + valueAtr + "');", elem);
    }
}
