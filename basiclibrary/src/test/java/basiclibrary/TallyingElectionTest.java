package basiclibrary;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TallyingElectionTest {
    @Test
    public void testTallyElection () {
        TallyingElection elect = new TallyingElection();
        assertTrue("testing",elect.testing());

    }
}


