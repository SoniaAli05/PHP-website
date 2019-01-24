package com.sonia.ali.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PHPHomepage {
	
	@FindBy(xpath ="//*[@id='dpd1']/div/input")
	private WebElement checkinBox;
	
	@FindBy(xpath ="//*[@id=\"dpd2\"]/div/input")
	private WebElement checkoutBox;
	
	@FindBy(xpath ="//*[@id=\"hotels\"]/form/div[5]/button")
	private WebElement searchBox;
	
	public void searchFor() {
		checkinBox.sendKeys("22/11/2018");
		checkoutBox.sendKeys("22/12/2018");
		searchBox.click();
	}
	
}
