package restAssuredTests;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.testng.annotations.Test;


public class Demo1_GET_Request {

    @Test
    public void getWeatherDetails() {

        given()
        .when()
            .get("api url with endpoint")
        .then()
            .statusCode(200)
            .statusLine("HTTP/1.1 200 OK")
            .assertThat().body("City", equalTo("New York"))
            .header("Content-Type", "application/json");

    }
}
