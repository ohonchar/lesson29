package com.ex.ui.pages.admin;

import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    private final By emailField = By.xpath("//input[@id='email']");
    private final By passwordField = By.xpath("//input[@id='password']");
    private final By loginButton = By.xpath("//button[contains(., 'Login')]");
    private final String someButton = "//button[contains(., '%s')]";

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public LoginPage inputEmail(String email) {
        findElement(webDriver, emailField).sendKeys(email);
        return this;
    }

    public LoginPage inputPassword(String password) {
        findElement(webDriver, passwordField).sendKeys(password);
        return this;
    }

    public LoginPage clickOnLoginButton() {
        findElement(webDriver, loginButton).click();
        return this;
    }

    public LoginPage verifyPasswordFieldIsEmpty() {
        boolean isPasswordFieldEmpty = findElement(webDriver, passwordField).getAttribute("value").isEmpty();
        Assertions.assertThat(isPasswordFieldEmpty).as("Password field should be an empty").isTrue();
        return this;
    }

    public LoginPage clickOnLogin(LoginPage loginPage) {
        clickOnButton(loginPage, "Login", someButton);
        return this;
    }
}
