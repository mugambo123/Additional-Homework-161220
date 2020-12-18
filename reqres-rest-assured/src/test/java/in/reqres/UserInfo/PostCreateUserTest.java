package in.reqres.UserInfo;

import in.reqres.model.UserPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostCreateUserTest extends TestBase {

    @Test
    public void createStudent(){

        UserPojo userPojo = new UserPojo();
        userPojo.setEmail("krish5@gmail.co.in");
        userPojo.setFirst_name("Kritik");
        userPojo.setLast_name("Joshan");
        userPojo.setAvatar("https://gcaffe.files.wordpress.com/2012/07/wall_poster_krish4a.jpg");

        Response response = given().log().all()
                .header("Content-Type", "application/json")
                .when()
                .body(userPojo)
                .post("/users");
        response.then().log().all().statusCode(201);
        response.prettyPrint();


    }
}
