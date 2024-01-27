package day08_relativeLocators_dropdown_testbase.Utilities;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public abstract class TestBase {

    protected WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @AfterEach
    public void tearDown() {
       // driver.quit();
    }

    public void waitForSecond(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public  void  selectVisibleText(WebElement ddm,String option){
        Select select = new Select(ddm);
        select.selectByVisibleText(option);
    }
public void selectIndex(WebElement ddm,int idx){
        Select select=new Select(ddm);
        select.selectByIndex(idx);
}
public void switchToWindow(int index){
        driver.switchTo().window(driver.getWindowHandles().toArray()[index].toString());
}

}