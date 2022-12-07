import com.codeborne.selenide.*;
import com.codeborne.selenide.testng.SoftAsserts;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.AssertionMode.SOFT;
import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;


@Listeners({SoftAsserts.class})
public class Test{


    @Test
    public void validateElement(){

        SoftAssert softAssert = new SoftAssert();
        open(url);
        ClickOnElements elem1 = new ClickOnElements();
        elem1.setElement($("#app > div > div > div.home-body > div > div:nth-child(1)"));
        elem1.clickOnElem();

        ClickOnElements elem2 = new ClickOnElements();
        elem2.setElement($("#item-2"));
        elem2.clickOnElem();

        ClickOnElements elem3 = new ClickOnElements();
        elem3.setElement($("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > div:nth-child(3) > label"));
        elem3.clickOnElem();

        softAssert.assertAll();
    }

    @Test
    public void testElement(){
        SoftAssert softAssert = new SoftAssert();
        open(url);
        ClickOnElements elem1 = new ClickOnElements();
        elem1.setElement($("#app > div > div > div.home-body > div > div:nth-child(1)"));
        elem1.clickOnElem();

        ClickOnElements elem2 = new ClickOnElements();
        elem2.setElement($("#item-4"));
        elem2.clickOnElem();

        ClickOnElements elem3 = new ClickOnElements();
        elem3.setElement($(byText("Click Me")));
        elem3.clickOnElem();

        Validation validElem = new Validation();
        validElem.setElement($("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > p"));
        validElem.validate("You have done a dynamic click");


        elem3.setElement($(byText("Right Click Me")));
        elem3.clickOnElem();

        validElem.setElement($("#app > div > div > div.row > div.col-12.mt-4.col-md-6 > div:nth-child(2) > p"));
        validElem.validate("You have done a right click");

        softAssert.assertAll();




    }

}
