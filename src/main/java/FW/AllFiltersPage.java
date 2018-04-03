package FW;

import FW.Locators.AllFiltersPageLocators;

import java.util.concurrent.TimeUnit;

public class AllFiltersPage extends BaseFW{
    private AllFiltersPageLocators locators = new AllFiltersPageLocators();

    public AllFiltersPage(APmanager manager) {
        super(manager);
    }

    public void showSuitable() {
        driver.findElementByXPath(locators.showSuitable).click();
    }

    public void setTopPriceValue(String priceValue) {
        manager.wait.visibilityOfElementLocated(locators.setTopPriceValue);
        driver.findElementByXPath(locators.setTopPriceValue).sendKeys(priceValue);
    }

    public void setLowerPriceValue(String priceValue) {
        manager.wait.visibilityOfElementLocated(locators.setLowerPriceValue);
        driver.findElementByXPath(locators.setLowerPriceValue).sendKeys(priceValue);
    }

    public void setCheckbox(String label, Boolean checkbox) throws InterruptedException {
        manager.wait.elementToBeClickable(locators.buttonShowAll);
        driver.findElementByXPath(locators.buttonShowAll).click();

        manager.wait.visibilityOfElementLocated(locators.inputEntryField);

        driver.findElementByXPath(locators.inputEntryField).clear();
        driver.findElementByXPath(locators.inputEntryField).sendKeys(label);

        // задержка на отработку анимации
        TimeUnit.MILLISECONDS.sleep(250);
        //Формируем локатор
        String locatorCheckCheckbox = locators.checkCheckbox(label);

        manager.wait.elementToBeClickable(locatorCheckCheckbox);
        String checkCheckbox = driver.findElementByXPath(locatorCheckCheckbox).getAttribute("class");
        if (checkCheckbox.contains("checkbox_checked_yes") != checkbox)
        {
            driver.findElementByXPath(locatorCheckCheckbox).click();
        }
        driver.findElementByXPath(locators.buttonCollapse).click();
    }
}
