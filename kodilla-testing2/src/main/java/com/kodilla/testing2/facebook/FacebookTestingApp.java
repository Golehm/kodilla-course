package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public final static String XPATH_WAIT_FOR = "//select[1]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com");

        while (!driver.findElement(By.xpath(XPATH_WAIT_FOR)).isDisplayed());

        Select birthDay = new Select(driver.findElement(By.name("birthday_day")));
        birthDay.selectByVisibleText("1");
        Select birthMonth = new Select(driver.findElement(By.name("birthday_month")));
        birthMonth.selectByVisibleText("lut");
        Select birthYear = new Select(driver.findElement(By.name("birthday_year")));
        birthYear.selectByVisibleText("1999");
    }
}
