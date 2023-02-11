package webdriver_basic;



import java.util.ArrayList;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "E:\\selenium\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
    	Thread.sleep(2000);
		driver.manage().window().maximize();
	    Thread.sleep(2000);
		Dimension d = new Dimension(1000,780);
		driver.manage().window().setSize(d);
		driver.findElement(By.name("q")).sendKeys("sparks foundation");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// xpath by absolute method
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/div/cite")).click();
		
		
		
		//TESTING OF PAGE 1 : MAIN PAGE
		
		
		// TEST CASE 1: TO CHECK THE TITLE
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a")).click();
		Thread.sleep(2000);
		WebElement title = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a"));
		if (title.isDisplayed()) {
			System.out.println("The title is verified successfully");
			
		}
		else {
			System.out.println("The title is not verified");
		}
		Thread.sleep(2000);
		
		
		//TEST CASE 2: TO CHECK THE LOGO_1
		driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img")).click();
		Thread.sleep(2000);
		WebElement logo = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[1]/h1/a/img"));
		if(logo.isDisplayed()) {
        System.out.println("The logo is verified successfully");
		}
		else {
			System.out.println("The logo is not verified");
		}
		Thread.sleep(2000);
		
		
		
		// TESTING OF PAGE 2 : ABOUT US PAGE
		
		
		//TEST CASE 3:  TO CHECK VISION, MISSION, VALUES
		driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Vision, Mission and Values")).click();
		Thread.sleep(2000);
		WebElement about = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2"));
		Thread.sleep(2000);
		if(about.isDisplayed()) {
			 System.out.println("The ABOUT US page is displayed successfully");
		}
		else {
			System.out.println("The ABOUT US page is not displayed");
		}
		Thread.sleep(2000);
		
		
		//TEST CASE 4: TO CHECH OUR VALUES AND ITS SUB DIVISIONS
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/h3[3]")).click();
		Thread.sleep(2000);
		WebElement value = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div[4]"));
		Thread.sleep(2000);
		if(value.isDisplayed()) {
			 System.out.println("The OUR VALUE SECTION is displayed successfully");
		}
		else {
			System.out.println("The OUR VALUE SECTION is not displayed");
		}
		Thread.sleep(2000);
		
		
		//TEST CASE  5: TO FIND AND OPEN LINKEDIN PAGE OF SPARKS FOUNDATION
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/p")).click();
		Thread.sleep(2000);

		// CODE TO SCROLL THE PAGE
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);
		WebElement linkedIn = driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/div[1]/ul/li[2]/a"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div[1]/div[1]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		if(linkedIn.isDisplayed()) {
			 System.out.println("The LINKEDIN PAGE is displayed successfully");
		}
		else {
			System.out.println("The LINKEDIN PAGE is not displayed");
		}
		Thread.sleep(2000);
		
		// CODE TO GO TO PREVIOUS TAB
		((JavascriptExecutor)driver).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		
		
		
		// TESTING OG PAGE 3 : POLICIES AND CODE PAGE
		
		
		//TEST CASE 6 : TO CHECK CODE OF ETHICS AND CONDUCT
		driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Code of Ethics and Conduct")).click();
		Thread.sleep(2000);
		WebElement code = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2"));
		Thread.sleep(2000);
		if(code.isDisplayed()) {
			 System.out.println("The POLICIES AND CODE page is displayed successfully");
		}
		else {
			System.out.println("The POLICIES AND CODE page is not displayed");
		}
		Thread.sleep(2000);
		
		
		// TEST CASE 7: TO OPEN INTERNSHIP LINK
		//CODE TO SCROLL THE PAGE
		js.executeScript("window.scroll(0,2000)");
		Thread.sleep(2000);
		WebElement internship = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/ul/li/a"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[3]/ul/li/a")).click();
		if(internship.isDisplayed()) {
			 System.out.println("The INTERNSHIP page is displayed successfully");
		}
		else {
			System.out.println("The INTERNSHIP page is not displayed");
		}
		Thread.sleep(2000);
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		 
		
		
		// TESTING OF PAGE 4: LINKS PAGE
		
		
		//TEST CASE 8: TO CHECK NAVIGATION BAR
		driver.findElement(By.xpath("//*[@id=\"link-effect-3\"]/ul/li[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("AI in Education")).click();
		Thread.sleep(2000);
		WebElement link = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2"));
		Thread.sleep(2000);
		if(link.isDisplayed()) {
			 System.out.println("The LINKS page is displayed successfully");
		}
		else {
			System.out.println("The LINKS page is not displayed");
		}
		Thread.sleep(2000);
		
		WebElement navigator = driver.findElement(By.id("bs-example-navbar-collapse-1"));
		Thread.sleep(2000);
		if(navigator.isDisplayed()) {
			 System.out.println("The NAVIGATION BAR is displayed successfully");
		}
		else {
			System.out.println("The NAVIGATION BAR is not displayed");
		}
		Thread.sleep(2000);

		
		//TEST CASE 9: TO CHECK LEARN MORE BUTTON
		WebElement button = driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div/a"));
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/div[1]/div/div/div[1]/div/a")).click();
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,380)");
		Thread.sleep(2000);
		if(button.isDisplayed()) {
			 System.out.println("The LEARN MORE button is displayed successfully");
		}
		else {
			System.out.println("The LEARN MORE button is not displayed");
		}
		driver.switchTo().window(tabs.get(0));
		Thread.sleep(2000);
		
		
		
		// TESTING OF PAGE 5: JOIN US
		
		
		// TEST CASE 10: TO ENTER OUR DETAILS
		driver.findElement(By.linkText("Join Us")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Why Join Us")).click();
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]"));
		driver.findElement(By.name("Name")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Name")).sendKeys("VARSHA V");
		Thread.sleep(2000);
		driver.findElement(By.name("Email")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("Email")).sendKeys("varsha24@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/select")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/select/option[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/input[3]")).click();
		Thread.sleep(1000);
		System.out.println("The name, email and other details are submitted successfully");
		Thread.sleep(1000);
		
		
		// TESTING OF PAGE 6: CONATCT US PAGE
		
		
		//TEST CASE 11: TO CHECK ADDRESS SECTION
		driver.findElement(By.linkText("Contact Us")).click();
		Thread.sleep(2000);
		WebElement contactPage = driver.findElement(By.xpath("//*[@id=\"home\"]/div/div[2]/h2"));
		Thread.sleep(2000);
		if(contactPage.isDisplayed()) {
			 System.out.println("The CONATCT US PAGE is displayed successfully");
		}
		else {
			System.out.println("The CONATCT US PAGE is not displayed");
		}
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,450)");
		Thread.sleep(2000);
		WebElement address = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]"));
	    Thread.sleep(2000);
		if(address.isDisplayed()) {
			 System.out.println("The ADDRESS SECTION is displayed successfully");
		}
		else {
			System.out.println("The ADDRESS SECTION is not displayed");
		}
		Thread.sleep(2000);
		
		
		// TEST CASE 12: TO CHECK WHETHER THE LOCATION SYMBOL IS PRESENT
		WebElement location = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[1]/i"));
		Thread.sleep(2000);
		if(location.isDisplayed()) {
			 System.out.println("The LOCATION SYMBOL is displayed successfully");
		}
		else {
			System.out.println("The LOCATION SYMBOL is not displayed");
		}
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,500)");
		Thread.sleep(2000);
		
		
		// TEST CASE 13: TO CHECK CONTACT SECTION
		WebElement contact = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[3]"));
		Thread.sleep(2000);
		if(contact.isDisplayed()) {
			 System.out.println("The CONTACT SECTION is displayed successfully");
		}
		else {
			System.out.println("The CONTACT SECTION is not displayed");
		}
		Thread.sleep(2000);
		
		
		// TEST CASE 14: TO CHECK GOOGLE MAP LOCATION
		WebElement map = driver.findElement(By.xpath("/html/body/div[3]/iframe"));
		Thread.sleep(2000);
		js.executeScript("window.scroll(0,800)");
		Thread.sleep(2000);
		if(map.isDisplayed()) {
			 System.out.println("The LOCATION AND MAP is displayed successfully");
		}
		else {
			System.out.println("The LOCATION AND MAP is not displayed");
		}
	    Thread.sleep(2000);
		
		
		
	}
	
}
	
	


