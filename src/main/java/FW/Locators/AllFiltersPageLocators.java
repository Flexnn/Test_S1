package FW.Locators;

public class AllFiltersPageLocators {
    public String showSuitable = "//a/span[contains(text(),'Показать подходящие')]/..";
    public String setTopPriceValue = "//*[@id=\"glf-priceto-var\"]";
    public String setLowerPriceValue = "//*[@id=\"glf-pricefrom-var\"]";
    // Производитель
    public String Manufacturer = "//div[@data-filter-id='7893318']";
    public String buttonShowAll= Manufacturer + "//span[contains(text(),'Показать всё')]/..";
    public String inputEntryField = Manufacturer + "//input[@class=\"input__control\"]";
    public String buttonCollapse = Manufacturer + "//span[contains(text(),'Свернуть')]/..";
}
