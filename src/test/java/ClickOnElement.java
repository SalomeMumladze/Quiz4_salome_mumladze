import com.codeborne.selenide.SelenideElement;

public class ClickOnElements {
    public SelenideElement element;

    public void setElement(SelenideElement elem){
        this.element = elem;
    }
    public void clickOnElem(){
        element.click();
    }
}
