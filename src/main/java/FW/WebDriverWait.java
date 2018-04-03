package FW;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class WebDriverWait extends BaseFW {


    public WebDriverWait(APmanager manager) {
        super(manager);
    }

    public void elementToBeClickable(String locator)
    {
        new org.openqa.selenium.support.ui.WebDriverWait(driver, 30).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void invisibilityOfElementLocated(String locator)
    {
        new org.openqa.selenium.support.ui.WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }

    public void visibilityOfElementLocated(String locator)
    {
        new org.openqa.selenium.support.ui.WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public void implicitlyWait()
    {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
}
