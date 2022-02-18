package com.ex.ui.pages.admin;

import com.ex.ui.pages.WebHelpers;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage extends WebHelpers {
    WebDriver webDriver;
    protected static Logger log = LogManager.getLogger();


    BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    BasePage(WebDriver webDriver, String url) {
        webDriver.get(url);
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    <T> T clickOnButton(T type, String buttonName, String locator) {
        findElement(webDriver, By.xpath(String.format(locator, buttonName))).click();
        return type;
    }
}
