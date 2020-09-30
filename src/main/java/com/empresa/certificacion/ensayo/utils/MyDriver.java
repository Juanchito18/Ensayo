package com.empresa.certificacion.ensayo.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyDriver {

	private static WebDriver driver;
	
	public static MyDriver web() {
		System.setProperty("webdriver.chrome.driver", 
				"src/test/resourses/driver/ChromeDriver.exe");
		driver=new ChromeDriver();
		return new MyDriver();
	}
	
	public WebDriver abrirLaPagina(String url) {
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	

	
}
