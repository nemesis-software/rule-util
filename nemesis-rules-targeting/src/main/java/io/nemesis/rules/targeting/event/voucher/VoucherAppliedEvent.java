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
package io.nemesis.rules.targeting.event.voucher;

import io.nemesis.rules.targeting.event.AbstractEvent;

/**
 * An event that gets raised once the user applies a voucher to their cart.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class VoucherAppliedEvent extends AbstractEvent {

    public VoucherAppliedEvent() {
    }

    public VoucherAppliedEvent(String sessionId, String username) {
        super(sessionId, username);
    }
}
