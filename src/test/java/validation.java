import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;

public class Validation {
    private SelenideElement element;

    public void setElement(SelenideElement e){
        this.element = e;
    }
    public void validate(String text){
        element.shouldHave(text(text));
    }
}
