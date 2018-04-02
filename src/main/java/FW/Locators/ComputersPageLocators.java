package FW.Locators;

public class ComputersPageLocators {
    public String leftMenu = "//div[@class=\"catalog-menu__list\"]";
    public String laptopsLeftMenu = leftMenu + "/a[contains(text(),'Ноутбуки')]";
    public String tabletsLeftMenu = leftMenu + "/a[contains(text(),'Планшеты')]";
}
