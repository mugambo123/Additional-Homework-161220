package in.reqres.UserInfo;

import in.reqres.model.LoginPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostLoginSuccessfullTest extends TestBase {

    @Test
    public void createLoginSuccessful(){
        LoginPojo loginPojo = new LoginPojo();
        loginPojo.setEmail("eve.holt@reqres.in");
        loginPojo.setPassword("cityslicka");


        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(loginPojo)
                .post("/login");
                response.then().log().all().statusCode(200);
                response.prettyPrint();


    }
}
