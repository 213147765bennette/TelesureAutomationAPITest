package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.APIRequest;

import java.util.Map;

/**
 * Created by {Bennette Molepo} on {2026/05/20}.
 * Email address {bennettemolepo@gmail.com}
 */
public class UniversityStepDef {
    Response response;

    @Given("I make a get request to {string}")
    public void i_make_a_get_request_to(String url) {
        response = APIRequest.getWithoutAuth(url);
    }

    @And("status code {int} is returned")
    public void status_code_is_returned(int statusCode) {
        Assert.assertEquals(response.statusCode(), statusCode);
    }

    @Then("Print out the university state province")
    public void print_out_the_university_state_province() {
        response.jsonPath()
                .getList("", Map.class)
                .stream()
                .filter(uni -> uni.get("name").equals("Tshwane University of Technology"))
                .findFirst()
                .ifPresent(uni -> System.out.println(uni.get("state-province")));
    }
}
