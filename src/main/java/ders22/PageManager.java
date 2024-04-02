package ders22;


public class PageManager {
    public WebTablesPage webTablesPage;

    public ElementsPage elementsPage;

    public PageManager() {

        DriverFactory.initDriver();

        webTablesPage = PageFactory.buildWebTablesPage();
        elementsPage = PageFactory.buildElementsPage();

    }
}