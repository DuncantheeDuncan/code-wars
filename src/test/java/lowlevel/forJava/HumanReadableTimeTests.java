package lowlevel.forJava;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeTests {

    @Test
    public void Tests() {
        assertEquals("makeReadable(0)", "00:00:00",HumanReadableTime.makeReadable(0));
        assertEquals("makeReadable(5)", "00:00:05", HumanReadableTime.makeReadable(5));
        assertEquals("makeReadable(60)", "00:01:00", HumanReadableTime.makeReadable(60));
        assertEquals("makeReadable(86399)", "23:59:59", HumanReadableTime.makeReadable(86399));
        assertEquals("makeReadable(359999)", "99:59:59", HumanReadableTime.makeReadable(359999));
        assertEquals("makeReadable(8274)", "02:17:54", HumanReadableTime.makeReadable(8274));
        assertEquals("makeReadable(82)", "00:01:22", HumanReadableTime.makeReadable(82));
        assertEquals("makeReadable(90)", "00:01:30", HumanReadableTime.makeReadable(90));
    }
}
