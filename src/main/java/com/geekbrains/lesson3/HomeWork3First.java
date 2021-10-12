package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWork3First {
    private static WebDriver driver;
    private static final String CRM_URL = "https://www.saucedemo.com";


    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        driver.get(CRM_URL);
        login();

        driver.findElement(By.xpath("//button[contains(@name, 'sauce-labs-backpack')]")).click();
        driver.findElement(By.xpath("//button[contains(@name, 'sauce-labs-fleece-jacket')]")).click();

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
        driver.findElement(By.name("checkout")).click();

        checkout();

        driver.findElement(By.name("finish")).click();
        Thread.sleep(5000);

        driver.quit();

    }

    public static void login() { //класс для входа на сайт
        WebElement element = driver.findElement(By.id("user-name"));
        element.sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    public static void checkout() {
        WebElement element = driver.findElement(By.id("first-name"));
        element.sendKeys("Test");
        driver.findElement(By.id("last-name")).sendKeys("Student");
        driver.findElement(By.id("postal-code")).sendKeys("1234567890");
        driver.findElement(By.id("continue")).click();
    }

}
