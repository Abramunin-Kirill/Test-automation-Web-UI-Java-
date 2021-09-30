package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Start {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abram\\Desktop\\JavaUIAutomation\\example\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        Thread.sleep(5000);
        driver.quit();

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://ya.ru");

        driver1.get("https://afisha.ru");
        ((JavascriptExecutor)driver1).executeScript("var elem = document.getElementById(\"adfox-433058372\");\n" +
                "  elem.remove();");

        Thread.sleep(5000);
        driver1.quit();
    }
}
