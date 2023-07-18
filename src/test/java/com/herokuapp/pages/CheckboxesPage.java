package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckboxesPage extends BasePage{
    public static String LOGIN_URL = BASE_URL+"checkboxes";
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[1]") private WebElement checkbox1;
    @FindBy(xpath = "//*[@id=\"checkboxes\"]/input[2]") private WebElement checkbox2;

    public void clickCheckbox1 (){
        checkbox1.click();
    }
    public void clickCheckbox2 (){
        if (!checkbox2.isSelected()){
            checkbox2.click();
        }
    }
    public void deselectezCheckbox1 (){
        if (checkbox1.isSelected()){
            checkbox1.click();
        }
    }
    public void deselectezCheckbox2 (){
        if (checkbox2.isSelected()){
            checkbox2.click();
        }
    }
    public boolean clickSuccessCheckbox1IsTrue (){return checkbox1.isSelected();};
    public boolean clickSuccessCheckbox2IsTrue (){return checkbox2.isSelected();};

}
