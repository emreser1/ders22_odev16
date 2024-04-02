package ders22;


public class PageFactory {

    public static WebTablesPage buildWebTablesPage() {

        return new WebTablesPage("/webtables");
    }

    public static ElementsPage buildElementsPage() {
        return new ElementsPage("/elements");
    }
}