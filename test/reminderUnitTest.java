import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import reminder.Reminder;
/**
 *
 * @author Adison
 */
public class reminderUnitTest {
    
    public reminderUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }
    
    @Test
    public void ValidReminder() {
        int A = 10;
        int B = 3;
        int expectedReminder = 1;

        int actualReminder = Reminder.findReminder(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void ZeroReminder() {
        int A = 12;
        int B = 3;
        int expectedReminder = 0;

        int actualReminder = Reminder.findReminder(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void NegativeDividend() {
        int A = -15;
        int B = 4;
        int expectedReminder = -3;

        int actualReminder = Reminder.findReminder(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void ZeroDivisor() {
        int A = 10;
        int B = 0;
        int expectedReminder = -1;

        int actualReminder = Reminder.findReminder(A, B, expectedReminder);
        assertEquals(expectedReminder, actualReminder);
    }

    @Test
    public void InvalidReminder() {
        int A = 10;
        int B = 3;
        int expectedReminder = 5;

        int actualReminder = Reminder.findReminder(A, A, expectedReminder);
        assertEquals(-1, actualReminder);
    }
}