package MortalWombat;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AgeCheckerTest {

    @Test
    public void testAgedUserCanPlay() {
        AgeChecker ageChecker = new AgeChecker();
        Assert.assertTrue(ageChecker.canPlayGame(19), "Aged user can't play game");
    }

    @Test
    public void testThatTooYoungUsersCanNotPlay() {
       AgeChecker ageChecker = new AgeChecker();
       Assert.assertFalse(ageChecker.canPlayGame(12), "Young user can play game");
    }
}
