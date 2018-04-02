package FW;

import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BaseFW {

    protected APmanager manager;
    public ChromeDriver driver;

    public BaseFW (APmanager manager)
    {
        this.manager = manager;
        this.driver = manager.driver;
    }



}
