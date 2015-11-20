package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ONamaPage {
	
	protected WebDriver driver;
	
	By coffeePic = By.xpath(".//*[@id='post-2']/div[2]/div/p[1]/span/a/img");
	By anaZdravkovicBabicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[12]/a[1]/img");
	By anaZdravkovicBabicZoom = By.xpath(".//*[@id='post-1579']/div[2]/div/p/a/img");
	By marijaBogdanovicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[12]/a[3]/img");
	By marijaBogdanovicZoom = By.xpath(".//*[@id='post-1602']/div[2]/div/p/a/img");
	By marinaDimitrijevicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[12]/a[5]/img");
	By marinaDimitrijevicZoom = By.xpath(".//*[@id='post-1801']/div[2]/div/p/a/img");
	By milenaPetrovicBojkovicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[13]/a/img");
	By jovanaIvanovicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[2]/img");
	By jovanaIvanovicZoom = By.xpath(".//*[@id='post-1591']/div[2]/div/p/a/img");
	By jelenaDjordjevicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[4]/img");
	By jelenaDjordjevicZoom = By.xpath(".//*[@id='post-1588']/div[2]/div/p/a/img");
	By lavandaPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[5]/img");
	By lavandaZoom = By.xpath(".//*[@id='post-1961']/div[2]/div/p/a/img");
	By aleksandraKovacevicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[6]/img");
	By aleksandraKovacevicZoom = By.xpath(".//*[@id='post-1750']/div[2]/div/p/a/img");
	By anaStankovicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[7]/img");
	By anaStankovicZoom = By.xpath(".//*[@id='post-6400']/div[2]/div/p[1]/a/img");
	By natasaRadenkovicAnticPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[8]/img");
	By milicaMilkicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[10]/img");
	By ivanaJocicVeselicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[12]/img");
	By bojanaLakicevicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[15]/img");
	By majaDelibasicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[14]/a[17]/img");
	By vesnaPolomacLazicPic = By.xpath(".//*[@id='post-2']/div[2]/div/p[17]/a/img");
	By closeButton = By.id("cboxClose");
	
	
	
	public ONamaPage(WebDriver driver) {
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
	
	public NaslovnaPage navigateToONamaPage() {
		
		driver.navigate().to("http://uzkafu.rs/o_nama/");	
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/" );
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkImagePresence() {
		
		if ( driver.findElement(coffeePic).isDisplayed()) 
			{
			System.out.println("Element is Visible");
			}
		else 
			{
			System.out.println("Element is InVisible");
			}
		
		if ( driver.findElement(anaZdravkovicBabicPic).isDisplayed()) 
			{
			System.out.println("Element is Visible");
			}
		else 
			{
			System.out.println("Element is InVisible");
			}
		
		if ( driver.findElement(marijaBogdanovicPic).isDisplayed()) 
			{
			System.out.println("Element is Visible");
			}
		else 
			{
			System.out.println("Element is InVisible");
			}
		
		if ( driver.findElement(marinaDimitrijevicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(milenaPetrovicBojkovicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		
		if ( driver.findElement(jovanaIvanovicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(jelenaDjordjevicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(lavandaPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(aleksandraKovacevicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(anaStankovicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(natasaRadenkovicAnticPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(milicaMilkicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(ivanaJocicVeselicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(bojanaLakicevicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(majaDelibasicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
		if ( driver.findElement(vesnaPolomacLazicPic).isDisplayed()) 
			{
				System.out.println("Element is Visible");
			}
		else 
			{
				System.out.println("Element is InVisible");
			}
				
		return new NaslovnaPage(driver);		
		
	}
	
	public NaslovnaPage checkAnaZdravkovicBabicProfile() throws InterruptedException {
		
		driver.findElement(anaZdravkovicBabicPic).click();
		driver.findElement(anaZdravkovicBabicZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/anaz/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkMarijaBogdanovicProfile() throws InterruptedException {
		
		driver.findElement(marijaBogdanovicPic).click();
		driver.findElement(marijaBogdanovicZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/marija/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkMarinaDimitrijevicProfile() throws InterruptedException {
		
		driver.findElement(marinaDimitrijevicPic).click();
		driver.findElement(marinaDimitrijevicZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/marina/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkJovanaIvanovicProfile() throws InterruptedException {
		
		driver.findElement(jovanaIvanovicPic).click();
		driver.findElement(jovanaIvanovicZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/attachment/1591/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkJelenaDjordjevicProfile() throws InterruptedException {
		
		driver.findElement(jelenaDjordjevicPic).click();
		driver.findElement(jelenaDjordjevicZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/jelena/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkLavandaProfile() throws InterruptedException {
		
		driver.findElement(lavandaPic).click();
		driver.findElement(lavandaZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/dsc_5405/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkAleksandraKovacevicProfile() throws InterruptedException {
		
		driver.findElement(aleksandraKovacevicPic).click();
		driver.findElement(aleksandraKovacevicZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/p1020584/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	
	public NaslovnaPage checkAnaStankovicProfile() throws InterruptedException {
		
		driver.findElement(anaStankovicPic).click();
		driver.findElement(anaStankovicZoom).click();
		Thread.sleep(2000);
		driver.findElement(closeButton).click();
		Thread.sleep(1000);
		String oNamaPageURL = driver.getCurrentUrl();
		System.out.println(oNamaPageURL);
		Assert.assertEquals(oNamaPageURL, "http://uzkafu.rs/o_nama/254300_2109908629925_1311876291_2503378_5010354_n/" );
		driver.navigate().back();
		return new NaslovnaPage(driver);
		
	}
	

}
