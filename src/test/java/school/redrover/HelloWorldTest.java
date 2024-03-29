package school.redrover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void getUrlTest (){
   ChromeOptions chromeOptions = new ChromeOptions();
     chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        for (int i=0;i<3;i++){
            WebDriver driver = new ChromeDriver(chromeOptions);
            driver.get("http:/google.com");
            driver.quit();
        }
    }

@Ignore
@Test

    public void firstTestOK() throws InterruptedException {
//      ChromeOptions chromeOptions = new ChromeOptions();
//      chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriver driver= new ChromeDriver();
        driver.get("https://ya.ru/");
        WebElement news= driver.findElement(By.xpath("//*[@id=\"text\"]"));
        news.sendKeys("Moscow");
        Thread.sleep(2000);
      //  WebElement but = driver.findElement(By.xpath("/html/body/main/div[3]/form/div[2]/button"));
      //  but.click();
        Thread.sleep(2000);

      //  WebElement text  = driver.findElement(By.xpath("//*[@id=\"search-result\"]/li[1]/div/div[1]/a/h2/span"));
        //Assert.assertEquals(text.getText(),  "Moscow - Wikipedia");
        driver.quit();
    }

    @Test
    public void printTest (){
        System.out.println("Hi");
    }

    @Test
    public void wikiTest() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
       chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");
        WebDriver driver= new ChromeDriver(chromeOptions);
        driver.get("https://ru.wikipedia.org/wiki/%D0%97%D0%B0%D0%B3%D0%BB%D0%B0%D0%B2%D0%BD%D0%B0%D1%8F_%D1%81%D1%82%D1%80%D0%B0%D0%BD%D0%B8%D1%86%D0%B0");
        WebElement but = driver.findElement(By.xpath("//*[@id=\"Добро_пожаловать_в_Википедию,\"]/a"));
        but.click();
        Thread.sleep(2000);
        WebElement txt = driver.findElement(By.xpath("//*[@id=\"firstHeading\"]/span"));
        Assert.assertEquals(txt.getText(), "Википедия");

        driver.quit();

    }



}
