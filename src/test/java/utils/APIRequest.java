package utils;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * Created by {Bennette Molepo} on {2026/05/20}.
 * Email address {bennettemolepo@gmail.com}
 */
public class APIRequest {

    private static RequestSpecification getRequestSpec(){
        return RestAssured.given()
                .contentType("application/json")
                .urlEncodingEnabled(false);
    }

    public static Response getWithoutAuth(String url){
        Response response = getRequestSpec().when().log().all().get(url);
        response.getBody().prettyPrint();
        return response;
    }

}
