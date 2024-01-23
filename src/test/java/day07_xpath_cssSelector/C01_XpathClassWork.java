package day07_xpath_cssSelector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_XpathClassWork {
    //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
    //Add Element butonuna basin
    //Delete butonu'nun gorunur oldugunu test edin
    //Delete tusuna basin
    //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
    //sayfayı kapatınız


    @Test
    public void test01() throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        driver.findElement(By.xpath("//*[ contains( text(),'Add E'  ) ]")).click();
        Thread.sleep(3000);
        WebElement deleteButton=driver.findElement(By.xpath("//*[.='Delete']"));
        Assertions.assertTrue(deleteButton.isDisplayed());
        Thread.sleep(3000);
        deleteButton.click();
        WebElement addRemoveText=driver.findElement(By.xpath("//h3"));
        Assertions.assertTrue(addRemoveText.isDisplayed());
        driver.quit();
    }



}
