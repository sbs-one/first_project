package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;


public class FirstTest extends WebDriverSettings {

    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Москвы за 25-45 минут! Delivery Club"));
    }
}
