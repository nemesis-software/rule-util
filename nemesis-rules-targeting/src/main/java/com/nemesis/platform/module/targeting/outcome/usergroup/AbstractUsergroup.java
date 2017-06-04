package com.nemesis.platform.module.targeting.outcome.usergroup;

import com.nemesis.platform.module.targeting.outcome.AbstractOutcome;

/**
 * Abstract class for all outcomes related to usergroups.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public abstract class AbstractUsergroup extends AbstractOutcome {

    @org.kie.api.definition.type.Label(value = "Usergroup")
    private String usergroup;

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
