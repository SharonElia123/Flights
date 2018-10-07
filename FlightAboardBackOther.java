package Flights;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class FlightAboardBackOther extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed {
        Thread.sleep(3000L);
        driver.manage().window().maximize();
        Thread.sleep(1000L);
        //Dates
        driver.findElement(By.xpath("//*[@id=\"wizardWrapper\"]/div[2]/div/div[1]/div/ul/li[2]/a/span")).click();//Check Flights and play with Radio Button
         Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/li[3]/label")).click();
        logger.info("Complete,radio Button");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).clear();
        Thread.sleep(2000L);
        //Check Engine***
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).sendKeys("תל אביב");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@class='parent ui-menu-item']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).clear();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).sendKeys("ברלין");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@data-type='ברלין' and @class='child ui-menu-item']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_date_0_0\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[3]/table/tbody/tr[4]/td[3]/a")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_1\"]")).sendKeys("פריז");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@data-type='פריז' and @class='child ui-menu-item']")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_1\"]")).clear();
        Thread.sleep(2000L);
        //Check Engine***
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_1\"]")).sendKeys("תל אביב");
        Screen h=new Screen();
        h.find("C:\\Images\\Flights\\TLV.png"); //identify pause button
        Thread.sleep(2000L);
        try {
            int click = h.click("C:\\Images\\Flights\\TLV.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"flights_date_0_1\"]")).click();
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[4]/td[7]/a")).click();
        Thread.sleep(2000L);
        logger.info("Complete, dest Other Way");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"round_way_form_section\"]/div/div[3]/div[2]/div/a")).click();
        logger.info("Great,Complete Search Other Way Flights");
        driver.close();
    }}



