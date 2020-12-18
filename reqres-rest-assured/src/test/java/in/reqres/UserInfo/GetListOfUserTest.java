package in.reqres.UserInfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetListOfUserTest extends TestBase {

    @Test
    public void getAllUserinfo(){
        Response response = given()
                .queryParam("page", 2)
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
