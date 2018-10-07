package Flights;

import org.apache.poi.util.SystemOutLogger;
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
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class FlightsAvgPrice extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.get(test2+"flights/searchresults?Capacity.Adults=2&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=TXL&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=BERLIN&Segments%5B0%5D.Date=16.12.2018&Segments%5B1%5D.From=TXL&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=BERLIN&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=22.12.2018");
        driver.manage().timeouts().implicitlyWait(60L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        WebElement From=driver.findElement(By.xpath("//*[@id=\"InternationalFlightsPriceRange-range\"]/span[1]"));//Avg Price############################
        //Using Action class for drag and drop.
        Actions actFirst=new Actions(driver);
        //Drag and Drop by Pixel.
        actFirst.dragAndDropBy(From,20, 0).build().perform();
        WebElement From1=driver.findElement(By.xpath("//*[@id=\"InternationalFlightsPriceRange-range\"]/span[2]"));
        //Using Action class for drag and drop.
        Actions actSec=new Actions(driver);
        //Drag and Drop by Pixel.
        actSec.dragAndDropBy(From1,-120, 0).build().perform();// Calc Between Min and Max price
        WebElement MinPrice = driver.findElement(By.xpath("//*[@id=\"collapseInternationalFlightsPriceRange\"]/li/div/div[1]/div[2]/span[2]"));
        String minPrice1 = MinPrice.getText();
        WebElement maxPrice = driver.findElement(By.xpath("//*[@id=\"collapseInternationalFlightsPriceRange\"]/li/div/div[1]/div[1]/span[2]"));
        String maxPrice1 = maxPrice.getText();
        int minPrice2= Integer.parseInt(minPrice1);
        int maxPrice2= Integer.parseInt(maxPrice1);
        Thread.sleep(2000L);
        logger.info("Great, Found The between prices");// Calc Between Min and Max price
        WebElement minPriceAfter = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));;//The First Price
        String minPriceAfter1 = minPriceAfter.getText();
        logger.info("Great, Found The Min and Max after filter");
        Thread.sleep(2000L);
        String minPriceAfter2 = minPriceAfter1.substring(1);
        Integer minPriceAfter3 = Integer.parseInt(minPriceAfter2);
        if (minPriceAfter3>=minPrice2 )// Check the Function of Between Avg Price

        {
            System.out.println("Great, we o.k with Avg Min Price filter");
        }

       else
        {
            System.out.println("Bug, we are not o.k with Avg Price filter");
        }
        logger.info("Great, complete The Avg Price filter");
        driver.close();
        }

}





