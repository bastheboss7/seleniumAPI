package tests.rest;

import java.io.File;
import java.util.List;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

import static io.restassured.RestAssured.baseURI;


public class TC002_Verify_Delete_Not_Permitted extends RESTAssuredBase{

	@BeforeTest
	public void setValues() {

		testCaseName = "Verify that delete returns 404";
		testDescription = "Attempt to delete a record and verify it returns 404";
		nodes = "Incident";
		authors = "Baskar";
		category = "REST";
		dataFileName = "TC002";
		dataFileType = "JSON";
	}

	@Test()
	public void deleteIncident() {		
		
		// Post the request
		Response response = delete(baseURI+"articles/2");
		
		// Verify the response status code
		verifyResponseCode(response, 404);
		
		// Verify the response time
		verifyResponseTime(response, 10000);

	}


}





