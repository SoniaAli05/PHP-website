package com.sonia.ali.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ThirdPage {
	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[1]/div/input")
	private WebElement checkinBox;

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[2]/div/input")
	private WebElement checkoutBox;

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[4]/div[2]/div/div[2]/form/div[5]/input[3]")
	private WebElement searchBox;

	public void searchFor() {
		checkinBox.clear();
		checkoutBox.clear();
		checkinBox.sendKeys("22/11/2018");
		checkoutBox.sendKeys("22/12/2018");
		searchBox.click();
	}
}
