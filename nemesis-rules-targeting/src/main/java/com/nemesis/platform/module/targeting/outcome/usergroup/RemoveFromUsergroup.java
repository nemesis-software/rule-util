package com.nemesis.platform.module.targeting.outcome.usergroup;

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
