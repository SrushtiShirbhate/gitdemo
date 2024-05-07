package Assesment_2;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class API_Test {
	private static final String BASE_URL = "https://reqres.in";
	private static final String CREATE_USER_ENDPOINT = "/api/users";
	private static final String GET_USER_ENDPOINT = "/api/users/1";
	private static final String UPDATE_USER_ENDPOINT = "/api/users/1";
	private static final String DELETE_USER_ENDPOINT = "/api/users/1";

	@Test
	public static void createUserUsingHashMap() {
		Map<String, Object> requestBody = new HashMap<>();
		requestBody.put("name", "Srushti");
		requestBody.put("job", "Software Engineer");

		RestAssured.given().contentType(ContentType.JSON).body(requestBody).post(BASE_URL + CREATE_USER_ENDPOINT).then()
				.statusCode(201).log().all();

		// Call subsequent APIs
		getUser();
		updateUser();
		deleteUser();
	}

	@Test
	public static void createUserUsingPOJO() {
		User user = new User("Srushti", "Software Engineer");

		RestAssured.given().contentType(ContentType.JSON).body(user).post(BASE_URL + CREATE_USER_ENDPOINT).then()
				.statusCode(201).log().all();

		// Call subsequent APIs
		getUser();
		updateUser();
		deleteUser();
	}

	@Test
	public static void createUserUsingExternalJsonFile() {
		File jsonFile = new File(
				"C:\\Users\\SRSHIRBH\\eclipse-workspace\\Assesment\\src\\test\\java\\Assesment_2\\JSON");

		RestAssured.given().contentType(ContentType.JSON).body(jsonFile).post(BASE_URL + CREATE_USER_ENDPOINT).then()
				.statusCode(201).log().all();

		// Call subsequent APIs
		getUser();
		updateUser();
		deleteUser();
	}

	private static void getUser() {
		RestAssured.get(BASE_URL + GET_USER_ENDPOINT)
		.then()
		.statusCode(200)
		.log().all()
		.body("data.id", equalTo(1))
		.body("data.first_name", equalTo("George"))
		.body("data.last_name", equalTo("Bluth"));
	}

	private static void updateUser() {
		User updatedUser = new User("Dinesh", "Senior Software Engineer");

		RestAssured.given().contentType(ContentType.JSON).body(updatedUser).put(BASE_URL + UPDATE_USER_ENDPOINT)
		.then()
        .statusCode(200)
        .log().all()
        .body("name", equalTo("Dinesh"))
        .body("job", equalTo("Senior Software Engineer"));
	}

	private static void deleteUser() {
		RestAssured.delete(BASE_URL + DELETE_USER_ENDPOINT)
		.then()
        .statusCode(204)
        .log().all();

	}
}