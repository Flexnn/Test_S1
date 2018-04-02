package FW;

import FW.Locators.ProductPageLocators;

public class ProductPage extends BaseFW{
    private ProductPageLocators locators = new ProductPageLocators();

    public ProductPage(APmanager manager) {
        super(manager);
    }

    public String getProductTitle()
    {
        return driver.findElementByXPath(locators.productTitle).getText();
    }
}
