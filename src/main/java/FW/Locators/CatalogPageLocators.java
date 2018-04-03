package FW.Locators;

public class CatalogPageLocators {
    public String searchString = "//input[@id=\"header-search\"]";
    public String getNumberProductsOnPage = "//div[@data-id]";
    public String goToFilters = "//*[@id=\"search-prepack\"]//a[contains(text(),'Перейти ко всем фильтрам')]";
    public String buttonSearch = "//input[@id=\"header-search\"]/../../../../span/button";

    public String nameOfTheProductPart(String number){
        return getNumberProductsOnPage + "[" + number + "]/div[4]/div/div/a";

    }

}
