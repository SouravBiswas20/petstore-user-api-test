package com.sourav.petstore.api;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import com.sourav.petstore.model.User;



public class UserApi {
	
	private static final String USER_ENDPOINT = "https://petstore.swagger.io/v2/user";

    public static Response createUser(User user) {
    	String endpoint =USER_ENDPOINT;
    	System.out.println(endpoint);
        return given()
                .header("Content-Type", "application/json")
                .body(user)
                .when()
                .post(endpoint);
    }

    public static Response getUser(String username) {
    	String endpoint =USER_ENDPOINT + "/" + username;
    	System.out.println("getUser "+endpoint);
        return given()
                .when()
                .get(endpoint);
    }

    public static Response updateUser(String username, User user) {
        return given()
                .header("Content-Type", "application/json")
                .body(user)
                .when()
                .put(USER_ENDPOINT + "/" + username);
    }

    public static Response deleteUser(String username) {
    	String endpoint =USER_ENDPOINT + "/" + username;
    	System.out.println("deleteUser "+endpoint);
        return given()
                .when()
                .delete(endpoint);
    }
	
	
	

}
