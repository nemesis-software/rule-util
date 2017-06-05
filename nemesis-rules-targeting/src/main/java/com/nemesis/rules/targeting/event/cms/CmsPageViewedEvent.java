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
package com.nemesis.rules.targeting.event.cms;

import com.nemesis.rules.targeting.event.AbstractEvent;
import org.kie.api.definition.type.Role;

/**
 * An that is raised once a user views a certain cms page.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
@Role(value = Role.Type.EVENT)
public class CmsPageViewedEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "Url")
    private String url;

    public CmsPageViewedEvent() {
    }

    public CmsPageViewedEvent(String sessionId, String username, String url) {
        super(sessionId, username);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
