package ru.smartavia;

import org.junit.Assert;
import org.junit.Test;


public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://flysmartavia.com/avia/");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Smartavia"));
    }
}
