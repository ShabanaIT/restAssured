package step_definitions;

import static io.restassured.RestAssured.given;

import java.util.HashMap;

import org.json.JSONObject;
//import org.testng.Assert;
import static org.junit.Assert.assertEquals;

import base.Base;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class ProductCategoryFunctionality extends Base {
	String category_name;
	int category_id;

	@Given("I generate all test random value")
	public void i_generate_all_test_random_value() {
		category_name = "test_category_name_" + generateRandomNumber(100000);
		
	}

	@When("I create a Category")
	public void i_create_a_Category() {
		HashMap<String, String> requestBody = new HashMap<String, String>();
		requestBody.put("categoryName", category_name);

		Response response = given()
				.contentType("application/json")
				.body(requestBody)
				.when()
				.post("http://skyschooling.com:8081/api/productCategory");
		//Assert.assertEquals(response.statusCode(), 201);
		assertEquals(response.statusCode(), 201);
		JSONObject resBody = new JSONObject(response.body().asString());
		category_id = resBody.getInt("id");
		
	}

	@Then("I verify category id and name")
	public void i_verify_category_id_and_name() {
		Response response = given()
				.when()
				.get("http://skyschooling.com:8081/api/productCategory/" + category_id);
		assertEquals(response.statusCode(), 200);
		
		JSONObject resBody = new JSONObject(response.body().asString());
		int id = resBody.getInt("id");
		String catName = resBody.getString("categoryName");
		assertEquals(id, category_id);
		assertEquals(catName, category_name);
	}

	@Then("I update category with {string} as category Name")
	public void i_update_category_with_as_category_Name(String catName) {
		HashMap<String, String> requestBody = new HashMap<String, String>();
		//category_name = "Test_Category_name_" + generateRandomNumber(10000000);
		category_name = catName;
		requestBody.put("categoryName", category_name);
		System.out.println(requestBody);
		
		Response res = given().contentType("application/json").body(requestBody).when()
				.put("http://skyschooling.com:8081/api/productCategory/" + category_id);

		assertEquals(res.statusCode(), 200);
		System.out.println(res);
		
		JSONObject resBody = new JSONObject(res.body().asString());
		assertEquals(resBody.get("categoryName"), category_name);
	}

	@Then("I verify Updated category name and Id")
	public void i_verify_Updated_category_name_and_id() {
		Response response = given()
				.when()
				.get("http://skyschooling.com:8081/api/productCategory/" + category_id);
		assertEquals(response.statusCode(), 200);
		
		JSONObject resBody = new JSONObject(response.body().asString());
		int id = resBody.getInt("id");
		String catName = resBody.getString("categoryName");
		assertEquals(id, category_id);
		assertEquals(catName, category_name);
	}

	@Then("I delete that category")
	public void i_delete_that_category() {
		Response response = given()
				.when()
				.delete("http://skyschooling.com:8081/api/productCategory/" + category_id);
		assertEquals(response.statusCode(), 204);
	}

	@Then("I verify category is Deleted")
	public void i_verify_category_is_Deleted() {
		Response response = given()
				.when()
				.get("http://skyschooling.com:8081/api/productCategory/" + category_id);
		assertEquals(response.statusCode(), 404);		
	}

}
