package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_BUTTON ="//div[@class=\"_6ltg\"]/a";
    public static final String XPATH_ACCEPT = "//div[@class=\"_9xo5\"]/button[1]";
    public static final String XPATH_DAY = "//select[contains(@name, 'birthday_day')]";



    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");

        WebElement accept = driver.findElement(By.xpath(XPATH_ACCEPT));
        accept.click();

        WebElement newAcc = driver.findElement(By.xpath(XPATH_BUTTON));
        newAcc.click();

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(1);
    }
}
