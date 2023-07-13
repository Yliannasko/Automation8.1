package ru.netology.bank.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPage {
    private SelenideElement heading = $("[data-test-id='dashboard']")
            .shouldHave(exactText("Личный кабинет"));

    public DashboardPage(){
        heading.shouldBe(visible);
    }
}
