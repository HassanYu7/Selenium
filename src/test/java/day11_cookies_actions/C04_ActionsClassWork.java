package day11_cookies_actions;

import day08_relativeLocators_dropdown_testbase.Utilities.TestBase;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class C04_ActionsClassWork extends TestBase {
    @Test
    public void actions() {

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Sayfayı istediğimiz bir miktar aşağıya doğru scroll yapalım
        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN,Keys.PAGE_DOWN,Keys.PAGE_DOWN).perform();


        //Sayfayı istediğimiz bir miktar yukarıya doğru scroll yapalım
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP,Keys.PAGE_UP).perform();


        for (int i = 0; i <5 ; i++) {
            actions.sendKeys(Keys.PAGE_DOWN).perform();
            waitForSecond(1);
        }
        waitForSecond(3);

        for (int i = 0; i <5 ; i++) {
            actions.sendKeys(Keys.PAGE_UP).perform();
            waitForSecond(1);
        }
    }

    @Test
    public void actions01() {


        //Techproeducation sayfasına gidelim
        //Sayfanın en altına scroll yapalım
        //Sayfanın en üstüne scroll yapalım


    }



}