package com.ex.api;

import java.sql.Timestamp;

import com.ex.api.models.projects.post.CreateProjectModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestSuiteApi {
    @Test
    public void createProjectWithModel() {
        RestAssured.baseURI = "https://pukalo.testrail.io/";
        Response response = given()
            .auth().preemptive().basic("qwertyasd@mailforspam.com", "Gol19121211_nvbg")
            .contentType(ContentType.JSON)
            .queryParam("/api/v2/add_project")
            .body(new CreateProjectModel().createProjectWithoutSuiteMode(new Timestamp(System.currentTimeMillis())))
            .when()
            .post("index.php")
            .then()
            .extract().response();
        System.out.println("Project created " + response.asString());

    }
}
