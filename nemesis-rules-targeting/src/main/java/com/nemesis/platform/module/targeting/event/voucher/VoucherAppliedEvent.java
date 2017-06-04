package com.nemesis.platform.module.targeting.event.voucher;

import com.nemesis.platform.module.targeting.event.AbstractEvent;

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
