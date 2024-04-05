package restAssuredTests;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Demo4_DELETE_Request {

    @Test
    public void deleteRecord() {

        Response response =  given().when().delete().then().extract().response();
        String jsonAsString = response.asString();
        Assert.assertEquals(jsonAsString.contains(""), true);


    }
}
