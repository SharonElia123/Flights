package Flights;

import SanityTest.EngineTest;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FlightsMobile {
    static WebDriver driver;
    static String test1 = "http://www.eshet.com/";
    static String test2 = "http://www.eshet.com/";
    static String test3 = "https://www.eshet-tours.com/";
    static String test4 = "https://www.eshet.com/";
    static String test5 = "https://sport.eshet.com/";
    static String test6 = "https://mvcsportest.eshet.com/sport/";
    static EngineTest et = new EngineTest();
    final static Logger logger = LoggerFactory.getLogger("Test:");

    @Before
    public void openwindow() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/SeleniumDrivers/Java/Driver/update/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(test4);
     //   driver.get("https://chrome.google.com/webstore/detail/user-agent-switcher-for-c/djflhoibgkdhkhhcedjiklpkjnoahfmg");
        driver.manage().timeouts().implicitlyWait(10L, TimeUnit.SECONDS);

    }

    @Test
    public void test3() throws InterruptedException, FindFailed, AWTException {
        driver.manage().window().maximize();
        Thread.sleep(1000L);
        Screen add = new Screen();
        Thread.sleep(1000L);
        add.find("C:\\Images\\AddToChrome.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = add.click("C:\\Images\\AddToChrome.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(10000L);

        Screen addExt = new Screen();
        Thread.sleep(1000L);
        addExt.find("C:\\Images\\AddExt.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = addExt.click("C:\\Images\\AddExt.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);

        Screen addExt1 = new Screen();
        Thread.sleep(1000L);
        addExt1.find("C:\\Images\\AddExt1.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = addExt1.click("C:\\Images\\AddExt1.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(2000L);
        driver.get(test2);
        Thread.sleep(1000L);
        Screen ios = new Screen();
        Thread.sleep(1000L);
        ios.find("C:\\Images\\IOS.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = ios.click("C:\\Images\\IOS.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        Screen iphone = new Screen();
        Thread.sleep(1000L);
        iphone.find("C:\\Images\\iphone6.png"); //identify pause button
        Thread.sleep(1000L);
        try {
            int click = iphone.click("C:\\Images\\iphone6.png");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }

       //-------------------------------
        Thread.sleep(2000L);
        FlightEngineMultiWay();
        Thread.sleep(1000L);
        FlightEnginetwoWay();
        Thread.sleep(1000L);
        FlightEngineOneWay();

    }

    public void FlightEngineOneWay() throws InterruptedException, FindFailed {
        driver.get(test2 + "flights");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/div[2]/span")).click();
        logger.info("One Way");
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"from_destination_0\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).clear();
        Thread.sleep(2000L);
        //Engine Test Vacation Hotel#############################################
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).sendKeys("תל אביב");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found TLV");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"to_destination_0\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).sendKeys("לונדון");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[3]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found London");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"segment_dates_0\"]/div/div")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"flights_date_0_0\"]/div/table/tbody/tr[5]/td[2]/a")).click();
         Thread.sleep(1000L);
        Screen bce=new Screen();//Keep
        bce.find("C://Images/Flights/Mobile/Keep.PNG");
        try {
            int click = bce.click("C://Images/Flights/Mobile/Keep.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_capacity\"]/div/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_service_class_input\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_service_class_container\"]/ul/li[1]/div")).click();
        Thread.sleep(1000L);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flightsCapacityPage\"]/div[2]/div/div/div[3]/a")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flightsSearchForm\"]/div/div[5]/a/span")).click();
        Thread.sleep(1000L);

    }

    public void FlightEnginetwoWay() throws InterruptedException, FindFailed {
        driver.get(test2 + "flights");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/div[2]/span")).click();
        logger.info("Two Way");
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"from_destination_0\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).clear();
        Thread.sleep(2000L);
        //Engine Test Vacation Hotel#############################################
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).sendKeys("תל אביב");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found TLV");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"to_destination_0\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).sendKeys("לונדון");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[3]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found London");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"segment_dates_0\"]/div/div")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"flights_date_0_0\"]/div/table/tbody/tr[5]/td[2]/a")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_date_1_0\"]/div/table/tbody/tr[5]/td[5]/a")).click();
        Thread.sleep(3000L);

        Screen bce=new Screen();//Keep
        bce.find("C://Images/Flights/Mobile/Keep.PNG");
        try {
            int click = bce.click("C://Images/Flights/Mobile/Keep.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_capacity\"]/div/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_service_class_input\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_service_class_container\"]/ul/li[1]/div")).click();
        Thread.sleep(1000L);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flightsCapacityPage\"]/div[2]/div/div/div[3]/a")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flightsSearchForm\"]/div/div[5]/a/span")).click();
        Thread.sleep(1000L);


    }
    public void FlightEngineMultiWay() throws InterruptedException, FindFailed {
        driver.get(test2 + "flights");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"flights_search_type\"]/div[3]/span")).click();
        logger.info("Multi Way");
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"from_destination_0\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).clear();
        Thread.sleep(2000L);
        //Engine Test Vacation Hotel#############################################

        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_0\"]")).sendKeys("תל אביב");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]/li[2]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found TLV");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"to_destination_0\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_0\"]")).sendKeys("ברלין");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]/li[3]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found Flight1");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"segment_dates_0\"]/div/div")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"flights_date_0_0\"]/div/table/tbody/tr[5]/td[2]/a")).click();
        Thread.sleep(2000L);
        Screen bce=new Screen();//Keep
        bce.find("C://Images/Flights/Mobile/Keep.PNG");
        try {
            int click = bce.click("C://Images/Flights/Mobile/Keep.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"from_destination_1\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_1\"]")).clear();
        Thread.sleep(2000L);
        //Engine Test Vacation Hotel#############################################
        driver.findElement(By.xpath("//*[@id=\"flights_from_dest_input_1\"]")).sendKeys("לונדון");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]/li[2]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found London");
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"to_destination_1\"]/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_1\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_1\"]")).clear();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_to_dest_input_1\"]")).sendKeys("תל אביב");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"ui-id-4\"]/li[2]")).click();
        Thread.sleep(1000L);
        logger.info("Great, Found Flight2");
        Thread.sleep(2000L);
        driver.findElement(By.xpath("//*[@id=\"segment_dates_1\"]/div/div")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"flights_date_0_1\"]/div/table/tbody/tr[5]/td[5]/a")).click();
        Thread.sleep(2000L);
        bce.find("C://Images/Flights/Mobile/Keep.PNG");
        try {
            int click = bce.click("C://Images/Flights/Mobile/Keep.PNG");
        } catch (FindFailed findFailed) {
            findFailed.printStackTrace();
        }
        Thread.sleep(1000L);

        driver.findElement(By.xpath("//*[@id=\"multi_way_form_section\"]/div[4]/div/span/span[1]/i")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"multi_way_form_section\"]/div[2]/div[1]/div/div[2]/span")).click();
        Thread.sleep(3000L);
        driver.findElement(By.xpath("//*[@id=\"flights_capacity\"]/div/div/div")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_service_class_input\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flights_service_class_container\"]/ul/li[1]/div")).click();
        Thread.sleep(1000L);
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flightsCapacityPage\"]/div[2]/div/div/div[3]/a")).click();
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"flightsSearchForm\"]/div/div[5]/a/span")).click();
        Thread.sleep(1000L);


    }








}

