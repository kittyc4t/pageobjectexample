import org.junit.Test;
import page.object.ProgramPage;

import static com.codeborne.selenide.Selenide.screenshot;

public class ApplyForGrantTest {
    @Test
    public void applyForStudentsGrant(){
        new ProgramPage()
                .grants()
                .applyForStudentGrant()
                .fillName("Ala")
                .fillSurname("Ma kota")
                .setUniversity(3)
                .apply();

        screenshot("filled_form");
    }
}
