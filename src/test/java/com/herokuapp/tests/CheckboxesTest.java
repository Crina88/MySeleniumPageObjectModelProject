package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxesPage;
import com.herokuapp.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.herokuapp.pages.CheckboxesPage.LOGIN_URL;

public class CheckboxesTest extends BaseTest{
    @Test
    public void checkboxesTest(){
        driver.get(LOGIN_URL);
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.clickCheckbox1("click");
        Assert.assertTrue(checkboxesPage.clickSuccessCheckbox1IsTrue());
        checkboxesPage.clickCheckbox2("click");
        Assert.assertTrue(checkboxesPage.clickSuccessCheckbox2IsTrue());
        checkboxesPage.deselectezCheckbox1("click");
        Assert.assertFalse(checkboxesPage.clickSuccessCheckbox1IsTrue());
        checkboxesPage.deselectezCheckbox2("click");
        Assert.assertFalse(checkboxesPage.clickSuccessCheckbox2IsTrue());




    }
}
