package tests.rest;

import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.List;

import static io.restassured.RestAssured.baseURI;


public class TC003_Verify_Response_for_SpecificKey extends RESTAssuredBase{

	@BeforeTest
	public void setValues() {

		testCaseName = "Verify response for specific key";
		testDescription = "Get the articles response value for specific key and also the response code";
		nodes = "Incident";
		authors = "Baskar";
		category = "REST";
	}

	@Test()
	public void Articles() {
		
		// Get the request
		Response response = get(baseURI+"articles");

		// Get the items
		getContentsWithKey(response, "id");

		//Verify the value by Specific Key
		verifyContentWithKey(response, "title[2]", "£31 million pounds shortfall in economy");

	}


}





