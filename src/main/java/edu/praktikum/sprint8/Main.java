package edu.praktikum.sprint8;

import com.github.javafaker.Faker;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        fakerExamples();
        lombokExamples();
    }

    public static void fakerExamples() {
        Faker faker = new Faker(Locale.forLanguageTag("ru"));

        System.out.println(faker.name().fullName());
        System.out.println(faker.name().bloodGroup());
        System.out.println(faker.name().suffix());
        System.out.println();

        System.out.println(faker.number().digit());
        System.out.println(faker.number().numberBetween(2, 10));
        System.out.println(faker.number().randomDigitNotZero());
        System.out.println();

        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.phoneNumber().cellPhone());
        System.out.println();

        System.out.println(faker.address().fullAddress());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.internet().safeEmailAddress());
        System.out.println();

        System.out.println(faker.letterify("???? ????"));
        System.out.println(faker.numerify("#### ####"));
        System.out.println(faker.bothify("+7 (###) ###-##-##, tg: ?????????"));
        System.out.println();

        System.out.println(faker.lebowski().quote());
        System.out.println(faker.chuckNorris().fact());
    }

    public static void lombokExamples() {
        Faker faker = new Faker();

        Courier courier = Courier.builder()
                .login(faker.name().username())
                .password(faker.internet().password(3, 10))
                .firstName(faker.name().name())
                .build();

        System.out.println(courier.getLogin());
        System.out.println(courier.getPassword());
        System.out.println(courier.getFirstName());
    }
}
