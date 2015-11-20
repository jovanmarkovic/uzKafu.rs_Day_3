package Test;

import org.junit.Test;

import Pages.NaslovnaPage;

public class TestNaslovnaPage extends TestBaseSetup {
	
@Test
	
	public void test_mainPage () throws InterruptedException {
		
		NaslovnaPage onNaslovnaPage = new NaslovnaPage(driver);
		onNaslovnaPage.navigateToMainPage();
		onNaslovnaPage.search();
		onNaslovnaPage.clickOnJakeiGusteObrveSide();
		onNaslovnaPage.clickOnModa();
		onNaslovnaPage.clickOnMojaBeba();
		onNaslovnaPage.clickOnKozmetika();
		onNaslovnaPage.clickOnZdravlje();
		onNaslovnaPage.clickOnKuhinjica();
		onNaslovnaPage.clickOnPutovanja();
		onNaslovnaPage.clickOnintervju();
		onNaslovnaPage.clickOnUradiSama();
		onNaslovnaPage.clickOnKuca();
		onNaslovnaPage.clickOnZivot();
		onNaslovnaPage.clickOnFeed();


	}

}
