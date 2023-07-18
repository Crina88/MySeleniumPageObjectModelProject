package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownPage extends BasePage {
    public static String LOGIN_URL = BASE_URL + "dropdown";

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown") private WebElement dropdownElement;
    @FindBy(xpath = "//*[@id=\"dropdown\"]/option[2]") private WebElement optiunea1;
    @FindBy(xpath ="//*[@id=\"dropdown\"]/option[3]") private WebElement optiunea2;


    public void clickOptiunea1(String optiunea) {
        optiunea1.click();

    }
    public void clickOptiunea2(String optiunnea){
        optiunea2.click();
    }
    public boolean clickSuccesfulOptiunea1(){return optiunea1.isSelected();}
    public boolean clickSuccesfilOptiunea2(){return optiunea2.isSelected();}

}