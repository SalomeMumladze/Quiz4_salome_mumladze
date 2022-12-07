package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RadioPage {
    public SelenideElement optionImpressive= $(By.xpath("//input[@value='Impressive']"));
}
