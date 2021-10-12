package com.geekbrains.lesson6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginView extends BaseView {
    WebDriver webDriver;

    @FindBy(id = "prependedInput")
    public WebElement inputLogin;

    @FindBy(id = "prependedInput2")
    public WebElement inputPassword;

    @FindBy(id = "_submit")
    public WebElement buttonSubmit;

    public LoginView fillLogin(String login) {
        inputLogin.sendKeys(login);
        return this;
    }

    public LoginView fillPassword(String password) {
        inputPassword.sendKeys(password);
        return this;
    }

    public MainView submitLogin() {
        buttonSubmit.click();
        return new MainView(webDriver);
    }


    public void login(String login, String password) {
        inputLogin.sendKeys(login);
        inputPassword.sendKeys(password);
        buttonSubmit.click();
    }

    public LoginView(WebDriver webDriver) {
        super(webDriver);
    }
}
