package FW;

import FW.Locators.ComputersPageLocators;

public class ComputersPage extends BaseFW{
    private ComputersPageLocators locators = new ComputersPageLocators();

    public ComputersPage(APmanager manager) {
        super(manager);
    }

    public void goToLaptopsLeftMenu() {
        manager.wait.elementToBeClickable(locators.laptopsLeftMenu);
        driver.findElementByXPath(locators.laptopsLeftMenu).click();
    }

    public void goToTabletsLeftMenu() {
        manager.wait.elementToBeClickable(locators.tabletsLeftMenu);
        driver.findElementByXPath(locators.tabletsLeftMenu).click();
    }
}
