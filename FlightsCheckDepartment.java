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

public class FlightsCheckDepartment extends Util{
    @Before
    public void openwindow() throws InterruptedException {
        openChrome();
    }
    @Test
    public void Test2() throws InterruptedException, FindFailed {
        driver.manage().window().maximize();
        Thread.sleep(2000L);
        for(int i=1;i<=4;i++)
        {
        driver.get(test1+"flights/searchresults?Capacity.Adults=1&Capacity.Children=0&Capacity.Infants=0&Capacity.Youth=0&Capacity.Senior=0&Airline=&DirectOnly=false&IncludeOtherAirports=false&FlexibleSearch=false&ServiceClass="+i+"&FilghtsWizardType=0&Segments%5B0%5D.From=TLV&Segments%5B0%5D.FromName=%D7%AA%D7%9C%20%D7%90%D7%91%D7%99%D7%91&Segments%5B0%5D.To=NYC&Segments%5B0%5D.ToName=%D7%A0%D7%99%D7%95%20%D7%99%D7%95%D7%A8%D7%A7&Segments%5B0%5D.Date=26.12.2018");
          Thread.sleep(5000L);
            String department = " ";
            switch (i) {
                case 1:
                    department = "תיירים";//Tourist
                    break;
                case 2:
                    continue;
                case 3:
                    department = "עסקים";//Buisness
                    break;
                case 4:
                    department = "מח' ראשונה";//First Class
                    break;

                default:
                    department = "שרון";//Sharon
                    break;
            }//Case Department

            WebElement DepartmentSerach = driver.findElement(By.xpath("//*[@class='family-fare-name hover-line']"));
            String DepartmentSerach1 = DepartmentSerach.getText();
           if(DepartmentSerach1.contains(department))
           {

               System.out.println("Great");

        }

        else{
               System.out.println("Bug");
           }
        logger.info("Great, Found The Correct DepartMents flight");
          }}}





