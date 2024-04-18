package com.example.tasks;
import io.restassured.RestAssured;
import org.junit.Test;
import static io.restassured.RestAssured.given;


public class TestAPI {
    @Test
    public void API(){
        // Устанавливаем базовый URL для API
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Отправляем GET-запрос на /posts/1 и ожидаем HTTP-код 200
        given().get("/posts/1").then().statusCode(200);



        // Установка базового URL для API
//        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";

        // Выполнение GET-запроса к API
//        Response response = RestAssured.given()
//                .when()
//                .get("/posts/1");

        // Проверка статус-кода ответа
//        int statusCode = response.getStatusCode();
//        System.out.println("Status code: " + statusCode);

    }
}
