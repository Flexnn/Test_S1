package FW;

import FW.Locators.CatalogPageLocators;

public class CatalogPage extends BaseFW {
    private CatalogPageLocators locators = new CatalogPageLocators();


    public CatalogPage(APmanager manager) {
        super(manager);
    }

    public int getNumberProductsOnPage(){
        //10. Проверить, что элементов на странице 10.
        try {
            return driver.findElementsByXPath(locators.getNumberProductsOnPage).size();
        }
        catch(Exception e) {
            return -1;
        }
    }

    public void goToFilters() {
        driver.findElementByXPath(locators.goToFilters).click();
    }

    public void search()
    {
        driver.findElementByXPath(locators.buttonSearch).click();
    }

    public void setSearchString(String searchString)
    {
        driver.findElementByXPath(locators.searchString).sendKeys(searchString);
    }

    public String getNameOfTheProduct(int number)
    {
        return driver.findElementByXPath(locators.getNumberProductsOnPage + "[" + number + "]" + locators.nameOfTheProductPart2).getText();
    }
}
