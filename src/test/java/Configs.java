import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeClass;

public class Configs {
    @BeforeClass
    public void configs() {
        Configuration.timeout = 20000;
        Configuration.browser = "chrome";
        Configuration.browserSize = "1920x1080";
    }
}
