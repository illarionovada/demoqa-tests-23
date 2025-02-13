import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class TexBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize="1920x1080";
        Configuration.baseUrl="https://demoqa.com";

    }

    @Test
    void fillFormTest() {
        open("/text-box");
        $("#userName").setValue("dasha");
        $("#userEmail").setValue("illarionova@mail.ru");
        $("#currentAddress").setValue("home 1");
        $("#permanentAddress").setValue("home 2");
        $("#submit").click();

        $("#output #name").shouldHave(text("dasha"));
        $("#output #email").shouldHave(text("illarionova@mail.ru"));
        $("#output #currentAddress").shouldHave(text("home 1"));
        $("#output #permanentAddress").shouldHave(text("home 2"));

    }
}
