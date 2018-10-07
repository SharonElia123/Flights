package Flights;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class FlightsHourTimeLand extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed, ParseException {
        driver.get(test1+"flights/searchresults?Capacity.Adults=2&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=TXL&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=BERLIN&Segments%5B0%5D.Date=01.01.2019&Segments%5B1%5D.From=TXL&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=BERLIN&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=08.01.2019");
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(6000L);
        driver.findElement(By.xpath("//*[@id=\"FlightTimeDepartureFilter_0\"]/div/div/div")).click();//FlightDurationFilter#
        Thread.sleep(2000L);
        WebElement From=driver.findElement(By.xpath("//*[@id=\"FlightTimeArrivalFilter_1-range\"]/span[1]"));
        //Using Action class for drag and drop.
        Actions actFirst=new Actions(driver);
        //Drag and Drop by Pixel.
        actFirst.dragAndDropBy(From,30, 0).build().perform();
        WebElement From1=driver.findElement(By.xpath("//*[@id=\"FlightTimeArrivalFilter_1-range\"]/span[2]"));
        //Using Action class for drag and drop.
        Actions actSec=new Actions(driver);
        //Drag and Drop by Pixel.
        actSec.dragAndDropBy(From1,-70, 0).build().perform();
        WebElement MinDuration = driver.findElement(By.xpath("//*[@id=\"collapseFlightTimeDepartureFilter_0\"]/li[8]/div/div[1]/div[2]/span[2]"));
        Thread.sleep(2000L);
        String MinDuration1 = MinDuration.getText();
        String MinDuration2;
        MinDuration2 = MinDuration1.substring(0, MinDuration1.length() - 3) + MinDuration1.substring(MinDuration1.length() - 2);
        int minDurationInt1= Integer.parseInt(MinDuration2);
        WebElement MinDurationAfter = driver.findElement(By.xpath("//*[@class='result-info-row flight-segmet row '][position()=2]//*[@class='col-sm-3 col-md-left-0 text-center'][position()=2]//*[@class='departure-hour']"));
        Thread.sleep(2000L);
        String MinDurationAfter1 = MinDurationAfter.getText();
       // System.out.println(MinDurationAfter1);
        String MinDurationAfter2;
        MinDurationAfter2=MinDurationAfter1.substring(0,5);
        String MinDurationAfter3;
        MinDurationAfter3 = MinDurationAfter2.substring(0, MinDurationAfter2.length() - 3) + MinDurationAfter2.substring(MinDurationAfter2.length() - 2);
        int minDurationAfterInt1= Integer.parseInt(MinDurationAfter3);
        System.out.println(minDurationAfterInt1);
        if (minDurationInt1<=minDurationAfterInt1 )// Check the Function of Between Duration

        {
            System.out.println("Great, we o.k with Min Duration filter");
        }

        else
        {
            System.out.println("Bug, we are not o.k with Min Duration filter");
        }
        driver.close();
            }}





