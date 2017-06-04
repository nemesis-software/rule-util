package com.nemesis.platform.module.targeting.outcome.message;

import com.nemesis.platform.module.targeting.outcome.AbstractOutcome;

/**
 * An outcome that sends an sms.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SendSMS extends AbstractOutcome {

    public SendSMS() {
    }

    public SendSMS(String sessionId, String username) {
        super(sessionId, username);
    }
}
