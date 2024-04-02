package ders22;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WebTablesPage extends BasePage {
    public SelenideElement addButtonClick = $("#addNewRecordButton");
    public SelenideElement nameFill = $("#firstName");
    public SelenideElement surNameFill = $("#lastName");
    public SelenideElement emailFill = $("#userEmail");
    public SelenideElement ageFill = $("#age");
    public SelenideElement salaryFill = $("#salary");
    public SelenideElement departmentFill = $("#department");
    public SelenideElement submitClick = $("#submit");
    public SelenideElement edit = $("span#edit-record-4");
    public SelenideElement newAge = $("div.rt-table > div.rt-tbody > div:nth-child(4) > div > div:nth-child(3)");
    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }
}