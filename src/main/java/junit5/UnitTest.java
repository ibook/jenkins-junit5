package junit5;

import static io.restassured.RestAssured.given;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class UnitTest extends Config {
	public static final Config conf = Config.getInstance();

	RequestSpecification rspec;
	RequestSpecBuilder build;

	public UnitTest() {

		// RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();

		build = new RequestSpecBuilder();
		build.setBaseUri(conf.getProperty("baseURI"));
		build.setBasePath(conf.getProperty("basePath"));
		build.setContentType(ContentType.JSON);
		// build.addParam("query", "restaurants in mumbai");
		// build.addParam("key", "XYZ");

		rspec = build.build();

	}

	public RequestSpecification rest() {
		return given().spec(rspec).log().all()./* header("User-Agent", "IE"). */header("Authorization", "token " + conf.getProperty("token")).when();
	}

	public static void main(String[] args) {

		System.out.println(UnitTest.conf.getProperty("baseURI"));

		UnitTest unittest = new UnitTest();
//		unittest.rest().get("account/current_user").then().assertThat().statusCode(200);
		unittest.rest().get("account/current_user").print();
//		unittest.rest().get("index.html").print();

		// curl -X GET "http://coding.t.codingprod.net/api/account/current_user" -H "Authorization: token 4be04fc78256834b493b48c7472d54508a912c12"
	}

}
