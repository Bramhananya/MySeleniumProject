package StepDefinations;

import org.apache.hc.core5.http.ContentType;

import junit.framework.Assert;

public class Rests {
	
	public static void main(String[] args) {
		RestAssured.baseURI = "https://restful-booker.herokuapp.com";

		int output = RestAssured.given().contentType(ContentType.JSON).when()
				.get("/booking/2").then().extract().jsonPath()
				.get("totalprice");

		int responseCode = RestAssured.given().contentType(ContentType.JSON)
				.when().get("/booking/2").then().extract().response()
				.getStatusCode();

		Assert.assertEquals("The status code is not 200", 200, responseCode);
		Assert.assertEquals("totalprice is not as expected:866", 866, output);
		System.out.println("The status code is: " + responseCode);
		System.out.println("totalprice is:" + output);

	}
}

}
