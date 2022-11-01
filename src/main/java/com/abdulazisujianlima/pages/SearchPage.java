package com.abdulazisujianlima.pages;

import com.abdulazisujianlima.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
    private WebDriver driver;

    public SearchPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='noo-search']")
    WebElement btnSearch;

    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/label")
    WebElement txtSearchPage;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inpNameProduct;

    @FindBy (xpath = "//a[contains(text(),'dark blue vice high waisted slash knee skinny jean')]")
    WebElement productOne;



    @FindBy (xpath = "//a[normalize-space()='nude shaggy faux fur coat']")
    WebElement productTwo;

    public void clickBtnSearch (){
        btnSearch.click();
        System.out.println("Button Search Clicked");
    }
}
