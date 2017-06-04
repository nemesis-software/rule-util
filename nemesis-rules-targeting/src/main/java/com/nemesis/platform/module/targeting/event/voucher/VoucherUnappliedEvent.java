package com.nemesis.platform.module.targeting.event.voucher;

import com.nemesis.platform.module.targeting.event.AbstractEvent;

/**
 * An event that gets raised when a user unapplies a voucher.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class VoucherUnappliedEvent extends AbstractEvent {
    public VoucherUnappliedEvent(String sessionId, String username) {
        super(sessionId, username);
    }
}
