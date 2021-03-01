package org.mushfigtahirov.learningcoop.selenium;

import org.junit.jupiter.api.Test;




import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SeleniumTests {
	
	public WebDriver driver;
	

	@Autowired
	public SeleniumTests(WebDriver driver) {
		this.driver = driver;
	}
	
	

	@Test
	void openSignInPage() throws InterruptedException {
		
		driver.get("http://localhost:8080/");
	}
}
