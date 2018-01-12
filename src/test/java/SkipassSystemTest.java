import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class SkipassSystemTest {
    private SkipassSystem skiSys;
    private Skipass skipass;
    private boolean permitted;

    @Before
    public void initializationOfObject() {
        skiSys = new SkipassSystem();
        skipass = skiSys.newPass(Days.TWO_DAY, Lifts.FIFTY, CardType.WEEKDAYS);
    }

    @Test
    public void testNewPass() throws Exception {
        assertEquals("This is your skipass, LiftsLimit = 50, DaysLimit = 2, only valid on weekdays", skipass.getInfo());
    }

    @Test
    public void testBlock() throws Exception {
        skiSys.block(skipass);
        assertEquals(true, skipass.isBlocked());
    }

    @Test
    public void testPermitPass() throws Exception {
        permitted = skiSys.permitPass(skipass, new GregorianCalendar(2018, Calendar.JANUARY, 12));
        assertEquals(true, permitted);
        permitted = skiSys.permitPass(skipass, new GregorianCalendar(2018, Calendar.JANUARY, 13));
        assertEquals(false, permitted);
        permitted = skiSys.permitPass(skipass, new GregorianCalendar(2018, Calendar.JANUARY, 15));
        assertEquals(false, permitted);
        for(int i=0; i<Lifts.FIFTY.getNumberOfLifts()-1; i++){
            permitted = skiSys.permitPass(skipass, new GregorianCalendar(2018, Calendar.JANUARY, 12));
            assertEquals(true, permitted);
        }
        permitted = skiSys.permitPass(skipass, new GregorianCalendar(2018, Calendar.JANUARY, 12));
        assertEquals(false, permitted);
    }

}