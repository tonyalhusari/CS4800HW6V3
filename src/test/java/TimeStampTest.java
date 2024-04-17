import org.example.TimeStamp;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeStampTest {
    @Test
    public void testEquals() {
        // create two time stamps
        TimeStamp expected = new TimeStamp();
        TimeStamp actual = new TimeStamp();
        // check if they are equal create at the same time up to sam minute
        assertEquals(expected, actual);
    }
}
