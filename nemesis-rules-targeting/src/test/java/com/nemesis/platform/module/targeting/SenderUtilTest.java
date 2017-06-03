package com.nemesis.platform.module.targeting;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SenderUtilTest {

    @Test
    @Ignore
    public void testSendToQueue() {
        try {
            SenderUtil.sendToQueue("!!!!!", "targeting");
        } catch (Exception ex) {
            ex.printStackTrace();
            fail("We got an exception: " + ex.getMessage());
        }
    }
}
