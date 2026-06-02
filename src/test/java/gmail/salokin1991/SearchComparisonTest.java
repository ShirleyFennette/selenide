package gmail.salokin1991;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchComparisonTest {

    @Test
    void searchDifferenceTest() {
        open("http://khpi-iip.mipk.kharkiv.edu/library/extent/prog/iipXML/xmlintro.html");
        SelenideElement twoInOne = $("h2 a");
        SelenideElement oneByOne = $("h2").$("a");

        System.out.println(" ");
        System.out.println("First option - different values:");
        System.out.println("Merged requests = " + twoInOne);
        System.out.println("Coherent requests = " + oneByOne);
        System.out.println(" ");
        System.out.println("Second option - same values:");
        twoInOne = $("h2 i");
        oneByOne = $("h2").$("i");
        System.out.println("Merged requests = " + twoInOne);
        System.out.println("Coherent requests = " + oneByOne);
        System.out.println(" ");
    }
}
