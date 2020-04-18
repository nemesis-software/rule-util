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
package io.nemesis.rules.targeting.event.search;

import io.nemesis.rules.targeting.event.AbstractEvent;
import org.kie.api.definition.type.Expires;

/**
 * An event that gets raised once a user performs a search.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
@Expires("90s")
public class SearchPerformedEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "Search Term")
    private String searchTerm;

    public SearchPerformedEvent() {
    }

    public SearchPerformedEvent(String sessionId, String username, String searchTerm) {
        super(sessionId, username);
        this.searchTerm = searchTerm;
    }

    public String getSearchTerm() {
        return searchTerm;
    }

    public void setSearchTerm(String searchTerm) {
        this.searchTerm = searchTerm;
    }
}
