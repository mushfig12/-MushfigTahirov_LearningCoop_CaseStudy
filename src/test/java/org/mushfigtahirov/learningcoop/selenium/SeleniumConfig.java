package org.mushfigtahirov.learningcoop.selenium;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class SeleniumConfig {
	
	@Bean
	public WebDriver getWebDriver(Environment env) {
//	System.setProperty("webdriver.chrome.driver", env.getProperty("selenium.path"));	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mike\\Desktop\\MyDocu\\PerScholas\\chromedrive.exe");	
	
	WebDriver driver = new ChromeDriver();	
	return driver;
	}
	
	
//	public WebDriver getWebDriver(Environment environment) {
//		
//		System.setProperty("webdriver.firefox.driver", environment.getProperty("selenium.path"));
//		
//		WebDriver driver = new FirefoxDriver();
//		return driver;
//	}

}
