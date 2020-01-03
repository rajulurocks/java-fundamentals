package inheritance;
import org.junit.Test;
import static org.junit.Assert.*;

public class ReviewTest {


    @Test public void testReview ()
    {
        Review anjappar = new Review("Chicken Briyani is so good","Raj",4);
        assertNotNull("app should have a greeting", anjappar.toString());
        System.out.println(anjappar.toString());
    }
}
