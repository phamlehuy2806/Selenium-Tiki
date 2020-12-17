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
    String driverPath = "C:\\WebDriver";
    String CSV_file = "C:\\Users\\Acer\\IdeaProjects\\Seminar2\\TestScript\\src\\main\\java\\data.CSV";

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

    @Test
    public void verify_Search() throws InterruptedException, IOException{

        //CSVReader
        CSVReader reader = new CSVReader(new FileReader(CSV_file));
        String[] cell;

        while((cell=reader.readNext())!=null){

            for(int i=0; i<1; i++){
                String Title = cell[i];
                driver.findElement(By.cssSelector(".FormSearch__Input-sc-1fwg3wo-2")).sendKeys(Title);
                driver.findElement(By.cssSelector(".FormSearch__Button-sc-1fwg3wo-3")).click();
            }
        }
    }
}
