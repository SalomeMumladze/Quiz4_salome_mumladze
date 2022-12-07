package steps;

import pages.CheckboxTestPage;

import static com.codeborne.selenide.Condition.exactText;

public class CheckboxTestSteps {
    CheckboxTestPage checkboxTestPage = new CheckboxTestPage();
    public CheckboxTestSteps validateText(String text) {
        checkboxTestPage.successText.shouldHave(exactText(text));
        return this;
    }
    public CheckboxTestSteps clickOnCheckbox() {
        checkboxTestPage.isSelectedCheckbox.click();
        return this;
    }
}
