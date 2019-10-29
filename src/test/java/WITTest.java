import org.junit.Test;

import static com.codeborne.selenide.CollectionCondition.size;
import static com.codeborne.selenide.Condition.have;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class WITTest {
    @Test
    public void hasScheduleForDay2() {
        open("https://womenintechsummit.pl#program");

        $("#program-2018 > div.row > div > div")
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}");

        $("#program-full-2-tab").click();
        $("#section-full-2 > div > div > div > div:nth-child(1) > div > h2")
                .shouldHave(text("DAY 2"));

        $("#section-full-2 > div > div > div > div.program__slots.col-12.mb-5 > div:nth-child(3)")
                .shouldHave(text("Keynote Speeches"));

        $$("#section-full-2 > div > div > div > div.program__slots > div.program__slot")
                .filter(have(text("Coffee Break")))
                .shouldBe(size(3));
    }
}
