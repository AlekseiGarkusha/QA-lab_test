package data;

import com.github.javafaker.Faker;

import java.util.Locale;

public class TestData {

  Faker faker = new Faker();
  public Faker fakerRu = new Faker(new Locale("ru"));

  public String testName= faker.name().name();
  public String testEmail= "garkusha.ag@mail.ru";
  public String testTel= "78885554443";
  public String testComment= "";
}
