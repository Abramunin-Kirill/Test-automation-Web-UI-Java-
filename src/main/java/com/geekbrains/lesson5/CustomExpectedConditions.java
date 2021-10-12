package com.geekbrains.lesson5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;

public class CustomExpectedConditions {
    public static ExpectedCondition<Boolean> elementWithTextFirstInCollection(final By locator, final String text) {
        return new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return driver.findElements(locator).get(0).getText().equals(text);
            }

            public String toString() {
                return String.format("Element with text ('%s') is first in collection", text);
            }
        };
    }

}
