package gmail.salokin1991;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Step;  // импортируем аннотацию

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchComparisonTest extends BaseTest {

    @Test
    void searchDifferenceTest() {
        open("http://khpi-iip.mipk.kharkiv.edu/library/extent/prog/iipXML/xmlintro.html");
        performSearchComparison();
    }

    @Step("What are we doing here?")
    void performSearchComparison() {
        SelenideElement twoInOne = $("h2 a");
        SelenideElement oneByOne = $("h2").$("a");

        System.out.println(" ");
        System.out.println("First option - different values:");
        System.out.println("Merged requests = " + twoInOne);
        System.out.println("Coherent requests = " + oneByOne);
        System.out.println(" ");

        // Меняем селекторы
        twoInOne = $("h2 i");
        oneByOne = $("h2").$("i");
        System.out.println("Second option - same values:");
        System.out.println("Merged requests = " + twoInOne);
        System.out.println("Coherent requests = " + oneByOne);
        System.out.println(" ");
    }
}
