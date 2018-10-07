package Flights;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class FlightsPeriodTime extends Util{
    @Before
     public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed, ParseException {
        driver.get(test2+"flights/searchresults?Capacity.Adults=2&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=TXL&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=BERLIN&Segments%5B0%5D.Date=01.01.2019&Segments%5B1%5D.From=TXL&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=BERLIN&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=08.01.2019");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"FlightDurationFilter\"]/div/div/div")).click();//FlightDurationFilter#
        Thread.sleep(2000L);
        WebElement From=driver.findElement(By.xpath("//*[@id=\"FlightDurationFilter-range\"]/span[1]"));
        //Using Action class for drag and drop.
        Actions actFirst=new Actions(driver);
        //Drag and Drop by Pixel.
        actFirst.dragAndDropBy(From,40, 0).build().perform();
        WebElement From1=driver.findElement(By.xpath("//*[@id=\"FlightDurationFilter-range\"]/span[2]"));
        //Using Action class for drag and drop.
        Actions actSec=new Actions(driver);
        //Drag and Drop by Pixel.
        actSec.dragAndDropBy(From1,-60, 0).build().perform();
        WebElement MinDuration = driver.findElement(By.xpath("//*[@id=\"collapseFlightDurationFilter\"]/li[2]/div/div[1]/div[1]/span[2]"));
        String MinDuration1 = MinDuration.getText();
        String MinDuration2;
         MinDuration2 = MinDuration1.substring(0, MinDuration1.length() - 3) + MinDuration1.substring(MinDuration1.length() - 2);
        int minDurationInt1= Integer.parseInt(MinDuration2);
        Thread.sleep(2000L);
        WebElement MinDurationAfter = driver.findElement(By.xpath("//*[@class='duration'][position()=1]"));

        String MinDurationAfter1 = MinDurationAfter.getText();
        String MinDurationAfter0=MinDurationAfter1.substring(9,18);
        String MinDurationAfter2;
        MinDurationAfter2=MinDurationAfter0.substring(0,6);
        String MinDurationAfter3;
        MinDurationAfter3 = MinDurationAfter2.substring(0, MinDurationAfter2.length() - 4)+ MinDurationAfter2.substring(MinDurationAfter2.length() - 3);
        String MinDurationAfter4=MinDurationAfter3.substring(0,4);
        System.out.println(MinDurationAfter4);
        int minDurationAfterInt1= Integer.parseInt(MinDurationAfter4);
        if (minDurationInt1>=minDurationAfterInt1 )// Check the Function of Between Duration

        {
            System.out.println("Great, we o.k with Min Duration filter");
        }

        else
        {
            System.out.println("Bug, we are not o.k with Min Duration filter");
        }
        driver.close();
    }
        }





