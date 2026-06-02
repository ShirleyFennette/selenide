package gmail.salokin1991;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class DragAndDropTest {

    @Test
    void actionsTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        actions().dragAndDrop($("#column-a"),$("#column-b")).perform();
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));

        //Тест падает. Значение не перемещается.
    }

    @Test
    void selenideTest(){
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}