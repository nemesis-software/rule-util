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

/**
 * Outcome that is triggered when we want to remove the user from a given usergroup.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class RemoveFromUsergroup extends AbstractUsergroup {

    public RemoveFromUsergroup() {
    }

    public RemoveFromUsergroup(String sessionId, String username, String usergroup) {
        super(sessionId, username, usergroup);
    }
}
