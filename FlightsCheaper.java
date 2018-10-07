package Flights;

import org.apache.commons.collections.bag.SynchronizedSortedBag;
import org.apache.poi.util.SystemOutLogger;
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

import javax.jws.soap.SOAPBinding;
import javax.xml.soap.SOAPPart;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlightsCheaper extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }

    @Test
    public void Test2() throws InterruptedException, FindFailed {

        for(int i=1;i<=4;i++) {
            String flightsDes = " ";

            switch (i) {
                case 1:
                    flightsDes = "searchresults?Capacity.Adults=2&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=MUC&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=MUNICH&Segments%5B0%5D.Date=24.12.2018&Segments%5B1%5D.From=MUC&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=MUNICH&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=29.12.2018";//Berlin
                    break;
                case 2:
                    flightsDes = "searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=IST&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=ISTANBUL&Segments%5B0%5D.Date=25.12.2018&Segments%5B1%5D.From=IST&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=ISTANBUL&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=01.01.2019";
                    break;
                case 3:
                    flightsDes = "searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=DUB&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=DUBLIN&Segments%5B0%5D.Date=23.10.2018&Segments%5B1%5D.From=DUB&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=DUBLIN&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=27.10.2018";
                    break;
                case 4:
                    flightsDes = "searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=HER&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=כרתים&Segments%5B0%5D.Date=22.10.2018&Segments%5B1%5D.From=HER&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=כרתים&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=27.10.2018#";
                    break;
                default:
                    flightsDes = "ברלין";//Dan- TLV
                    break;
            }//Select flights des

            driver.get(test2 + "flights/" + flightsDes + "");
            driver.manage().timeouts().implicitlyWait(40L, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            Thread.sleep(2000L);
            List<WebElement> priceRoom = driver.findElements(By.xpath("//*[@class='brand-primary results-price']"));//List of Price
                        List<Integer> nums = new ArrayList();
            for (int s = 0; s < 2; s++) {
                String value3;
                String value1 = ((WebElement) priceRoom.get(s)).getText();
             String value2 = value1.substring(1);
                System.out.println(value2);
            if (value2.length() == 5) {
             value3 = value2.substring(0, value2.length() - 4) + value2.substring(value2.length() - 3);

                  }

            else {
                value3 = value2;

            }

            Integer valueP = Integer.parseInt(value3);

          nums.add(valueP);
           }
        int lowpriceCalc=Collections.min(nums);//Min price
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[1]/div/div/div[2]/div[1]")).click();//Cheaper Flights###
        WebElement elementCheap = driver.findElement(By.xpath("//*[@id=\"results-sort-row\"]/div/div/div[1]/div/div/div[2]/div[2]/span"));
        String elementCheap1 = elementCheap.getText();
        String elementCheap2 = elementCheap1.substring(1);
         String elementCheap3;
            if (elementCheap2.length() == 5) {

                elementCheap3 = elementCheap2.substring(0, elementCheap2.length() - 4) + elementCheap2.substring(elementCheap2.length() - 3);

            }

            else {
                elementCheap3 = elementCheap2;

            }
        int lowpriceTab=Integer.parseInt(elementCheap3);
        Assert.assertEquals(lowpriceCalc, lowpriceTab);//Assert tab low price to calc
        logger.info("Great, Cheaper working well");

            }
        }}
     //  Collections.min(LowPrice));



