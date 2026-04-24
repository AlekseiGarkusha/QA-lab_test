package tests;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class Page_ClientForm {

  @Step("Открытие формы записи на консультацию")
  public Page_ClientForm clickOnBtnBecomeAClient() {
    $(".ql-button .text-uppercase .text-left").shouldBe(visible).click();

    return this;
  }

  @Step("Поле - имя")
  public Page_ClientForm enterName(String value) {
    $("input[name=\"your-name\"]")
      .shouldBe(visible)
      .setValue(value);

    return this;
  }

  @Step("Поле - Email")
  public Page_ClientForm enterEmail(String value) {
    $("input[name=\"your-email\"]")
      .shouldBe(visible)
      .setValue(value);

    return this;
  }

  @Step("Поле - Телефон")
  public Page_ClientForm enterTel(String value) {
    $("input[name=\"your-tel\"]")
      .shouldBe(visible)
      .setValue(value);

    return this;
  }

  @Step("Поле - Комментарий")
  public Page_ClientForm enterMessage(String value) {
    $("input[name=\"your-message\"]")
      .shouldBe(visible)
      .setValue(value);

    return this;
  }

}
