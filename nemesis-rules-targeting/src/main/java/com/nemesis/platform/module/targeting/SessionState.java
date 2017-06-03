package com.nemesis.platform.module.targeting;

import java.io.Serializable;

/**
 * @author Petar Tahchiev
 * @since 1.5
 */
public class SessionState implements Serializable {

    @org.kie.api.definition.type.Label(value = "SessionID")
    private String sessionId;

    @org.kie.api.definition.type.Label(value = "State")
    private String state;

    public SessionState() {
    }

    public SessionState(String sessionId, String state) {
        this.sessionId = sessionId;
        this.state = state;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

