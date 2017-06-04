package com.nemesis.platform.module.targeting.outcome.usergroup;

/**
 * When insert this fact we tell the server we want to change the user's usergroup.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class AddToUsergroup extends AbstractUsergroup {

    public AddToUsergroup() {
    }

    public AddToUsergroup(String sessionId, String username, String usergroup) {
        super(sessionId, username, usergroup);
    }
}
