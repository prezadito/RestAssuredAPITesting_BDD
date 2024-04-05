package restAssuredTests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.hasItems;

public class Demo5_BasicValidation_JSON {

    @Test
    public void testMultipleContents() {

        given().when().get("baseURL"+"endpoint").then().body("json-path", hasItems("", "", ""));
    }

}
