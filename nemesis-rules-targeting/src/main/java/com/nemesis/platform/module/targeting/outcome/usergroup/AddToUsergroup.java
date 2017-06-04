package com.nemesis.platform.module.targeting.outcome.usergroup;

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
