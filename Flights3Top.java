package Flights;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Flights3Top extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.get(test2+"flights/searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=BCN&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=ברצלונה&Segments%5B0%5D.Date=25.10.2018&Segments%5B1%5D.From=BCN&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=ברצלונה&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=12.11.2018");
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[1]/div/div/div[2]/div[1]")).click();//Cheaper Flights###
        WebElement elementCheap = driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[1]/div/div/div[2]/div[2]/span"));
        String elementCheap1 = elementCheap.getText();
        WebElement elementCheap2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String elementCheap3 = elementCheap2.getText();
        Assert.assertEquals(elementCheap3, elementCheap1);


        Thread.sleep(2000L);
        logger.info("Great, Found The Cheaper flight");
        driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[2]/div/div/div[2]/div[1]")).click();//Faster Flights###
        Thread.sleep(2000L);
        WebElement elementFaster = driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[2]/div/div/div[2]/div[2]/span"));
        String elementFaster1 = elementFaster.getText();
        WebElement elementFaster2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String elementFaster3 = elementFaster2.getText();
        Assert.assertEquals(elementFaster3, elementFaster1);
        logger.info("Great, Found The Faster flight");
        Thread.sleep(2000L);

        driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[3]/div/div/div[2]/div[1]")).click();//Recommended###
        Thread.sleep(2000L);
        WebElement elementRecommended = driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[3]/div/div/div[2]/div[2]/span"));
        String elementRecommended1 = elementRecommended.getText();
        WebElement elementRecommended2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String elementRecommended3 = elementRecommended2.getText();
        Assert.assertEquals(elementRecommended3, elementRecommended1);
        logger.info("Great, Found The Recommended flight");
        driver.close();
        }}

     //  Collections.min(LowPrice));



