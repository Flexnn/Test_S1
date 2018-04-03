package FW;

import FW.Locators.MarketPageLocators;

public class MarketPage extends BaseFW {
    private MarketPageLocators locators = new MarketPageLocators();

    public MarketPage(APmanager manager) {
        super(manager);
    }

    public void goToMarket() {
        manager.wait.elementToBeClickable(locators.Market);
        driver.findElementByXPath(locators.Market).click();
    }

    public void goToComputers() {
        manager.wait.elementToBeClickable(locators.computers);
        driver.findElementByXPath(locators.computers).click();
    }
}
