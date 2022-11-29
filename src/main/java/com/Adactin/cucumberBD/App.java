package com.Adactin.cucumberBD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
  public static void main(String[] args) {
    System.out.println("Hello World!");
    
    System.setProperty("webdriver.chrome.driver", "");
    WebDriver driver=new ChromeDriver();
  }
}
