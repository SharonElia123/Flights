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

import java.util.concurrent.TimeUnit;

public class FlightsFilters extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void StopFilters() throws InterruptedException, FindFailed {
        driver.get(test2+"flights/searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=BCN&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=ברצלונה&Segments%5B0%5D.Date=23.10.2018&Segments%5B1%5D.From=BCN&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=ברצלונה&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=27.10.2018");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
         FlightsCompanies();
         Thread.sleep(2000L);//Stopper Filter, One Stop###
        driver.findElement(By.xpath("//*[@id=\"collapseStops\"]/li[2]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        WebElement stop = driver.findElement(By.xpath("//*[@id=\"collapseStops\"]/li[2]/div[2]"));
        String stop1 = stop.getText();
        WebElement stop2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String stop3 = stop2.getText();
        Assert.assertEquals(stop3, stop1);
        logger.info("Great, Found The 1 Stop");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"collapseStops\"]/li[2]/div[1]/label/span")).click();
        Thread.sleep(2000L);//Stopper Filter, Direct Flights
        driver.findElement(By.xpath("//*[@id=\"collapseStops\"]/li[1]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        WebElement direct = driver.findElement(By.xpath("//*[@id=\"collapseStops\"]/li[1]/div[2]"));
        String direct1 = direct.getText();
        WebElement direct2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String direct3 = direct2.getText();
        Assert.assertEquals(direct3, direct1);
        logger.info("Great, Found The Direct Flights");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"collapseStops\"]/li[2]/div[1]/label/span"));
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"collapseStops\"]/li[1]/div[1]/label/span")).click();
        Thread.sleep(2000L);
          }
    @Test
    public void FlightsTypeFilters() throws InterruptedException, FindFailed {
        driver.get(test2+"flights/searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=BCN&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=ברצלונה&Segments%5B0%5D.Date=23.10.2018&Segments%5B1%5D.From=BCN&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=ברצלונה&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=27.10.2018");
        driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().window().maximize();
        Thread.sleep(5000L);//Filghts type Filter, Sadir###
        driver.findElement(By.xpath("//*[@id=\"collapseFlightTypeFilter\"]/li[1]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        WebElement sadir = driver.findElement(By.xpath("//*[@id=\"collapseFlightTypeFilter\"]/li[1]/div[2]"));
        String sadir1 = sadir.getText();
        WebElement sadir2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String sadir3 = sadir2.getText();
        Assert.assertEquals(sadir3, sadir1);
        logger.info("Great, Found The Sadir");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"collapseFlightTypeFilter\"]/li[1]/div[1]/label/span")).click();
        Thread.sleep(2000L);//LowCost
        driver.findElement(By.xpath("//*[@id=\"collapseFlightTypeFilter\"]/li[2]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        WebElement lowCost = driver.findElement(By.xpath("//*[@id=\"collapseFlightTypeFilter\"]/li[2]/div[2]"));
        String lowCost1 = lowCost.getText();
        WebElement lowCost2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String lowCost3 = lowCost2.getText();
        Assert.assertEquals(lowCost3, lowCost1);
        logger.info("Great, Found The LowCost Flights");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"collapseFlightTypeFilter\"]/li[2]/div[1]/label/span")).click();
        Thread.sleep(2000L);
        logger.info("Great, Found The LowCost");
    }
  @Test
    public void FlightsCompanies() throws InterruptedException, FindFailed {
      driver.get(test2+"flights/searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass=1&FilghtsWizardType=1&Segments%5B0%5D.From=TLV&Segments%5B0%5D.To=BCN&Segments%5B0%5D.FromName=תל%20אביב&Segments%5B0%5D.ToName=ברצלונה&Segments%5B0%5D.Date=23.10.2018&Segments%5B1%5D.From=BCN&Segments%5B1%5D.To=TLV&Segments%5B1%5D.FromName=ברצלונה&Segments%5B1%5D.ToName=תל%20אביב&Segments%5B1%5D.Date=27.10.2018");
       driver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"AirLineAllianceFilter\"]/div/div/div")).click();//Companies Flights Filter###
        for (int i=8;i<=9;i++)
        {
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"collapseAirLineAllianceFilter\"]/li["+i+"]/div[1]/label/span")).click();
        Thread.sleep(4000L);
        WebElement company = driver.findElement(By.xpath("//*[@id=\"collapseAirLineAllianceFilter\"]/li["+i+"]/div[2]"));
        String company1 = company.getText();
        WebElement company2 = driver.findElement(By.xpath("//*[@class='brand-primary results-price']"));
        String company3 = company2.getText();
        Assert.assertEquals(company3, company1);
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"collapseAirLineAllianceFilter\"]/li["+i+"]/div[1]/label/span")).click();
        logger.info("Great, Found The Company");

    }

}}

     //  Collections.min(LowPrice));



