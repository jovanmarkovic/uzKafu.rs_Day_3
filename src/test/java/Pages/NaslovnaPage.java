package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NaslovnaPage {
	
	
	protected WebDriver driver;
	
	By searchBox = By.xpath(".//*[@id='s']");
	By buttonTrazi = By.xpath(".//*[@id='searchsubmit']");
	By jakeiGusteObrveSide = By.xpath(".//*[@id='customScrollerContent_ID_1447927716708']/li[1]/a/h3");
	By jakeiGusteObrveMain = By.xpath(".//*[@id='feature-22914']/a/img");
	By dvaTriRedaSide = By.xpath(".//*[@id='customScrollerContent_ID_1447922802699']/li[2]/a/img");
	By dvaTriRedaMain = By.xpath(".//*[@id='feature-22898']/a/img");
	By bibliotekeSide = By.xpath(".//*[@id='customScrollerContent_ID_1447922802699']/li[3]/a/img");
	By bibliotekeMain = By.xpath(".//*[@id='feature-22835']/a/img");
	By dnevnaSobaSide = By.xpath(".//*[@id='customScrollerContent_ID_1447922802699']/li[4]/a/img");
	By dnevnaSobaMain = By.xpath(".//*[@id='feature-22808']/a/img");
	By poncoSide = By.xpath(".//*[@id='customScrollerContent_ID_1447922802699']/li[5]/a/img");
	By poncoMain = By.xpath(".//*[@id='feature-22782']/a/img");
	By zanimljivosti = By.xpath(".//*[@id='casing']/div[2]/div[2]/h3/a");
	By moda = By.xpath(".//*[@id='content']/div[2]/h3/a");
	By mojaBeba = By.xpath(".//*[@id='content']/div[4]/h3/a");
	By kozmetika = By.xpath(".//*[@id='content']/div[6]/h3/a");
	By zdravlje = By.xpath(".//*[@id='content']/div[8]/h3/a");
	By kuhinjica = By.xpath(".//*[@id='content']/div[10]/h3/a");
	By putovanja = By.xpath(".//*[@id='content']/div[12]/h3/a");
	By intervju = By.xpath(".//*[@id='content']/div[14]/h3/a");
	By uradiSama = By.xpath(".//*[@id='content']/div[16]/h3/a");
	By kuca = By.xpath(".//*[@id='content']/div[18]/h3/a");
	By zivot = By.xpath(".//*[@id='content']/div[20]/h3/a");
	By feed = By.xpath(".//*[@id='content']/div[1]/div/ul/li[1]/a/img");
	
	public NaslovnaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public NaslovnaPage navigateToMainPage() throws InterruptedException {
		
		driver.get("http://uzkafu.rs/");
		driver.manage().window().maximize();		
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		Thread.sleep(2000);
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage search() throws InterruptedException {
		driver.findElement(searchBox).sendKeys("kozmetika");
		Thread.sleep(2000);
		driver.findElement(buttonTrazi).click();
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		Thread.sleep(2000);
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnJakeiGusteObrveSide() throws InterruptedException {
		//driver.findElement(jakeiGusteObrveSide).click();
		Thread.sleep(2000);
		driver.findElement(jakeiGusteObrveMain).click();
		String naslovnaURL = driver.getCurrentUrl();
		System.out.println(naslovnaURL);
		Assert.assertEquals(naslovnaURL, "http://uzkafu.rs/2015/11/za-zene-koje-zele-jake-i-guste-obrve/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		}
	
	public NaslovnaPage clickOnModa() throws InterruptedException {
		driver.findElement(moda).click();
		String modaPageURL = driver.getCurrentUrl();
		System.out.println(modaPageURL);
		Assert.assertEquals(modaPageURL, "http://uzkafu.rs/category/moda/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnMojaBeba() throws InterruptedException {
		driver.findElement(mojaBeba).click();
		String mojaBebaPageURL = driver.getCurrentUrl();
		System.out.println(mojaBebaPageURL);
		Assert.assertEquals(mojaBebaPageURL, "http://uzkafu.rs/category/moja-beba/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnKozmetika() throws InterruptedException {
		driver.findElement(kozmetika).click();
		String kozmetikaPageURL = driver.getCurrentUrl();
		System.out.println(kozmetikaPageURL);
		Assert.assertEquals(kozmetikaPageURL, "http://uzkafu.rs/category/nega-lica-i-tela/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnZdravlje() throws InterruptedException {
		driver.findElement(zdravlje).click();
		String zdravljePageURL = driver.getCurrentUrl();
		System.out.println(zdravljePageURL);
		Assert.assertEquals(zdravljePageURL, "http://uzkafu.rs/category/zdravlje/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnKuhinjica() throws InterruptedException {
		driver.findElement(kuhinjica).click();
		String kuhinjicaPageURL = driver.getCurrentUrl();
		System.out.println(kuhinjicaPageURL);
		Assert.assertEquals(kuhinjicaPageURL, "http://uzkafu.rs/category/kuhinjica/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnPutovanja() throws InterruptedException {
		driver.findElement(putovanja).click();
		String putovanjaPageURL = driver.getCurrentUrl();
		System.out.println(putovanjaPageURL);
		Assert.assertEquals(putovanjaPageURL, "http://uzkafu.rs/category/putovanja/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnintervju() throws InterruptedException {
		driver.findElement(intervju).click();
		String intervjuPageURL = driver.getCurrentUrl();
		System.out.println(intervjuPageURL);
		Assert.assertEquals(intervjuPageURL, "http://uzkafu.rs/category/intervju/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnUradiSama() throws InterruptedException {
		driver.findElement(uradiSama).click();
		String uradiSamaPageURL = driver.getCurrentUrl();
		System.out.println(uradiSamaPageURL);
		Assert.assertEquals(uradiSamaPageURL, "http://uzkafu.rs/category/uradi-sama/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnKuca() throws InterruptedException {
		driver.findElement(kuca).click();
		String kucaPageURL = driver.getCurrentUrl();
		System.out.println(kucaPageURL);
		Assert.assertEquals(kucaPageURL, "http://uzkafu.rs/category/kuca/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnZivot() throws InterruptedException {
		driver.findElement(zivot).click();
		String zivotPageURL = driver.getCurrentUrl();
		System.out.println(zivotPageURL);
		Assert.assertEquals(zivotPageURL, "http://uzkafu.rs/category/zivot/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	
	public NaslovnaPage clickOnFeed() throws InterruptedException {
		driver.findElement(feed).click();
		String feedPageURL = driver.getCurrentUrl();
		System.out.println(feedPageURL);
		Assert.assertEquals(feedPageURL, "http://uzkafu.rs/feed/" );
		driver.navigate().back();
		String mainPageURL = driver.getCurrentUrl();
		System.out.println(mainPageURL);
		Assert.assertEquals(mainPageURL, "http://uzkafu.rs/" );
		return new NaslovnaPage(driver);
		
		}
	

}
