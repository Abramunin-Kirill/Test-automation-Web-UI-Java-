package com.geekbrains.lesson5;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.geekbrains.lesson5.Helpers.clickWithJs;

public class JSExecutorExampleTest {
        WebDriver driver;
        WebDriverWait webDriverWait;

        @BeforeAll
        static void registerDriver() {
            WebDriverManager.chromedriver().setup();
        }

        @BeforeEach
        void setUpBrowser() {
            driver = new ChromeDriver();
            webDriverWait = new WebDriverWait(driver, 5);
            driver.get("https://ya.ru/");
        }

        @Test
        void jsExecuteTest() throws InterruptedException {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            javascriptExecutor.executeScript("window.alert('Test');");
            Thread.sleep(2000);
            Alert alert = driver.switchTo().alert();
            alert.accept();
            Thread.sleep(2000);

            clickWithJs(driver, driver.findElement(By.xpath("//button")));
            Thread.sleep(2000);
        }

        @AfterEach
        void tearDown() {
            driver.quit();
        }
}

