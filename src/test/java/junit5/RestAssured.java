package junit5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class RestAssured {

	public RestAssured() {
		// TODO Auto-generated constructor stub
	}

	@Test
	@DisplayName("Connect to http://www.netkiller.cn")
	public void netkiller() {
		given().when().get("http://www.netkiller.cn").then().statusCode(200);
	}

}
