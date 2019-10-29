package page.object;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GrantsPage {
    public GrantsPage goDirectlyToGrantsPage() {
        open("https://womenintechsummit.pl/grants");
        return this;
    }

    public GrantApplicationPage applyForStudentGrant(){
        $("body > main > div > div > div > div > div:nth-child(3) > div > div:nth-child(2) > div > div.card-footer > p > a")
                .scrollIntoView("{behavior: \"instant\", block: \"center\", inline: \"center\"}")
                .click();
        return new GrantApplicationPage();
    }
}
