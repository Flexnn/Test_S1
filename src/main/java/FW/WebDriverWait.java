package FW;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebDriverWait extends BaseFW {


    public WebDriverWait(APmanager manager) {
        super(manager);
    }

    public void elementToBeClickable(String locator)
    {
        new org.openqa.selenium.support.ui.WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath(locator)));
    }

    public void invisibilityOfElementLocated(String locator)
    {
        new org.openqa.selenium.support.ui.WebDriverWait(driver, 30).until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
    }

    public void visibilityOfElementLocated(String locator)
    {
        new org.openqa.selenium.support.ui.WebDriverWait(driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
}
