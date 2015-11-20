package Test;

import org.junit.Test;

import Pages.MainPage;

public class TestMainPage extends TestBaseSetup{
	
	@Test
	
	public void test_mainPage () {
		
		MainPage onMainPage = new MainPage(driver);
		onMainPage.navigateToMainPage();
		onMainPage.clickOnONama();
		onMainPage.clickOnNaslovna();
		onMainPage.clickOnPisiteNam();
		onMainPage.clickOnCicaSavetnica();
		onMainPage.clickOnPsiholog();
		onMainPage.clickOnKozmetika();
		onMainPage.clickOnKozmetikaNegaLicaiTela();
		onMainPage.clickOnKozmetikaKosa();
		onMainPage.clickOnKozmetikaNokti();
		onMainPage.clickOnKuhinjica();
		onMainPage.clickOnKuhinjicaSlanisi();
		onMainPage.clickOnKuhinjicaSlatkisi();
		onMainPage.clickOnModa();
		onMainPage.clickOnModaIzMogOrmara();
		onMainPage.clickOnMojaBeba();
		onMainPage.clickOnZdravlje();
		onMainPage.clickOnZdravljeMedicina();
		onMainPage.clickOnZdravljeRekreacija();
		onMainPage.clickOnMotivacija();
		onMainPage.clickOnPutovanja();
		onMainPage.clickOnRazgovori();
		onMainPage.clickOnKuca();
		onMainPage.clickOnRazonoda();
		onMainPage.clickOnRazonodaFilmovi();
		onMainPage.clickOnRazonodaKnjige();
		onMainPage.clickOnRazonodaUspesnaZena();
		onMainPage.clickOnUradiSama();
		
		
		
	}

}
