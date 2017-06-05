/*
 * nemesis Platform - NExt-generation Multichannel E-commerce SYStem
 *
 * Copyright (c) 2010 - 2017 nemesis
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of nemesis
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with nemesis.
 */
package com.nemesis.rules.targeting;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.fail;

/**
 * A test-case for {@code SenderUtil}.
 *
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
