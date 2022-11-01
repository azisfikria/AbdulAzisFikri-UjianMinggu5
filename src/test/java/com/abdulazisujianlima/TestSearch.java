package com.abdulazisujianlima;

import com.abdulazisujianlima.pages.LoginPage;
import com.abdulazisujianlima.pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestSearch {
    WebDriver driver;
    private static ExtentTest extentTest;

    private SearchPage searchPage = new SearchPage();

    public TestSearch(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click search")
    public void user_click_search(){

    }

    @And("User enter product jeans")
    public void user_enter_product_jeans(){

    }


}
