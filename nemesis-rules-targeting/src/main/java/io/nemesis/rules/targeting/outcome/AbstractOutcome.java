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
package io.nemesis.rules.targeting.outcome;

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

    private boolean processed;

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

    public boolean isProcessed() {
        return processed;
    }

    public void setProcessed(boolean processed) {
        this.processed = processed;
    }
}
