package Assesment;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Question3 {

    // Base URI
    private static final String BASE_URI = "https://bookstore.toolsqa.com/swagger/";

    // Endpoint for getting book details
    private static final String BOOK_DETAILS_ENDPOINT = "/books";

    @Test
    public void testGetBookDetails() {
        // Set base URI
        RestAssured.baseURI = BASE_URI;

        // Send GET request to get book details and verify response status code
        given()
            .when()
                .get(BOOK_DETAILS_ENDPOINT)
            .then()
                .statusCode(200);
    }
}
