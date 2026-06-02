package gmail.salokin1991;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GithubJunit5Test {

    @Test
    void firstTest(){
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $("#wiki-pages-filter").setValue("SoftAssertions");
        $("#wiki-pages-box").$(byText("SoftAssertions")).click();
        $("#js-repo-pjax-container").shouldHave(text("Using JUnit5 extend test class:"));
//        $("#js-repo-pjax-container").shouldHave(text("@ExtendWith({SoftAssertsExtension.class})"));
    }
}