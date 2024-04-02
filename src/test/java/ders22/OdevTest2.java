package ders22;

import org.Ders22_Odev.common.PageManager;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

class OdevTest2 {
	PageManager pageManager = new PageManager();

	@BeforeSuite
	public void before() {
		pageManager.webTablesPage.openWebTables();
	}

	@Test(priority = 1)
	public void addClick() {
		pageManager.webTablesPage.addButtonClick.click();
	}

	@Test(priority = 2)
	public void nameDoldur() {
		pageManager.webTablesPage.nameFill.click();
		pageManager.webTablesPage.nameFill.setValue("Emre");
	}

	@Test(priority = 3)
	public void surNameDoldur() {
		pageManager.webTablesPage.surNameFill.click();
		pageManager.webTablesPage.surNameFill.setValue("Eser");
	}

	@Test(priority = 4)
	public void emailuDoldur() {
		pageManager.webTablesPage.emailFill.click();
		pageManager.webTablesPage.emailFill.setValue("emre.eser@sebit.com.tr");
	}

	@Test(priority = 5)
	public void ageDoldur() {
		pageManager.webTablesPage.ageFill.click();
		pageManager.webTablesPage.ageFill.setValue("28");
	}

	@Test(priority = 6)
	public void salaryDoldur() {
		pageManager.webTablesPage.salaryFill.click();
		pageManager.webTablesPage.salaryFill.setValue("34000");
	}

	@Test(priority = 7)
	public void departmentDoldur() {
		pageManager.webTablesPage.departmentFill.click();
		pageManager.webTablesPage.departmentFill.setValue("IT");
	}

	@Test(priority = 8)
	public void submit() {
		pageManager.webTablesPage.submitClick.click();
	}

	@Test(priority = 9)
	public void duzenleClick() {
		pageManager.webTablesPage.edit.click();
	}

	@Test(priority = 10)
	public void duzenleyas() {
		pageManager.webTablesPage.ageFill.click();
		pageManager.webTablesPage.ageFill.clear();
		pageManager.webTablesPage.ageFill.type("26");
	}

	@Test(priority = 11)
	public void submitAge() {
		pageManager.webTablesPage.submitClick.click();
		String ageText = pageManager.webTablesPage.newAge.getText();
		Assertions.assertThat(ageText).isEqualTo("26");
	}
}
