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
    public static final String XPATH_MONTH = "//*[@id=\"month\"]";
    public static final String XPATH_YEAR = "//*[@id=\"year\"]";



    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://facebook.com");
        Thread.sleep(1000);

        WebElement accept = driver.findElement(By.xpath(XPATH_ACCEPT));
        accept.click();
        Thread.sleep(1000);

        WebElement newAcc = driver.findElement(By.xpath(XPATH_BUTTON));
        newAcc.click();
        Thread.sleep(1000);

        WebElement day = driver.findElement(By.xpath(XPATH_DAY));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(10);
        Thread.sleep(1000);

        WebElement month = driver.findElement(By.xpath(XPATH_MONTH));
        Select selectMonth = new Select(month);
        selectMonth.selectByIndex(10);
        Thread.sleep(1000);

        WebElement year = driver.findElement(By.xpath(XPATH_YEAR));
        Select selectYear = new Select(year);
        selectYear.selectByIndex(10);
        Thread.sleep(1000);

    }
}
