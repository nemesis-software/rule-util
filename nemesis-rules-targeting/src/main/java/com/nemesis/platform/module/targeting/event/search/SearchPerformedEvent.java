package com.nemesis.platform.module.targeting.event.search;

import com.nemesis.platform.module.targeting.event.AbstractEvent;
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

    public SearchPerformedEvent(String sessionId, String username, String searchTerm) {
        super(sessionId, username);
        this.searchTerm = searchTerm;
    }

    public String getSearchTerm() {
        return searchTerm;
    }
}
