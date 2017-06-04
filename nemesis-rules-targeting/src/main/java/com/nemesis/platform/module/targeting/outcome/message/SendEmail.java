package com.nemesis.platform.module.targeting.outcome.message;

import com.nemesis.platform.module.targeting.outcome.AbstractOutcome;

/**
 * An outcome that sends an email.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SendEmail extends AbstractOutcome {

    public SendEmail() {
    }

    public SendEmail(String sessionId, String username) {
        super(sessionId, username);
    }
}
