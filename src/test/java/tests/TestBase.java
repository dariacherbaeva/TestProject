package tests;

import data.MessageData;
import data.SystemPostData;
import data.UserData;
import managers.ApplicationManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;

public abstract class TestBase {

    protected ApplicationManager app;

    @Before
    public void setUp() {
        app = ApplicationManager.getInstance();
    }

    @Test
    public abstract void testCase();


}

