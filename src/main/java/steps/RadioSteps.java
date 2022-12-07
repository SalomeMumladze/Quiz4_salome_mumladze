package steps;

import pages.RadioPage;

public class RadioSteps {
    RadioPage radioPage = new RadioPage();
    public void chooseImpressive() {
        radioPage.optionImpressive.click();
    }
}
