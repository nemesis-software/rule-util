package com.nemesis.platform.module.targeting.event.cms;

import com.nemesis.platform.module.targeting.event.AbstractEvent;
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

    public CmsPageViewedEvent(String sessionId, String username, String url) {
        super(sessionId, username);
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
