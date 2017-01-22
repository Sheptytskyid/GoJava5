package gojava.module5.homework;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AbstractApiTest {

    @Test
    public void idIsGenerated() {
        assertTrue(AbstractApi.getPositiveLongRandomId() > 0);
    }

}