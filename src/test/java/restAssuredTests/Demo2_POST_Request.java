package restAssuredTests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class Demo2_POST_Request {

    public static HashMap map = new HashMap();

    @BeforeClass
    public void postData() {

        map.put("", "");

        RestAssured.baseURI = "api base url";
        RestAssured.basePath = "/query or path parameter";
    }

    @Test
    public void testPost() {

        given()
            .contentType("application/json")
            .body(map)
        .when()
            .post()
        .then()
            .statusCode(201)
            .and()
            .body("", equalTo(""))
            .and()
            .body("", equalTo(""));

    }
}
