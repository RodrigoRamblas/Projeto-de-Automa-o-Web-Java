package br.projeto.automacao.Api;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.junit.Test;

public class Main {
    private static final String BASE_URL = "https://reqres.in/api";
    private static final int CREATED_USER_ID = 4;

    @Test
    public void testCreateUser() {
        given()
                .contentType("application/json")
                .body("{ \"name\": \"morpheus\", \"job\": \"leader\" }")
                .when()
                .post(BASE_URL + "/users")
                .then()
                .statusCode(201)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"));
    }

    @Test
    public void testGetSingleUser() {
        given()
                .when()
                .get(BASE_URL + "/users/" + CREATED_USER_ID)
                .then()
                .statusCode(200)
                .body("data.id", equalTo(CREATED_USER_ID))
                .body("data.email", equalTo("eve.holt@reqres.in"));
    }
    @Test
    public void testGetListUsers() {
        given()
                .when()
                .get(BASE_URL + "/users?page=2")
                .then()
                .statusCode(200)
                .body("page", equalTo(2))
                .body("data", notNullValue())
                .body("data.size()", equalTo(6))
                .body("data[0].id", equalTo(7))
                .body("data[0].email", equalTo("michael.lawson@reqres.in"))
                .body("data[0].first_name", equalTo("Michael"))
                .body("data[0].last_name", equalTo("Lawson"))
                .body("data[0].avatar", equalTo("https://reqres.in/img/faces/7-image.jpg"));
    }
    @Test
    public void testPatchUser() {
        String updatedName = "John Doe";
        String updatedJob = "Software Engineer";

        given()
                .header("Content-Type", "application/json")
                .body("{ \"name\": \"" + updatedName +
                        "\", \"job\": \"" + updatedJob + "\" }")
                .when()
                .patch(BASE_URL + "/users/2")
                .then()
                .statusCode(200)
                .body("name", equalTo(updatedName))
                .body("job", equalTo(updatedJob));
    }


}
