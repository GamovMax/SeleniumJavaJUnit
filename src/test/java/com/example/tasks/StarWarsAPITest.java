package com.example.tasks;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class StarWarsAPITest {

    @Before
    public void setUp() {
        // Установка базового URL для API
        RestAssured.baseURI = "https://swapi.dev/api";
    }

    @Test
    public void GetFirst(){
        Response response = RestAssured.given()
                .get("/people/1");
        // Печать статус кода ответа
        System.out.println("\nStatus code: " + response.getStatusCode());
        // Печать тела ответа
        System.out.println("Response body: " + response.getBody().asString()+"\n");
    }

    @Test
    public void GetSecond(){
        // Выполнение GET запроса к API и проверка статус кода при помощи .then
        given()
                .get("/people/1")
                .then()
                .statusCode(200)
                .body("name", equalTo("Luke Skywalker"));
    }

    @Test
    public void testStarWarsAPIOPTIONS() {
        // Выполнение OPTIONS запроса к API и проверка статус кода
        given()
                .options("/people")
                .then()
                .statusCode(200); // Ожидаемый статус код 200 - OK
    }

    @Test
    public void testStarWarsAPIOPTIONSSecond() {
        // Выполнение OPTIONS запроса к API
        String response = given()
                .options("/people")
                .then()
                .extract().asString();
        // Вывод результата в командную строку
        System.out.println("\nРезультат OPTIONS запроса к /people:");
        System.out.println(response + "\n");
    }

    @Test
    public void testStarWarsAPIHEAD() {
        // Выполнение HEAD запроса к API
        given()
                .head("/films")
                .then()
                .statusCode(200); // Проверка статус кода ответа
        System.out.println("\nHEAD запрос к /films выполнен успешно.\n");
    }

    @Test
    public void testStarWarsAPIHEADSecond() {
        // Выполнение HEAD запроса к API
        int statusCode = given()
                .head("/films")
                .getStatusCode(); // Получение статус кода ответа
        // Вывод результата в командную строку
        System.out.println("\nРезультат HEAD запроса к /films:");
        System.out.println("Статус код: " + statusCode + "\n");
    }
}

