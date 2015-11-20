package Test;

import org.junit.Test;

import Pages.ONamaPage;

public class TestONamaPage extends TestBaseSetup{
	
@Test
	
	public void test_mainPage () throws InterruptedException {
		
		ONamaPage onONamaPage = new ONamaPage(driver);
		onONamaPage.navigateToMainPage();
		onONamaPage.navigateToONamaPage();
		onONamaPage.checkImagePresence();
		onONamaPage.checkAnaZdravkovicBabicProfile();
		onONamaPage.checkMarijaBogdanovicProfile();
		onONamaPage.checkMarinaDimitrijevicProfile();
		onONamaPage.checkJovanaIvanovicProfile();
		onONamaPage.checkJelenaDjordjevicProfile();
		onONamaPage.checkLavandaProfile();
		onONamaPage.checkAleksandraKovacevicProfile();
		onONamaPage.checkAnaStankovicProfile();
		
		
	}

}
