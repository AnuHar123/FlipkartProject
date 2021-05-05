package com.qa.testscripts;

import org.testng.annotations.Test;

public class TC_Flipcart extends TestBase{
	@Test
	public void Flipcart() throws InterruptedException {
		Flip.getSearch1().sendKeys("Mobiles");
		Thread.sleep(5000);
		Flip.getSearchBtn().click();
		Thread.sleep(3000);
//		System.out.println(Flip.getItemTitle());
		Flip.getItemTitle().click();
		Thread.sleep(2000);
//		String currentUrl= driver.getCurrentUrl();
//		System.out.println(currentUrl);
		String title=driver.getTitle();
		System.out.println(title);
		if(title.contains("Flipkart")) {
			System.out.println("Matched");
		}
		else {
			System.out.println("Not matched");
		}
		
//		Flip.getCategory().contains("Mobiles");
//		Thread.sleep(5000);

		}
		

	}




		
