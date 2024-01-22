package day06_webelements_xpath;

import org.checkerframework.checker.units.qual.C;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_ClassWork {
    //https://testcenter.techproeducation.com/index.php adresine gidin
    // "Back to TechProEducation.com" butonunun kullanici erisimi icin etkin olup olmadigini test edin
    // "Applications lists" basligini tagname ile locate ederek görünür  olup olmadigini test ediniz


    @Test
    public void test01() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://testcenter.techproeducation.com/index.php");
        WebElement backToButton= driver.findElement(By.partialLinkText("Back to TechProEducation.com"));
        Assertions.assertTrue(backToButton.isEnabled());

        WebElement applicationLists=driver.findElement(By.tagName("h1"));
        Assertions.assertTrue(applicationLists.isDisplayed());
        driver.quit();


    }
}
