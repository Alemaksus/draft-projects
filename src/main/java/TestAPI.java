import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI {

  public void estEndpoint() {
    given().
        header("key", "value").
        param("paramName", "paramValue").
        when().
        get("https://api.endpoint.com/resource").
        then().
        statusCode(200).
        body("json.path", equalTo("expectedValue"));
  }

}
