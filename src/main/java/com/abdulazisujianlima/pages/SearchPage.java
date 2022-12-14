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

//    @FindBy(xpath = "//*[@id=\"noo-site\"]/header/div[3]/div[2]/form/label")
//    WebElement txtSearchPage;

    @FindBy(xpath = "//input[@name='s']")
    WebElement inpSearch;

    @FindBy (xpath = "//a[contains(text(),'dark blue vice high waisted slash knee skinny jean')]")
    WebElement txtSearchItem;



//    @FindBy (xpath = "//a[normalize-space()='nude shaggy faux fur coat']")
//    WebElement productTwo;

    @FindBy(xpath = "//p[@class='woocommerce-info woocommerce-no-products-found']")
    WebElement txtMessageNotFound;

    public void clickBtnSearch (){
        btnSearch.click();
        System.out.println("Button Search Clicked");
    }

    public void searchItem (String searchItem) {
        this.inpSearch.submit();
    }

    public void pressEnter(){
        inpSearch.submit();
    }

    public String getTxtJeans(){
        return txtSearchItem.getText();
    }

    public String getTxtMessageNotFound(){
        return txtMessageNotFound.getText();
    }
}
