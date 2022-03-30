package tests.rest;

import java.io.File;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;

import static io.restassured.RestAssured.baseURI;


public class TC001_Verify_ContentType_StatusCode_Get extends RESTAssuredBase{

	@BeforeTest
	public void setValues() {

		testCaseName = "Content type and Response code";
		testDescription = "Verify the content type to be JSON and resonponse code to be 200";
		nodes = "Incident";
		authors = "Baskar";
		category = "REST";
		dataFileName = "TC001";
		dataFileType = "JSON";
	}

	@Test
	public void verifyResponseCode() {
		
		// Get the request
		Response response = get(baseURI+"articles");
		
		// Verify the Content type
		verifyContentType(response, "JSON");
		
		// Verify the response status code
		verifyResponseCode(response, 200);
		
		// Verify the response time
		verifyResponseTime(response, 10000);
		
	}


}





