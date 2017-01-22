package gojava.module5.homework;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AbstractAPITest {

    @Test
    public void idIsGenerated() {
        assertTrue(AbstractAPI.getPositiveLongRandomId() > 0);
    }

}