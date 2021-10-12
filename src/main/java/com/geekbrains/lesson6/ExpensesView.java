package com.geekbrains.lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ExpensesView extends BaseView {

    public ExpensesView(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = createExpenseButtonXpathLocator)
    public WebElement createExpenseButton;

    @Step("Клик на кнопку создания заявки на расход")
    public void createExpenseButtonClick() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(createExpenseButtonXpathLocator)));
        createExpenseButton.click();
        webDriverWait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(CreateExpenseView.expenseAppointmentCssLocator)));
    }

    final static String createExpenseButtonXpathLocator = "//a[.='Создать заявку на расход']";
}