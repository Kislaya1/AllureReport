package com.allure.report;

import io.qameta.allure.*;
import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.http.ContentType;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@Epic("REST API Regression Testing using JUnit4")
@Feature("Verify CRUID Operations on Employee module")
public class RestAssuredTest {
  String BaseURL = "http://dummy.restapiexample.com/api";

  @Test
  @Story("GET Request")
  @Severity(SeverityLevel.NORMAL)
  @Description("Test Description : Verify the details of employee of id-2")
  public void verifyUser() {

    given()
        .filter(new AllureRestAssured())
        .when()
        .get(BaseURL + "/v1/employee/2")
        .then()
        .statusCode(200)
        .statusLine("HTTP/1.1 200 OK")
        .body("data.employee_name", equalTo("Garrett Winters"))
        .body("message", equalTo("Successfully! Record has been fetched."));
  }

  @Test
  @Story("POST Request")
  @Severity(SeverityLevel.NORMAL)
  @Description("Test Description : Verify the creation of a new employee")
  public void createUser() {
    JSONObject data = new JSONObject();

    data.put("employee_name", "APITest");
    data.put("employee_salary", "99999");
    data.put("employee_age", "30");

    given()
        .filter(new AllureRestAssured())
        .contentType(ContentType.JSON)
        .body(data.toString())
        .when()
        .post(BaseURL + "/v1/create")
        .then()
        .statusCode(200)
        .body("data.employee_name", equalTo("APITest"))
        .body("message", equalTo("Successfully! Record has been added."));
  }
}
