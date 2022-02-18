package com.ex.ui;

import com.ex.ui.pages.admin.MainPage;
import org.testng.annotations.Test;

public class TestRailSuite extends BaseTest {
    @Test
    public void testLoginForm() {
        new MainPage(webDriver, "https://www.gurock.com/testrail/")
            .clickOnMyAccountLink()
            .inputEmail("asdfas@asdf.com")
            .inputPassword("someasdfasdf")
            .clickOnLoginButton()
            .verifyPasswordFieldIsEmpty();
        log.info("Test testLoginForm finished success");
    }
}
