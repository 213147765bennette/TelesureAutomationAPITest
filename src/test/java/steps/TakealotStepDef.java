package steps;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.testng.Assert;
import utils.APIRequest;


/**
 * Created by {Bennette Molepo} on {2026/05/20}.
 * Email address {bennettemolepo@gmail.com}
 */
public class TakealotStepDef {

    Response response;

    @Given("I make a get request for takealot on {string}")
    public void i_make_a_get_request_for_takealot_on(String url) {
        response = APIRequest.getWithoutAuth(url);
    }
    @And("status code {int} must be returned")
    public void status_code_must_be_returned(int statusCode) {
        Assert.assertEquals(response.statusCode(), statusCode);
    }
    @Then("Print out the Login title of the page")
    public void print_out_the_login_title_of_the_page() {
        String responseBody = response.getBody().asString();

        System.out.println("Login link is available: "+responseBody.contains("login"));

        Assert.assertTrue(responseBody.contains("login"), "Login link is not available on the page");
    }
}
