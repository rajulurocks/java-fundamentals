package inheritance;
import org.junit.Test;
import static org.junit.Assert.*;



public class RestaurantTest {

@Test public void testRestaurant ()
{
    Restaurant anjappar = new Restaurant("Anjappar", 4, 15);
    Review reviewAnjappar = new Review("Chicken Briyani is so good","Raj",4);
    assertNotNull("app should have a greeting", anjappar.toString());
    System.out.println(anjappar.toString());
    System.out.println(anjappar.addReview(reviewAnjappar));


}
}





