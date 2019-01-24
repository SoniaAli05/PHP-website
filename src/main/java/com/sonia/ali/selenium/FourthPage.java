package com.sonia.ali.selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FourthPage {
	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/table/tbody/tr[1]/td/div[2]/div[2]/div/div[3]/div/label/div")
	private WebElement clickBox;

	@FindBy(xpath = "//*[@id=\"ROOMS\"]/div/button")
	private WebElement bookNow;

	public void searchFor() {
		clickBox.clear();
		bookNow.click();

	}
}
