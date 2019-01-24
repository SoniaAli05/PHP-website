package com.sonia.ali.selenium;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class testclass {

	ChromeDriver driver;
	WebElement checkElement;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	@After
	public void teardown() throws InterruptedException {
		driver.quit();
	}

	@Test
	public void mthodTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(Constants.websiteURL);
		PHPHomepage page1 = PageFactory.initElements(driver, PHPHomepage.class);
		page1.searchFor();
		Thread.sleep(5000);
		SecondPage page2 = PageFactory.initElements(driver, SecondPage.class);
		page2.searchFor();
		Thread.sleep(5000);
		ThirdPage page3 = PageFactory.initElements(driver, ThirdPage.class);
		page3.searchFor();
		Thread.sleep(5000);
	}

}
