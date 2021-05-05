package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipcartPages {
	WebDriver driver;
	public FlipcartPages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}


	@FindBy(name="q")
	WebElement Search1;
	public WebElement getSearch1() {
		return Search1;
	}
	@FindBy(name="q")
	WebElement Search2;
	public WebElement getSearch2() {
		return Search2;
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/ul")
	WebElement Category;
	public WebElement getCategory() {
		return Category;
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]")
	WebElement SearchBtn;
	public WebElement getSearchBtn() {
		return SearchBtn;
	}
	@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]/div[1]")
	WebElement ItemTitle;
	public WebElement getItemTitle() {
		return ItemTitle;
	}
}
