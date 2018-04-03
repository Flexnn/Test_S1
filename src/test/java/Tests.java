import org.testng.annotations.Test;

public class Tests extends TestBase{

    @Test
    public void Test1() throws InterruptedException {
        //3. Перейти в яндекс маркет
        app.market.goToMarket();
        //4. Выбрать раздел Компьютеры
        app.market.goToComputers();
        //5. Выбрать раздел Ноутбуки
        app.computers.goToLaptopsLeftMenu();
        //6. Зайти в расширенный поиск
        app.catalog.goToFilters();
        //7. Задать параметр поиска до 30000 рублей.
        app.allFilters.setTopPriceValue("30000");
        //8. Выбрать производителя HP и Lenovo
        app.allFilters.setCheckbox(this.groupdata.nameHP, true);
        app.allFilters.setCheckbox(this.groupdata.nameLenovo, true);
        //9. Нажать кнопку Применить.
        app.allFilters.showSuitable();
        //10. Проверить, что элементов на странице 10.
        assert (app.catalog.getNumberProductsOnPage() > 10);
        //11. Запомнить первый элемент в списке.
        String nameOfTheFirstElement = app.catalog.getNameOfTheProduct(1);
        //12. В поисковую строку ввести запомненное значение.
        app.catalog.setSearchString(nameOfTheFirstElement);
        //13. Найти
        app.catalog.search();
        //14 проверить, что наименование товара соответствует запомненному значению.
        assert (app.product.getProductTitle().contains(nameOfTheFirstElement));

    }

    @Test
    public void Test2() throws InterruptedException {
//        3. Перейти в яндекс маркет
        app.market.goToMarket();
//        4. Выбрать раздел  Компьютеры
        app.market.goToComputers();
//        5. Выбрать раздел Планшеты
        app.computers.goToTabletsLeftMenu();
//        6. Зайти в расширенный поиск
        app.catalog.goToFilters();
//        7. Задать параметр поиска от 20000 рублей.
        app.allFilters.setLowerPriceValue("20000");
//        8. Задать параметр поиска до 25000 рублей.
        app.allFilters.setTopPriceValue("25000");
//        9. Выбрать производителей Acer и DELL
        app.allFilters.setCheckbox(this.groupdata.nameAcer, true);
        app.allFilters.setCheckbox(this.groupdata.nameDELL, true);
//        10. Нажать кнопку Применить.
        app.allFilters.showSuitable();
//        11. Проверить, что элементов на странице 10.
//        Проверка не пройдет т.к. на странице меньше 10 элементов
        assert (app.catalog.getNumberProductsOnPage() > 10);
//        12. Запомнить первый элемент в списке.
        String nameOfTheFirstElement = app.catalog.getNameOfTheProduct(1);
//        13. В поисковую строку ввести запомненное значение.
        app.catalog.setSearchString(nameOfTheFirstElement);
//        14. Найти
        app.catalog.search();
//        Проверить, что наименование товара соответствует запомненному значению.
        assert (app.product.getProductTitle().contains(nameOfTheFirstElement));
    }

}
