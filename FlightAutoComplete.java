package Flights;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class FlightAutoComplete extends Util{

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(1000L);
        //Dates
        driver.findElement(By.xpath("//*[@id=\"wizardWrapper\"]/div[2]/div/div[1]/div/ul/li[2]/a/span")).click();
         Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[2]/label")).click();
        Thread.sleep(2000L);
        logger.info("Complete,radio Button One Way");
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).click();//Check Auto Complete One Way####
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("United");
        Thread.sleep(1000L);
        WebElement united = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String united1 = united.getText();
        Assert.assertEquals("United Airlines", united1);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("Lot");
        Thread.sleep(1000L);
        WebElement lot = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String lot1 = lot.getText();
        Assert.assertEquals("LOT", lot1);
        Thread.sleep(2000L);
        logger.info("Great, Found Auto Complete One Way");
        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[1]/label")).click();//Check Auto Complete Two Way####
        Thread.sleep(2000L);
        logger.info("Complete,radio Button two Way");
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("El Al");
        Thread.sleep(1000L);
        WebElement elal = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String elal1 = elal.getText();
        Assert.assertEquals("אל על", elal1);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("ALIT");
        Thread.sleep(1000L);
        WebElement ALIT = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String ALIT1 = ALIT.getText();
        Assert.assertEquals("Alitalia", ALIT1);
        Thread.sleep(2000L);
        logger.info("Complete,Auto Complete two Way");

        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[3]/label")).click();//Check Auto Complete Other Way####
        Thread.sleep(2000L);
        logger.info("Complete,radio Button two Way");
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("ARKIA");
        Thread.sleep(1000L);
        WebElement arkia = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String arkia1 = arkia.getText();
        Assert.assertEquals("Arkia", arkia1);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("Bulga");
        Thread.sleep(1000L);
        WebElement bulgaria = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String bulgaria1 = bulgaria.getText();
        Assert.assertEquals("Bulgaria Air", bulgaria1);
        Thread.sleep(2000L);
        logger.info("Complete,Auto Complete Back from other Way");

        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[4]/label")).click();//Check Auto Complete Multi Way####
        Thread.sleep(2000L);
        logger.info("Complete,radio Button two Way");
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("AEROFLOT");
        Thread.sleep(1000L);
        WebElement areo = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String areo1 = areo.getText();
        Assert.assertEquals("Arkia", arkia1);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_airline_input\"]")).sendKeys("SWISS");
        Thread.sleep(1000L);
        WebElement swiss = driver.findElement(By.xpath("//*[@class='ui-menu-item']"));
        String swiss1 = swiss.getText();
        Assert.assertEquals("Swiss", swiss1);
        Thread.sleep(2000L);
        logger.info("Complete,Auto Complete Back Multi Way");
        driver.close();
    }}



