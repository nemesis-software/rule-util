package com.nemesis.platform.module.targeting;

import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

import java.io.Serializable;

/**
 * @author Petar Tahchiev
 * @since 1.5
 */
@Expires("30s")
@Role(value = Role.Type.EVENT)
public class TransactionEvent implements Serializable {

    @org.kie.api.definition.type.Label("SessionID")
    private String sessionId;

    @org.kie.api.definition.type.Label("Page Category")
    private String pageCategory;

    public TransactionEvent() {
    }

    public TransactionEvent(String sessionId, String pageCategory) {
        this.sessionId = sessionId;
        this.pageCategory = pageCategory;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getPageCategory() {
        return pageCategory;
    }

    public void setPageCategory(String pageCategory) {
        this.pageCategory = pageCategory;
    }
}
