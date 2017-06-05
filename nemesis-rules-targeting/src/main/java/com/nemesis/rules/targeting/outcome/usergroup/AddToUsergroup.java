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
package com.nemesis.rules.targeting.outcome.usergroup;

import org.kie.api.definition.type.Expires;

/**
 * When insert this fact we tell the server we want to change the user's usergroup.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
@Expires("5m")
public class AddToUsergroup extends AbstractUsergroup {

    public AddToUsergroup() {
    }

    public AddToUsergroup(String sessionId, String username, String usergroup) {
        super(sessionId, username, usergroup);
    }
}
