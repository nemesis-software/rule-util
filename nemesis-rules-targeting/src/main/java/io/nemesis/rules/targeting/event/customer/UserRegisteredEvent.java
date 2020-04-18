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
package io.nemesis.rules.targeting.event.customer;

import io.nemesis.rules.targeting.event.AbstractEvent;

/**
 * An event that is raised once a user registers.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class UserRegisteredEvent extends AbstractEvent {

    public UserRegisteredEvent() {
    }

    public UserRegisteredEvent(String sessionId, String username) {
        super(sessionId, username);
    }
}
