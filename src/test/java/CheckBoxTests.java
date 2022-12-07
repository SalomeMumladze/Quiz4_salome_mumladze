import com.codeborne.selenide.*;
import data.CheckboxTestData;
import org.testng.annotations.Test;
import steps.CheckboxTestSteps;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.ClickOptions.usingDefaultMethod;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static java.time.Duration.ofSeconds;

public class CheckBoxTests extends Configs {
    CheckboxTestSteps checkboxTestSteps = new CheckboxTestSteps();
    CheckboxTestData checkboxTestData = new CheckboxTestData();


    @Test
    public void validateText() {
        open("https://demoqa.com/checkbox");
        checkboxTestSteps.clickOnCheckbox()
                .validateText(checkboxTestData.message);
    }


    @Test
    public void validateText1() {
    open("https://demoqa.com/checkbox");
    $("#isAgeSelected").click();
    SelenideElement successText = $("#txtAge");

        successText.shouldHave(exactText("Success - Check box is checked"));
    }
}