package com.herokuapp.tests;

import com.herokuapp.pages.DropdownPage;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import static com.herokuapp.pages.DropdownPage.LOGIN_URL;

public class DropdownTest extends BaseTest{
    @Test
    public void dropdownTest(){
        driver.get(LOGIN_URL);
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.clickOptiunea1("click");
        Assert.assertTrue(dropdownPage.clickSuccesfulOptiunea1());
        dropdownPage.clickOptiunea2("click");
        Assert.assertTrue(dropdownPage.clickSuccesfilOptiunea2());


    }
}
