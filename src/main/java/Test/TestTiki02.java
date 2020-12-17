package Test;

import com.opencsv.CSVReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TikiPage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestTiki02 {
public static void main(String[] args)throws Exception, IOException {
    System.setProperty("webdriver.chrome.driver","C:\\WebDriver\\chromedriver.exe");

    WebDriver driver;
    String baseUrl = "https://tiki.vn/";
    String CSV_File = "C:\\Users\\Acer\\IdeaProjects\\Seminar2\\TestScript\\src\\main\\java\\data\\Detail.CSV";

    driver = new ChromeDriver();
    driver.get(baseUrl);
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    CSVReader reader = new CSVReader(new FileReader(CSV_File));
    String [] csvCell;
    while ((csvCell = reader.readNext()) != null) {
        for(int i=0;i<1;i++) {
            String name1 = csvCell[i];
            String soluong1 =csvCell[i+1];
            String name2 = csvCell[i+2];
            String soluong2=csvCell[i+3];
            String name3 = csvCell[i+4];
            String soluong3=csvCell[i+5];
            //samsung,iphone,oppo
            int tg = 1000;
            //search
            Thread.sleep(tg);
            driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys(name1);
            driver.findElement(By.id("onesignal-slidedown-cancel-button")).click();
            driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
            driver.findElement(By.cssSelector(".style__StyledItem-sc-18svp8n-0")).click();
            driver.findElement(By.cssSelector(".btn-add-to-cart")).click();


            Thread.sleep(tg);
            driver.get(baseUrl);
            driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys(name1);
            driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
            driver.findElement(By.cssSelector(".style__StyledItem-sc-18svp8n-0")).click();



            Thread.sleep(tg);
            int sl1 = Integer.parseInt(soluong1);
            if(sl1>1) {
                for (i=1;i<sl1-1;i++) {
                    driver.findElement(By.cssSelector(".input")).click();
                    driver.findElement(By.cssSelector(".input")).clear();
                    driver.findElement(By.cssSelector(".input")).sendKeys(soluong1);
                }
                driver.findElement(By.cssSelector(".btn-add-to-cart")).click();
            }


//////////////////////////////////////////////////////////////
            Thread.sleep(tg);
            driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys(name2);
            driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
            driver.findElement(By.cssSelector(".style__StyledItem-sc-18svp8n-0")).click();
            driver.findElement(By.cssSelector(".btn-add-to-cart")).click();


            Thread.sleep(tg);
            driver.get(baseUrl);
            driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys(name2);
            driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
            driver.findElement(By.cssSelector(".style__StyledItem-sc-18svp8n-0")).click();



            Thread.sleep(tg);
            int sl2 = Integer.parseInt(soluong2);
            if(sl2>1) {
                for (i=1;i<sl2;i++) {
                    driver.findElement(By.cssSelector(".input")).click();
                    driver.findElement(By.cssSelector(".input")).clear();
                    driver.findElement(By.cssSelector(".input")).sendKeys(soluong2);
                }
                driver.findElement(By.cssSelector(".btn-add-to-cart")).click();
            }

//////////////////////////////////////////////////
            Thread.sleep(tg);
            driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys(name3);
            driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
            driver.findElement(By.cssSelector(".style__StyledItem-sc-18svp8n-0")).click();
            driver.findElement(By.cssSelector(".btn-add-to-cart")).click();


            Thread.sleep(tg);
            driver.get(baseUrl);
            driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys(name3);
            driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
            driver.findElement(By.cssSelector(".style__StyledItem-sc-18svp8n-0")).click();



            Thread.sleep(tg);
            int sl3 = Integer.parseInt(soluong3);
            if(sl3>1) {
                for (i=1;i<sl3;i++) {
                    driver.findElement(By.cssSelector(".input")).click();
                    driver.findElement(By.cssSelector(".input")).clear();
                    driver.findElement(By.cssSelector(".input")).sendKeys(soluong3);
                }
                driver.findElement(By.cssSelector(".btn-add-to-cart")).click();
            }
////////////////////////////////////////////////////
            driver.get("https://tiki.vn/checkout/cart?src=header_cart");

            String s4 = driver.findElement(By.cssSelector(".prices__value")).getText();
            System.out.println("Tong so tien = "+s4 +"dong");

            int tongsl=sl1+sl2+sl3;
            System.out.println("So luong = "+tongsl);
        }
    }
}

}
