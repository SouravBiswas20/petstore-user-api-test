package com.sourav.petstore.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sourav.petstore.api.UserApi;
import com.sourav.petstore.model.User;
import com.sourav.petstore.setup.BaseTest;

import io.restassured.response.Response;

public class UserCrudTests extends BaseTest {
 
	 private final String testUsername = "sourav";

	    @Test(priority = 1)
	    public void createUserTest() {
	        User user = User.builder()
	                .id(101)
	                .username(testUsername)
	                .firstName("Sourav")
	                .lastName("Biswas")
	                .email("sourav@example.com")
	                .password("test123")
	                .phone("9876543210")
	                .userStatus(1)
	                .build();

	        Response response = UserApi.createUser(user);
	        Assert.assertEquals(response.statusCode(), 200);
	    }

	    @Test(priority = 2)
	    public void getUserTest() {
	        Response response = UserApi.getUser(testUsername);
	        Assert.assertEquals(response.statusCode(), 200);
	    }

	    @Test(priority = 3)
	    public void updateUserTest() {
	        User updated = User.builder()
	                .id(101)
	                .username(testUsername)
	                .firstName("UpdatedSourav")
	                .email("sourav.updated@example.com")
	                .password("newpass123")
	                .build();

	        Response response = UserApi.updateUser(testUsername, updated);
	        Assert.assertEquals(response.statusCode(), 200);
	    }

	    @Test(priority = 4)
	    public void deleteUserTest() {
	        Response response = UserApi.deleteUser(testUsername);
	        Assert.assertEquals(response.statusCode(), 200);
	    }
	
	
	
	
}
