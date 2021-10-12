package com.geekbrains.lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class HomeWork3Second {
    private static WebDriver driver;
    private static final String CRM_URL = "https://tomas33.ru";

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); // Неявное ожидание

        WebDriverWait webDriverWait = new WebDriverWait(driver, 10);

        driver.get(CRM_URL);

        driver.findElement(By.xpath("//span[contains(., 'Регистрация')]")).click();
        driver.findElement(By.id("email_create")).sendKeys("TESTQA4@google.com");
        driver.findElement(By.name("SubmitCreate")).click();

        login();

        driver.findElement(By.id("newsletter")).click();
        driver.findElement(By.id("optin")).click();
        driver.findElement(By.name("submitAccount")).click();

        driver.quit();

    }

    public static void login() {
        driver.findElement(By.id("id_gender1")).click();

        driver.findElement(By.id("customer_firstname")).sendKeys("Kirill");
        driver.findElement(By.id("customer_lastname")).sendKeys("Abramunin");
        driver.findElement(By.id("passwd")).sendKeys("1234567890");

        driver.findElement(By.id("days")).click();
        Select daySelect = new Select(driver.findElement(By.id("days")));
        daySelect.selectByVisibleText("10");

        Select monthSelect = new Select(driver.findElement(By.id("months")));
        monthSelect.selectByVisibleText("Февраль");

        Select yearSelect = new Select(driver.findElement(By.id("years")));
        yearSelect.selectByVisibleText("1986");
    }
}
