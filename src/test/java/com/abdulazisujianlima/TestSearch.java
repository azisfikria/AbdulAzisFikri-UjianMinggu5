package com.abdulazisujianlima;

import com.abdulazisujianlima.pages.SearchPage;
import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
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


    @When("User click button search")
    public void user_click_button_search(){

    }

    @And("User enter first product name")
    public void user_enter_product_name(){

    }
    @And("User choose product jeans")
    public void user_choose_product_jeans(){

    }
    @And("User pick colour size jeans")
    public void user_pick_colour_size_jeans(){

    }
    @Then("User click add to cart")
    public void user_click_addToCart_jeans(){

    }
    @When("User click button search second")
    public void user_click_button_search_second(){

    }
    @And("User enter second product name")
    public void user_enter_second_product_name(){

    }

    @And("User choose product coat")
    public void user_choose_product_coat(){

    }
    @And("User pick colour size coat")
    public void user_pick_colour_size_coat(){

    }

    @Then("User click add to cart")
    public void user_click_addToCart_coat(){

    }

}
