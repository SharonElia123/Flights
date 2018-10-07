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

import java.text.ParseException;
import java.util.concurrent.TimeUnit;

public class FlightsHourTime extends Util{

    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed, ParseException {
        driver.get(test2+"flights/searchresults?Capacity.Adults=2&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=TXL&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=BERLIN&Segments%5B0%5D.Date=23.10.2018&Segments%5B1%5D.From=TXL&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=BERLIN&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=27.10.2018");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(6000L);
        driver.findElement(By.xpath("//*[@id=\"FlightTimeDepartureFilter_0\"]/div/div/div")).click();//FlightDurationFilter#
        Thread.sleep(2000L);
        WebElement From=driver.findElement(By.xpath("//*[@id=\"FlightTimeDepartureFilter_0-range\"]/span[1]"));
        //Using Action class for drag and drop.
        Actions actFirst=new Actions(driver);
        //Drag and Drop by Pixel.
        actFirst.dragAndDropBy(From,30, 0).build().perform();
         WebElement From1=driver.findElement(By.xpath("//*[@id=\"FlightTimeDepartureFilter_0-range\"]/span[2]"));
        //Using Action class for drag and drop.
        Actions actSec=new Actions(driver);
        //Drag and Drop by Pixel.
        actSec.dragAndDropBy(From1,-125, 0).build().perform();
        WebElement MaxDuration = driver.findElement(By.xpath("//*[@id=\"collapseFlightTimeDepartureFilter_0\"]/li[2]/div/div[1]/div[1]/span[2]"));
        String MaxDuration1 = MaxDuration.getText();
        String MaxDuration2;
        MaxDuration2 = MaxDuration1.substring(0, MaxDuration1.length() - 3) + MaxDuration1.substring(MaxDuration1.length() - 2);
        String maxDuration3;
        maxDuration3=MaxDuration2.substring(1);

        int maxDurationInt1= Integer.parseInt(maxDuration3);
        System.out.println(maxDurationInt1);
        Thread.sleep(3000L);
        WebElement MinDurationAfter = driver.findElement(By.xpath("//*[@class='departure-hour'][position()=1]"));
        String MinDurationAfter1 = MinDurationAfter.getText();
        String MinDurationAfter2;
        MinDurationAfter2=MinDurationAfter1.substring(1,5);
        String MinDurationAfter3;
        MinDurationAfter3 = MinDurationAfter2.substring(0, MinDurationAfter2.length() - 3) + MinDurationAfter2.substring(MinDurationAfter2.length() - 2);
        int minDurationAfterInt1= Integer.parseInt(MinDurationAfter3);
        System.out.println(minDurationAfterInt1);
        if (maxDurationInt1>=minDurationAfterInt1 )// Check the Function of Between Duration
        {
            System.out.println("Great, we o.k with Min Duration filter");
        }

        else
        {
            System.out.println("Bug, we are not o.k with Min Duration filter");
        }
        driver.close();
            }}





