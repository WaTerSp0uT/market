package com.market.base;

import io.restassured.RestAssured;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static Properties config = new Properties();

    public static FileInputStream fis;

    public static void init() {

        try {
            fis = new FileInputStream("/config.properties");
            config.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }

        RestAssured.baseURI = config.getProperty("baseURI");

    }
}
