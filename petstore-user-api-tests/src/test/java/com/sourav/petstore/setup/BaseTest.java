package com.sourav.petstore.setup;

import io.restassured.RestAssured;

public class BaseTest {

    public static void setup() {
        RestAssured.baseURI = "https://petstore.swagger.io/v2";
    }
}
