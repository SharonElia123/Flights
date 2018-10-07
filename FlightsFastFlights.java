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
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlightsFastFlights extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.get(test2+"flights/searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=BCN&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=ברצלונה&Segments%5B0%5D.Date=20.12.2018&Segments%5B1%5D.From=BCN&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=ברצלונה&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=24.12.2018");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[2]/div/div/div[2]/div[1]")).click();//Faster Flights###
        Thread.sleep(2000L);
        WebElement elementFaster = driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[2]/div/div/div[2]/div[2]"));
        String elementFasterTab1 = elementFaster.getText();
        String elementFasterTab2 = elementFasterTab1.substring(0,5);
        String elementFasterTab3 = elementFasterTab2.substring(1);
        String elementFasterTab4;
        elementFasterTab4 = elementFasterTab3.substring(0, elementFasterTab3.length() - 3) + elementFasterTab3.substring(elementFasterTab3.length() - 2);
        int fasterTab= Integer.parseInt(elementFasterTab4);
        //Found faster Tab Flights******

        WebElement elementFasterFirst = driver.findElement(By.xpath("//*[@class='result-info-row flight-segmet row '][position()=1]//*[@class='col-sm-6 padd-0-all'][position()=1]//*[@class='duration']"));//Flights Time
        String elementFasterFirst1 = elementFasterFirst.getText();
        String elementFasterFirst2 =elementFasterFirst1.substring(10,18);
        String elementFasterFirst3 = elementFasterFirst2.substring(0,4);
        String elementFasterFirst4;
        elementFasterFirst4 = elementFasterFirst3.substring(0, elementFasterFirst3.length() - 3) + elementFasterFirst3.substring(elementFasterFirst3.length() - 2);
        int fasterFirst= Integer.parseInt(elementFasterFirst4);
         //Found faster First Flights******
        WebElement elementFasterSec = driver.findElement(By.xpath("//*[@class='result-info-row flight-segmet row '][position()=2]//*[@class='col-sm-6 padd-0-all'][position()=1]//*[@class='duration']"));//Flights Time
        String elementFasterSec1 = elementFasterSec.getText();

        String elementFasterSec2 =elementFasterSec1.substring(10,18);
        String elementFasterSec3 = elementFasterSec2.substring(0,4);
        String elementFasterSec4;
        elementFasterSec4 = elementFasterSec3.substring(0, elementFasterSec3.length() - 3) + elementFasterSec3.substring(elementFasterSec3.length() - 2);
        int fasterSec= Integer.parseInt(elementFasterSec4);
        //Found faster First Flights******
        int fasterSearch= (fasterSec+fasterFirst)/2;
        Assert.assertEquals(fasterSearch, fasterTab); //Assert faster First vs fasterTab Flights******
        logger.info("Great, Found The Faster flight");
        Thread.sleep(2000L);
        driver.close();
        }}

     //  Collections.min(LowPrice));



