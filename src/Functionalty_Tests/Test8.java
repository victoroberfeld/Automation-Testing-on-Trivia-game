package Functionalty_Tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Test8 {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://svcollegetest.000webhostapp.com/");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		driver.findElement(By.id("startB")).click();

	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		try {
			WebElement question01 = driver.findElement(By.xpath("//input[@placeholder='Type here your question?']"));
			question01.sendKeys("What is the tallest building in the world?");
			WebElement nextQuestion1 = driver.findElement(By.xpath("//button[@id='nextquest']"));
			nextQuestion1.click();
			WebElement answers01 = driver.findElement(By.xpath("//input[@placeholder='first answer']"));
			answers01.sendKeys("Burj Khalifa Dubai");
			WebElement answers02 = driver.findElement(By.xpath("//input[@placeholder='seconde answer']"));
			answers02.sendKeys("Shànghǎi China");
			WebElement answers03 = driver.findElement(By.xpath("//input[@placeholder='thierd answer']"));
			answers03.sendKeys("One World Trade Center USA");
			WebElement answers04 = driver.findElement(By.xpath("//input[@placeholder='forth answer']"));
			answers04.sendKeys("Willis Tower USA");
			WebElement radioBtn1 = driver.findElement(By.xpath("//div[@id='answers']//div[1]//div[1]//input[1]"));
			radioBtn1.click();
			
			driver.findElement(By.xpath("//button[@id='nextquest']")).click();
			WebElement question02 = driver.findElement(By.xpath("//input[@placeholder='Type here your question?']"));
			question02.sendKeys("Which company is the most profitable in the world?");
			WebElement nextQuestion2 = driver.findElement(By.xpath("//button[@id='nextquest']"));
			nextQuestion2.click();
			WebElement answers05 = driver.findElement(By.xpath("//input[@placeholder='first answer']"));
			answers01.sendKeys("Saudi Aramco");
			WebElement answers06 = driver.findElement(By.xpath("//input[@placeholder='seconde answer']"));
			answers02.sendKeys("Apple");
			WebElement answers07 = driver.findElement(By.xpath("//input[@placeholder='thierd answer']"));
			answers03.sendKeys("Microsoft");
			WebElement answers08 = driver.findElement(By.xpath("//input[@placeholder='forth answer']"));
			answers04.sendKeys("Willis Tower USA");
			WebElement radioBtn2 = driver.findElement(By.xpath("//div[@id='answers']//div[1]//div[1]//input[1]"));
			radioBtn2.click();
			driver.findElement(By.xpath("//button[@id='nextquest']")).click(); 
			
			WebElement question03 = driver.findElement(By.xpath("//input[@placeholder='Type here your question?']"));
			question03.sendKeys("when was the first iphone published?");
			WebElement nextQuestion3 = driver.findElement(By.xpath("//button[@id='nextquest']"));
			nextQuestion3.click();
			WebElement answers09 = driver.findElement(By.xpath("//input[@placeholder='first answer']"));
			answers09.sendKeys("2008");
			WebElement answers10 = driver.findElement(By.xpath("//input[@placeholder='seconde answer']"));
			answers10.sendKeys("2010");
			WebElement answers11 = driver.findElement(By.xpath("//input[@placeholder='thierd answer']"));
			answers11.sendKeys("2005");
			WebElement answers12 = driver.findElement(By.xpath("//input[@placeholder='forth answer']"));
			answers12.sendKeys("2007");
			WebElement radioBtn3 = driver.findElement(By.xpath("//div[4]//div[1]//input[1]"));
			radioBtn3.click();
			driver.findElement(By.xpath("//button[@id='nextquest']")).click();	
			String quit = "Quit";
			String play = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[2]")).getText();
			assertEquals(quit,play);
			WebElement PlayBtn = driver.findElement(By.xpath("//*[@id=\"secondepage\"]/center/button[1]"));
			PlayBtn.click();
			String Play = "Test";
			String Testplay = driver.findElement(By.xpath("//*[@id=\"testpage\"]/center/h1/u")).getText();
			assertEquals(Play, Testplay);
			
			driver.findElement(By.xpath("//*[@id=\"2\"]/input[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnback\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"2\"]/input[4]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"1\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"0\"]/input[1]")).click();
			driver.findElement(By.xpath("//*[@id=\"btnnext\"]")).click();
			
			String sucsses = "Sucsses";
			String Sucsses = driver.findElement(By.xpath("//*[@id=\"mark\"]")).getText();
			assertEquals(sucsses, Sucsses);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}

}
