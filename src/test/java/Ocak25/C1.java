package Ocak25;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C1 {
    @Test
    public void test01() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://techproeducation.com");
        WebElement searchBox=driver.findElement(By.id("searchHeaderInput"));
        String actualTagName=searchBox.getTagName();
        String expectedTagName="input";
        Assertions.assertEquals(expectedTagName,actualTagName);
        String actualAttributeValue=searchBox.getAttribute("class");
        String expectedAttributeValue="form-input";
        Assertions.assertEquals(expectedAttributeValue,actualAttributeValue);
        driver.quit();

    }
}
