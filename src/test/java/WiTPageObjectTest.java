import org.junit.Test;
import page.object.ProgramPage;

public class WiTPageObjectTest {
    @Test
    public void hasScheduleForDay2(){
        ProgramPage programPage = new ProgramPage();
        programPage.day2();
        programPage.hasKeynoteSpeeches();
        programPage.hasXCoffeeBreaks(3);
    }
}
