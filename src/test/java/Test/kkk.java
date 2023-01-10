package Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import org.testng.annotations.Test;

public class kkk {
	
	@Test
		public void getValidateAllBody() {

			given()
			.when()
			.get("https://gorest.co.in/public/v2/posts")
			.then()
			.statusCode(200)
			.header("Connection", "keep-alive");
		}
		
	
	}


