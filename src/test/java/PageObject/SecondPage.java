package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SecondPage extends BasePage {

    private ChromeDriver driver;

    private final By radioBtnGender = By.cssSelector("#account-creation_form > div:nth-child(1) > div.clearfix > div:nth-child(3) > label");
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

    public SecondPage(ChromeDriver paramDriver) {
        super(paramDriver);
        driver = paramDriver;
    }

    public void secondRegistration() {
        driver.findElement(radioBtnGender).click();
        setValueAttribute(driver, inputFirstName, data.firstName);
        setValueAttribute(driver, inputLastName, data.lastName);
        setValueAttribute(driver, inputPassword, data.password);

        setValueAttribute(driver, inputAddressFirstName, data.firstName);
        setValueAttribute(driver, inputAddressLastName, data.lastName);
        setValueAttribute(driver, inputAddressCompanyName, data.companyName);
        setValueAttribute(driver, inputAddressCity, data.city);
        setSelectValue(driver, selectAddressState, data.numberState);
        setValueAttribute(driver, inputAddressPostalCode,data.postalCode);
        setSelectValue(driver, selectAddressCountry, data.numberCountry);
        setValueAttribute(driver, inputPhone, data.phone);
        driver.findElement(btnFinish).click();

    }

    private void setSelectValue(ChromeDriver paramDriver, By locator, String value) {
        WebElement elem = paramDriver.findElement(locator);
        Select selectElem = new Select(elem);
        selectElem.selectByValue(value);
    }

    private void setValueAttribute(ChromeDriver paramDriver, By locator, String valueAtr){
        JavascriptExecutor js = (JavascriptExecutor) paramDriver;
        WebElement elem = paramDriver.findElement(locator);
        js.executeScript("arguments[0].setAttribute('" + "value" + "', '" + valueAtr + "');", elem);
    }
}
