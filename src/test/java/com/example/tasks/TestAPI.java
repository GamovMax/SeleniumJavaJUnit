package com.example.tasks;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.simple.JSONObject;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class TestAPI {
    @Before
    public void setUp() {
        // Установка базового URL для API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

    @Test
    public void testGetFirst(){
        // Выполнение GET-запроса к API
        Response response = RestAssured.given()
                .when()
                .get("/posts/1");

        // Проверка статус-кода ответа
        int statusCode = response.getStatusCode();
        System.out.println("\ntestGetFirst\nStatus code: " + statusCode + "\n");
    }

    @Test
    public void GetSecond(){
        // Отправляем GET-запрос на /posts/1 и ожидаем HTTP-код 200
        given().get("/posts/1").then().statusCode(200);
    }

    @Test
    public void GetThird(){
        // Отправляем GET-запрос на /posts/1 и проверяем, что userId равен 1
        given().get("/posts/1").then().body("userId", equalTo(1));
    }

    @Test
    public void Post(){
        // Отправляем POST-запрос на /posts и проверяем, что возвращается HTTP-код 201 (Created)
        given().contentType("application/json")
                .body("{\"title\": \"foo\", \"body\": \"bar\", \"userId\": 1}")
                .post("/posts")
                .then().statusCode(201);
    }

    @Test
    public void Del(){
        // Отправка DELETE запроса
        given()
                .when()
                .delete("/posts/1")
                .then()
                .statusCode(200); // Проверка статуса ответа (200 - OK)
    }

    @Test
    public void Put(){

        JSONObject request = new JSONObject();
        request.put("title", "New Title");
        request.put("body", "New Body");
        request.put("userId", 1);

        given()
                .header("Content-Type", "application/json")
                .body(request.toJSONString())
                .when()
                .put("/posts/1")
                .then()
                .statusCode(200);

    }

    @Test
    public void GetJSON(){

        Response response = RestAssured.given()
                .when()
                .get("/posts/1"); // Пример запроса к API, где /posts/1 - это часть URL, необходимая для получения конкретной информации

        String jsonResponse = response.getBody().asString();
        System.out.println("\nGetJSON\n" + jsonResponse + "\n");

    }

    @Test
    public void Option(){
    Response response = RestAssured.given()
            .when()
            .options("/posts");

        System.out.println("\nOption\nResponse code: " + response.getStatusCode());
        System.out.println("Allowed methods: " + response.getHeader("Allow") + "\n");
    }

    @Test
    public void Head(){
    Response response = RestAssured.head("/posts");

        System.out.println("\nHead\nResponse code: " + response.getStatusCode());
        System.out.println("Content-Type: " + response.getHeader("Content-Type"));
        System.out.println("Response time: " + response.getTime() + " ms" + "\n");
    }

    @Test
    public void Patch(){
        String requestBody = "{\"title\": \"Updated title\"}";

        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch("/posts/1");

        System.out.println("\nPatch\nResponse code: " + response.getStatusCode());
        System.out.println("Response body: " + response.getBody().asString() + "\n");
    }
}
