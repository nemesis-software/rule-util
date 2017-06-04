package com.nemesis.platform.module.targeting.event;

import java.io.Serializable;

/**
 * Abstract class for all the events that come from the platform.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public abstract class AbstractEvent implements Serializable {

    @org.kie.api.definition.type.Label("SessionID")
    private String sessionId;

    @org.kie.api.definition.type.Label(value = "Username")
    private String username;

    public AbstractEvent() {
    }

    public AbstractEvent(String sessionId, String username) {
        this.sessionId = sessionId;
        this.username = username;
    }

    /* getters/setters */

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
