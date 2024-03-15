import static org.junit.Assert.*;

import org.junit.*;

public class CheckItTest {

    // Predicate Coverage
    @Test // a = true, b = false, c = true
    public void makePTrue() { // P is true
        assertEquals("P is not true when it is supposed to", true, CheckIt.checkIt(true, false, true));
    }

    @Test // a = false, b = false, c = true
    public void makePFalse() { // P is false
        assertEquals("P is not false when it is supposed to", false, CheckIt.checkIt(false, false, true));

    }

    // Clause Coverage
    @Test // a = true, b = true, c = true
    public void clauseTrue() { // P is false
        assertEquals("P is not true when it is supposed to", true, CheckIt.checkIt(true, true, true));

    }

    @Test // a = false, b = false, c =false
    public void clauseFalse() { // P is false
        assertEquals("P is not false when it is supposed to", false, CheckIt.checkIt(false, false, false));

    }

    // CACC AND RACC

    @Test // a = true, b = true, c = false
    public void CACCttf() { // P is true
        assertEquals("P is not true when it is supposed to", true, CheckIt.checkIt(true,true,false));

    }

    @Test // a = false, b = true, c = true
    public void CACCftt() { // P is true
        assertEquals("P is not true when it is supposed to", true, CheckIt.checkIt(false,true,true));

    }

    @Test // a = true, b = true, c = false
    public void RACCttf() { // P is true
        assertEquals("P is not true when it is supposed to", true, CheckIt.checkIt(true,true,false));

    }

    @Test // a = false, b = true, c = false
    public void RACCftf() { // P is false
        assertEquals("P is not false when it is supposed to", false, CheckIt.checkIt(false,true,false));

    }
}
