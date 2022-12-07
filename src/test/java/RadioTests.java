import org.testng.annotations.Test;
import steps.RadioSteps;

import static com.codeborne.selenide.Selenide.open;

public class RadioTests extends Configs {
    RadioSteps radioSteps = new RadioSteps();
    @Test
    public void chooseImpressive() {
        open("https://demoqa.com/radio-button");
        radioSteps.chooseImpressive();
    }
}
