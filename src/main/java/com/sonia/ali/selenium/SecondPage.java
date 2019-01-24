package com.sonia.ali.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecondPage {

	@FindBy(xpath = "//*[@id=\"body-section\"]/div[5]/div/div[3]/div[1]/div/table/tbody/tr[1]/td/div[3]/a/button")
	private WebElement detailsBox;

	public void searchFor() {
		detailsBox.click();
	}
}
