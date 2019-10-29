package page.object;

import static com.codeborne.selenide.Selenide.$;

public class GrantApplicationPage {
    public GrantApplicationPage fillName(String name){
        $("#name").val(name);
        return this;
    }

    public GrantApplicationPage fillSurname(String surname){
        $("#surname").val(surname);
        return this;
    }

    public GrantApplicationPage setUniversity(int i){
        $("#university")
                .scrollIntoView(true);
        $("#university")
                .selectOption(i);
        return this;
    }

    public void apply(){
        //not really going to apply for a grant ;)
    }
}
