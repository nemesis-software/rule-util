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
package com.nemesis.rules.targeting.event;

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
