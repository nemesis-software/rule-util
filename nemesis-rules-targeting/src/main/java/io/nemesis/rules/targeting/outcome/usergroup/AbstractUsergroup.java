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
package io.nemesis.rules.targeting.outcome.usergroup;

import io.nemesis.rules.targeting.outcome.AbstractOutcome;

/**
 * Abstract class for all outcomes related to usergroups.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public abstract class AbstractUsergroup extends AbstractOutcome {

    @org.kie.api.definition.type.Label(value = "Usergroup")
    private String usergroup;

    public AbstractUsergroup() {
    }

    public AbstractUsergroup(String sessionId, String username, String usergroup) {
        super(sessionId, username);
        this.usergroup = usergroup;
    }

    public String getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(String usergroup) {
        this.usergroup = usergroup;
    }
}
