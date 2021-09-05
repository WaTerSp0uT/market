package com.market.tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PayPalTest {

    @Given("^I want to get access token from Paypal api$")
            public void i_want_to_get_access_token_from_Paypal_api(){

    }

    @When("^I set currency code as \"([^\"]*)\" and value as \"([^\"]*)\"$")
    public void i_set_currency_code_as_USD_and_value_usdValue(String currencyCode, String currencyValue){
        System.out.println("currencyCode->"+currencyCode);
        System.out.println("currencyValue->"+currencyValue);
    }


    @And("^I verify the status as CREATED$")
    public void i_verify_the_status_as_CREATED(){

    }
}
