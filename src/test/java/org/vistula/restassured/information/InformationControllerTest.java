package org.vistula.restassured.information;

import org.junit.Test;
import org.vistula.restassured.RestAssuredTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class InformationControllerTest extends RestAssuredTest {

    @Test
    public void shouldGetAll() {
        given().get("/information")
                .then()
                .log().all()
                .statusCode(200)
                .body("size()", is(2));
    }

}
