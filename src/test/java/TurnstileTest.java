import org.junit.Before;
import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.junit.Assert.*;

public class TurnstileTest {
    private Turnstile turnstile;
    private SkipassSystem skiSys;
    private Skipass skipass;

    @Before
    public void initializationOfObject() {
        skiSys = new SkipassSystem();
        turnstile = new Turnstile(skiSys);
        skipass = skiSys.newPass(Days.TWO_DAY, Lifts.FIFTY, CardType.WEEKEND);
    }

    @Test
    public void testPermitPass() throws Exception {
        assertEquals(true, turnstile.permitPass(skipass, new GregorianCalendar(2018, Calendar.JANUARY, 13)));
    }

}