package FW;


import org.openqa.selenium.chrome.ChromeDriver;

public class APmanager {

    public MarketPage market;
    public ComputersPage computers;
    public CatalogPage catalog;
    public ProductPage product;
    public AllFiltersPage allFilters;
    public HomePage home;
    public ChromeDriver driver;
    public WebDriverWait wait;


    public APmanager(){

        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();

        market = new MarketPage(this);
        computers = new ComputersPage(this);
        catalog = new CatalogPage(this);
        product = new ProductPage(this);
        allFilters = new AllFiltersPage(this);
        home = new HomePage(this);
        wait = new WebDriverWait(this);
    }




    public void quitDriver()
    {
        this.driver.quit();
    }


}
