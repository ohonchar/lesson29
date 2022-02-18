package com.ex.ui;


import com.ex.ui.WebDriverManagerClass;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected static WebDriver webDriver;
    protected static Logger log = LogManager.getLogger();

    @BeforeClass
    public void setUp() {
        log.debug("This is webdriver inits");
        webDriver = WebDriverManagerClass.getWebDriver();
    }

    @AfterClass
    public void shutDown() {
        webDriver.quit();
    }
}
