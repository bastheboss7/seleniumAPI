package tests.selenium;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import lib.rest.RESTAssuredBase;
import lib.selenium.PreAndPost;
import lib.utils.HTMLReporter;
import pages.selenium.LoginPage;
import sun.security.krb5.Config;

import static io.restassured.RestAssured.baseURI;

public class TC004_Compare_BrowserURL_with_JSON extends PreAndPost {

    @BeforeTest
    public void setValues() {

        testCaseName = "Selenium & Rest Integration";
        testDescription = "Launch browser using selenium and compare current url with rest response";
        nodes = "Incident Management";
        authors = "Baskar";
        category = "UI & API";
        dataSheetName = "TC002";

    }

    @Test(dataProvider = "fetchData")
    public void createIncident(String filter, String user, String short_desc) {

        // Selenium - Create Incident
       String url2= new LoginPage(driver, test)
//                .loginApp()
                .getCurrentURL();


        // Verify Using REST Assured
        Response response = RESTAssuredBase.get(baseURI+"articles");
        RESTAssuredBase.verifyResponseCode(response, 200);
        RESTAssuredBase.verifyContentContainsKey(response, ("image[2].url"), (url2));
    }


}





