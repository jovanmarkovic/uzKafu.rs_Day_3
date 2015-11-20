package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage {
	
	protected WebDriver driver;
	
	By oNama = By.xpath(".//*[@id='menu-item-10']/a");
	By naslovna = By.xpath(".//*[@id='menu-item-9']/a");
	By pisiteNam = By.xpath(".//*[@id='menu-item-62']/a");
	By cicaSavetnica = By.xpath(".//*[@id='menu-item-10156']/a");
	By psiholog = By.xpath(".//*[@id='menu-item-10937']/a");
	By kozmetika = By.xpath(".//*[@id='menu-item-515']/a");
	By kozmetikaNegaLicaiTela = By.xpath(".//*[@id='menu-item-516']/a");
	By kozmetikaKosa = By.xpath(".//*[@id='menu-item-517']/a");
	By kozmetikaNokti = By.xpath(".//*[@id='menu-item-518']/a");
	By kuhinjica = By.xpath(".//*[@id='menu-item-519']/a");
	By kuhinjicaSlanisi = By.xpath(".//*[@id='menu-item-8896']/a");
	By kuhinjicaSlatkisi = By.xpath(".//*[@id='menu-item-8897']/a");
	By moda = By.xpath(".//*[@id='menu-item-520']/a");
	By modaIzMogOrmara = By.xpath(".//*[@id='menu-item-6397']/a");
	By mojaBeba = By.xpath(".//*[@id='menu-item-521']/a");
	By zdravlje = By.xpath(".//*[@id='menu-item-662']/a");
	By zdravljeMedicina = By.xpath(".//*[@id='menu-item-1004']/a");
	By zdravljeRekreacija = By.xpath(".//*[@id='menu-item-8898']/a");
	By motivacija = By.xpath(".//*[@id='menu-item-18014']/a");
	By putovanja = By.xpath(".//*[@id='menu-item-522']/a");
	By razgovori = By.xpath(".//*[@id='menu-item-2446']/a");
	By kuca = By.xpath(".//*[@id='menu-item-8900']/a");
	By razonoda = By.xpath(".//*[@id='menu-item-8899']/a");
	By razonodaFilmovi = By.xpath(".//*[@id='menu-item-15435']/a");
	By razonodaKnjige = By.xpath(".//*[@id='menu-item-15436']/a");
	By razonodaUspesnaZena = By.xpath(".//*[@id='menu-item-15437']/a");
	By uradiSama = By.xpath(".//*[@id='menu-item-523']/a");

	
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public MainPage navigateToMainPage() {
		
		driver.get("http://uzkafu.rs/");
		driver.manage().window().maximize();		
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new MainPage(driver);
		
	}
	
	public MainPage clickOnONama() {
		driver.findElement(oNama).click();
		String oNamaURL = driver.getCurrentUrl();
		System.out.println(oNamaURL);
		Assert.assertEquals(oNamaURL, "http://uzkafu.rs/o_nama/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnNaslovna() {
		driver.findElement(naslovna).click();
		String naslovnaURL = driver.getCurrentUrl();
		System.out.println(naslovnaURL);
		Assert.assertEquals(naslovnaURL, "http://uzkafu.rs/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnPisiteNam() {
		driver.findElement(pisiteNam).click();
		String pisiteNamURL = driver.getCurrentUrl();
		System.out.println(pisiteNamURL);
		Assert.assertEquals(pisiteNamURL, "http://uzkafu.rs/pisite-nam/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnCicaSavetnica() {
		driver.findElement(cicaSavetnica).click();
		String cicaSavetnicaURL = driver.getCurrentUrl();
		System.out.println(cicaSavetnicaURL);
		Assert.assertEquals(cicaSavetnicaURL, "http://uzkafu.rs/category/cica-savetnica/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnPsiholog() {
		driver.findElement(psiholog).click();
		String psihologURL = driver.getCurrentUrl();
		System.out.println(psihologURL);
		Assert.assertEquals(psihologURL, "http://uzkafu.rs/category/odgovori-psihologa/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKozmetika() {
		driver.findElement(kozmetika).click();
		String kozmetikaURL = driver.getCurrentUrl();
		System.out.println(kozmetikaURL);
		Assert.assertEquals(kozmetikaURL, "http://uzkafu.rs/category/kozmetika/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKozmetikaNegaLicaiTela() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(kozmetika);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(kozmetikaNegaLicaiTela).click();
		String kozmetikaNegaLicaiTelaURL = driver.getCurrentUrl();
		System.out.println(kozmetikaNegaLicaiTelaURL);
		Assert.assertEquals(kozmetikaNegaLicaiTelaURL, "http://uzkafu.rs/category/kozmetika/nega-lica-i-tela/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKozmetikaKosa() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(kozmetika);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(kozmetikaKosa).click();
		String kozmetikaKosaURL = driver.getCurrentUrl();
		System.out.println(kozmetikaKosaURL);
		Assert.assertEquals(kozmetikaKosaURL, "http://uzkafu.rs/category/kozmetika/kosa/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKozmetikaNokti() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(kozmetika);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(kozmetikaNokti).click();
		String kozmetikaNoktiURL = driver.getCurrentUrl();
		System.out.println(kozmetikaNoktiURL);
		Assert.assertEquals(kozmetikaNoktiURL, "http://uzkafu.rs/category/kozmetika/nokti/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKuhinjica() {
		driver.findElement(kuhinjica).click();
		String kuhinjicaURL = driver.getCurrentUrl();
		System.out.println(kuhinjicaURL);
		Assert.assertEquals(kuhinjicaURL, "http://uzkafu.rs/category/kuhinjica/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKuhinjicaSlanisi() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(kuhinjica);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(kuhinjicaSlanisi).click();
		String kuhinjicaSlanisiURL = driver.getCurrentUrl();
		System.out.println(kuhinjicaSlanisiURL);
		Assert.assertEquals(kuhinjicaSlanisiURL, "http://uzkafu.rs/category/kuhinjica/slanisi/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKuhinjicaSlatkisi() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(kuhinjica);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(kuhinjicaSlatkisi).click();
		String kuhinjicaSlatksiURL = driver.getCurrentUrl();
		System.out.println(kuhinjicaSlatksiURL);
		Assert.assertEquals(kuhinjicaSlatksiURL, "http://uzkafu.rs/category/kuhinjica/slatkisi/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnModa() {
		driver.findElement(moda).click();
		String modaURL = driver.getCurrentUrl();
		System.out.println(modaURL);
		Assert.assertEquals(modaURL, "http://uzkafu.rs/category/moda/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnModaIzMogOrmara() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(moda);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(modaIzMogOrmara).click();
		String modaIzMogOrmaraURL = driver.getCurrentUrl();
		System.out.println(modaIzMogOrmaraURL);
		Assert.assertEquals(modaIzMogOrmaraURL, "http://uzkafu.rs/category/moda/iz-mog-ormara/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnMojaBeba() {
		driver.findElement(mojaBeba).click();
		String mojaBebaURL = driver.getCurrentUrl();
		System.out.println(mojaBebaURL);
		Assert.assertEquals(mojaBebaURL, "http://uzkafu.rs/category/moja-beba/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnZdravlje() {
		driver.findElement(zdravlje).click();
		String zdravljeURL = driver.getCurrentUrl();
		System.out.println(zdravljeURL);
		Assert.assertEquals(zdravljeURL, "http://uzkafu.rs/category/zdravlje/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnZdravljeMedicina() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(zdravlje);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(zdravljeMedicina).click();
		String zdravljeMedicinaURL = driver.getCurrentUrl();
		System.out.println(zdravljeMedicinaURL);
		Assert.assertEquals(zdravljeMedicinaURL, "http://uzkafu.rs/category/zdravlje/medicina/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnZdravljeRekreacija() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(zdravlje);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(zdravljeMedicina).click();
		String zdravljeRekreacijaURL = driver.getCurrentUrl();
		System.out.println(zdravljeRekreacijaURL);
		Assert.assertEquals(zdravljeRekreacijaURL, "http://uzkafu.rs/category/zdravlje/rekreacija/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnMotivacija() {
		driver.findElement(motivacija).click();
		String motivacijaURL = driver.getCurrentUrl();
		System.out.println(motivacijaURL);
		Assert.assertEquals(motivacijaURL, "http://uzkafu.rs/category/tracarenje/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnPutovanja() {
		driver.findElement(putovanja).click();
		String putovanjaURL = driver.getCurrentUrl();
		System.out.println(putovanjaURL);
		Assert.assertEquals(putovanjaURL, "http://uzkafu.rs/category/putovanja/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnRazgovori() {
		driver.findElement(razgovori).click();
		String razgovoriURL = driver.getCurrentUrl();
		System.out.println(razgovoriURL);
		Assert.assertEquals(razgovoriURL, "http://uzkafu.rs/category/intervju/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnKuca() {
		driver.findElement(kuca).click();
		String kucaURL = driver.getCurrentUrl();
		System.out.println(kucaURL);
		Assert.assertEquals(kucaURL, "http://uzkafu.rs/category/kuca/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnRazonoda() {
		driver.findElement(razonoda).click();
		String razonodaURL = driver.getCurrentUrl();
		System.out.println(razonodaURL);
		Assert.assertEquals(razonodaURL, "http://uzkafu.rs/category/zivot/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnRazonodaFilmovi() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(razonoda);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(razonodaFilmovi).click();
		String razonodaFilmoviURL = driver.getCurrentUrl();
		System.out.println(razonodaFilmoviURL);
		Assert.assertEquals(razonodaFilmoviURL, "http://uzkafu.rs/category/zivot/filmovi/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnRazonodaKnjige() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(razonoda);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(razonodaKnjige).click();
		String razonodaKnjigeURL = driver.getCurrentUrl();
		System.out.println(razonodaKnjigeURL);
		Assert.assertEquals(razonodaKnjigeURL, "http://uzkafu.rs/category/zivot/knjige-zivot/" );
		return new MainPage(driver);
		}
	
	public MainPage clickOnRazonodaUspesnaZena() {
		Actions action = new Actions(driver);
		WebElement MouseHover = driver.findElement(razonoda);
		action.moveToElement(MouseHover).build().perform();
		driver.findElement(razonodaUspesnaZena).click();
		String razonodaUspesnaZenaURL = driver.getCurrentUrl();
		System.out.println(razonodaUspesnaZenaURL);
		Assert.assertEquals(razonodaUspesnaZenaURL, "http://uzkafu.rs/category/zivot/uspesna-zena/" );
		return new MainPage(driver);
		}	
	
	public MainPage clickOnUradiSama() {
		driver.findElement(uradiSama).click();
		String uradiSamaURL = driver.getCurrentUrl();
		System.out.println(uradiSamaURL);
		Assert.assertEquals(uradiSamaURL, "http://uzkafu.rs/category/uradi-sama/" );
		return new MainPage(driver);
		}
	

}
