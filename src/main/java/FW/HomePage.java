package FW;

public class HomePage extends BaseFW{

    public HomePage(APmanager manager) {
        super(manager);
    }

    public void getHomePage(String homePage)
    {
         this.driver.get(homePage);
    }
}
