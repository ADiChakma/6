package reminder;

/**
 *
 * @author Adison
 */
public class Reminder {

    public static int findReminder(int A, int B, int expectedReminder) {
        int reminder = A % B;
        if (reminder == expectedReminder) {
            return reminder;
        } 
        else {
            return -1;
        }
    }
}