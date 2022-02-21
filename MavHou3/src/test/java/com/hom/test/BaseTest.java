package com.hom.test;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseTest {
	public static WebDriver dr;
	
	@Before
	public void openBrowser() {
		String br = System.getProperty("browser");
		 
		if(br.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mounia2016\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr = new ChromeDriver();
			
		}else if(br.equals("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\Mounia2016\\Downloads\\edgedriver_win64\\msedgedriver.exe");
			dr = new InternetExplorerDriver();
				
			}
		Dimension dimension = new Dimension(1300, 220);
		dr.manage().window().setSize(dimension);
	}
	
	@After
	public void closeBrowser() {
		dr.quit();
	}

}
