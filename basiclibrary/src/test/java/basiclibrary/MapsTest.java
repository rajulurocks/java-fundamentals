package basiclibrary;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MapsTest {
    @Test
    public void testMapMethod() {
        Maps Mapsdata = new Maps();
        assertTrue("someLibraryMethod should return 'true'", Mapsdata.MapsTemp());
       // assertEquals(51,Mapsdata.MapsTemp());
    }
}
