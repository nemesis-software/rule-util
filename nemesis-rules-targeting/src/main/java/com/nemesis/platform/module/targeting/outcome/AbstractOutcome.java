package com.nemesis.platform.module.targeting.outcome;

import java.io.Serializable;

/**
 * A base superclass for all outcomes.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class AbstractOutcome implements Serializable {

    @org.kie.api.definition.type.Label(value = "SessionID")
    private String sessionId;

    @org.kie.api.definition.type.Label(value = "Username")
    private String username;

    public AbstractOutcome() {
    }

    public AbstractOutcome(String sessionId, String username) {
        this.sessionId = sessionId;
        this.username = username;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
