package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TikiPage;


import java.util.concurrent.TimeUnit;

class TestTiki {

    String driverPath = "C:\\WebDriver";

    WebDriver driver;

    HomePage objHomePage;

    TikiPage objTikiPage;

    @BeforeTest
    public void setup(){

        System.setProperty("webdriver.gecko.driver", driverPath);

        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://tiki.vn/");

    }


    @Test(priority=0)
    public void test_one(){

        objTikiPage = new TikiPage(driver);

        objHomePage = new HomePage(driver);
        //Maximum the browser
        driver.manage().window().maximize();
        //Find Product sale
//        objTikiPage.writeInput("oppo");
//        objTikiPage.setInputbuttonsearch();

        driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys("oppo");
        driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();

        driver.findElement(By.cssSelector(".style__StyledItem-sc-18svp8n-0")).click();
    }
    @Test(priority = 1)
    public void test_one_ver1(){
        driver = new ChromeDriver();

        driver.get("https://tiki.vn/");

        objTikiPage = new TikiPage(driver);

        objHomePage = new HomePage(driver);

        driver.manage().window().maximize();

//        driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys("dien thoai samsung");
//        driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();        driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys("dien thoai samsung");
//        driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
        driver.findElement(By.cssSelector(".Item__Picture-m1oy8w-1")).click();
    }
}