package edu.praktikum.sprint8;

import com.github.javafaker.Faker;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Before;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CourierTest {

    private AppConfig appConfig;

    @Before
    public void setUp() {
        appConfig = ConfigFactory.create(AppConfig.class);
    }

    @Test
    public void test() {
        Faker faker = new Faker();

        Courier courier = Courier.builder()
                .login(faker.name().username())
                .password(faker.internet().password(3, 10))
                .firstName(faker.name().name())
                .build();

        given().baseUri(appConfig.baseUrl())
                .header("Content-type", "application/json")
                .body(courier)
                .post("/api/v1/courier")
                .prettyPrint();
    }
}
