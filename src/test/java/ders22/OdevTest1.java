package ders22;

import static org.assertj.core.api.Assertions.assertThat;

import org.Ders22_Odev.common.PageManager;
import org.junit.jupiter.api.Test;
import org.testng.annotations.BeforeMethod;


class OdevTest1 {
	PageManager pageManager = new PageManager();

	@BeforeMethod
	public void before() {
		pageManager.elementsPage.open();
	}

	@Test
	public void buttonsClick() {
		pageManager.elementsPage.buttonsClick.click();
		pageManager.elementsPage.clickMeClick.click();
		String text = pageManager.elementsPage.clickMeText.getText();
		assertThat(text).isEqualTo("dynamic clicked");
	}
}
