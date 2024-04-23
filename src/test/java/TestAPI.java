import io.restassured.RestAssured;
import io.restassured.response.Response;
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
    public void GetFirst(){
        // Выполнение GET-запроса к API
        Response response = RestAssured.given()
                .when()
                .get("/posts/1");

        // Проверка статус-кода ответа
        int statusCode = response.getStatusCode();
        System.out.println("Status code: " + statusCode);
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

}
