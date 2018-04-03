package FW;

import FW.Locators.MarketPageLocators;

public class MarketPage extends BaseFW {
    private MarketPageLocators locators = new MarketPageLocators();

    public MarketPage(APmanager manager) {
        super(manager);
    }

    public void goToMarket() {
        driver.findElementByXPath(locators.Market).click();
    }

    public void goToComputers() {
        driver.findElementByXPath(locators.computers).click();
    }
}
