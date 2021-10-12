package com.geekbrains.lesson6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpensesSubMenu extends BaseView {
    @FindBy(xpath = "//span[.='Заявки на расходы']")
    public WebElement createExpenseButton;

    public ExpensesSubMenu(WebDriver webDriver) {
        super(webDriver);
    }

    @Step("Клик на кнопку Расходы")
    public ExpensesView expensesButtonClick() {
        createExpenseButton.click();
        return new ExpensesView(webDriver);
    }
}