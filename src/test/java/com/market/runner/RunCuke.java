package com.market.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"},
        glue = "com.market.tests")
public class RunCuke extends AbstractTestNGCucumberTests {


}
