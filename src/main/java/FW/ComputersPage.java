package FW;

import FW.Locators.ComputersPageLocators;

public class ComputersPage extends BaseFW{
    private ComputersPageLocators locators = new ComputersPageLocators();

    public ComputersPage(APmanager manager) {
        super(manager);
    }

    public void goToLaptopsLeftMenu() {
        driver.findElementByXPath(locators.laptopsLeftMenu).click();
    }

    public void goToTabletsLeftMenu() {
        driver.findElementByXPath(locators.tabletsLeftMenu).click();
    }
}
