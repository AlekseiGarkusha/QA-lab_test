package tests;

import data.TestData;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import setup.TestBase;

import static io.qameta.allure.Allure.step;

public class BecomeAClient_test extends TestBase {
  Page_ClientForm pageClientForm = new Page_ClientForm();
  TestData testData = new TestData();

  @Test
  @Feature("Проверка открытия модального окна - запись на консультацию")
  @Epic("test")
  @Story("Заполнение всех полей")
  @Owner("AlexeyGarkusha")
  @Severity(SeverityLevel.BLOCKER)

  @DisplayName("Заполнение всех полей формы студента, и проверка на соответствие")
  public void signUpForAConsultation() {
    step("Открытие формы консультации", () -> {
      pageClientForm.clickOnBtnBecomeAClient();
    });

    step("Заполнение полей формы", () -> {
      pageClientForm.enterName(testData.testName)
        .enterEmail(testData.testEmail)
        .enterTel(testData.testTel)
        .enterMessage("");
    });


  }
}
