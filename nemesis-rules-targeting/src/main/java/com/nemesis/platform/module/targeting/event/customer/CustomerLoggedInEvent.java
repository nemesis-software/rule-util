package com.nemesis.platform.module.targeting.event.customer;

import com.nemesis.platform.module.targeting.event.AbstractEvent;

/**
 * An event that is raised once a user logs in.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class CustomerLoggedInEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "Usergroups")
    private String[] usergroups;

    public CustomerLoggedInEvent() {
    }

    public CustomerLoggedInEvent(String sessionId, String username, String[] usergroups) {
        super(sessionId, username);
        this.usergroups = usergroups;
    }

    public String[] getUsergroups() {
        return usergroups;
    }

    public void setUsergroups(String[] usergroups) {
        this.usergroups = usergroups;
    }
}
