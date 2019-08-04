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

class Test2 {
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
	void test02() {	
		try {
			WebElement question = driver.findElement(By.xpath("//input[@placeholder='Type here your question?']"));
			question.sendKeys("whice day today?");
			WebElement nextQuestion1 = driver.findElement(By.xpath("//button[@id='nextquest']"));
			nextQuestion1.click();
			WebElement answers01 = driver.findElement(By.xpath("//input[@placeholder='first answer']"));
			answers01.sendKeys("Today is Sunday");
			WebElement answers02 = driver.findElement(By.xpath("//input[@placeholder='seconde answer']"));
			answers02.sendKeys("Today is Monday");
			WebElement answers03 = driver.findElement(By.xpath("//input[@placeholder='thierd answer']"));
			answers03.sendKeys("Today id Tuesday");
			WebElement answers04 = driver.findElement(By.xpath("//input[@placeholder='forth answer']"));
			answers04.sendKeys("Today is Wednesday");
			WebElement radioBtn1 = driver.findElement(By.xpath("//form[@id='myform2']//div[2]//div[1]//input[1]"));
			radioBtn1.click();
			driver.findElement(By.xpath("//button[@id='nextquest']")).click();
			
			WebElement question02 = driver.findElement(By.xpath("//input[@placeholder='Type here your question?']"));
			question02.sendKeys("whice day today?");
			WebElement nextQuestion2 = driver.findElement(By.xpath("//button[@id='nextquest']"));
			nextQuestion2.click();
			WebElement answers05 = driver.findElement(By.xpath("//input[@placeholder='first answer']"));
			answers01.sendKeys("Today is Sunday");
			WebElement answers06 = driver.findElement(By.xpath("//input[@placeholder='seconde answer']"));
			answers02.sendKeys("Today is Monday");
			WebElement answers07 = driver.findElement(By.xpath("//input[@placeholder='thierd answer']"));
			answers03.sendKeys("Today id Tuesday");
			WebElement answers08 = driver.findElement(By.xpath("//input[@placeholder='forth answer']"));
			answers04.sendKeys("Today is Wednesday");
			WebElement radioBtn2 = driver.findElement(By.xpath("//form[@id='myform2']//div[2]//div[1]//input[1]"));
			radioBtn2.click();
			driver.findElement(By.xpath("//button[@id='nextquest']")).click(); 
			
			WebElement question03 = driver.findElement(By.xpath("//input[@placeholder='Type here your question?']"));
			question03.sendKeys("whice day today?");
			WebElement nextQuestion3 = driver.findElement(By.xpath("//button[@id='nextquest']"));
			nextQuestion3.click();
			WebElement answers09 = driver.findElement(By.xpath("//input[@placeholder='first answer']"));
			answers09.sendKeys("Today is Sunday");
			WebElement answers10 = driver.findElement(By.xpath("//input[@placeholder='seconde answer']"));
			answers10.sendKeys("Today is Monday");
			WebElement answers11 = driver.findElement(By.xpath("//input[@placeholder='thierd answer']"));
			answers11.sendKeys("Today id Tuesday");
			WebElement answers12 = driver.findElement(By.xpath("//input[@placeholder='forth answer']"));
			answers12.sendKeys("Today is Wednesday");
			WebElement radioBtn3 = driver.findElement(By.xpath("//form[@id='myform2']//div[2]//div[1]//input[1]"));
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
			//driver.quit();
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}
