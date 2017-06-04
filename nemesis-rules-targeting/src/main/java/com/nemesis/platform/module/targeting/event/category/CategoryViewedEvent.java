package com.nemesis.platform.module.targeting.event.category;

import com.nemesis.platform.module.targeting.event.AbstractEvent;
import org.kie.api.definition.type.Expires;
import org.kie.api.definition.type.Role;

/**
 * An event that is raised once a user views certain category.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
@Expires("180s")
@Role(value = Role.Type.EVENT)
public class CategoryViewedEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "Category Code")
    private String categoryCode;

    @org.kie.api.definition.type.Label(value = "Supercaategories")
    private String[] superCategories;

    public CategoryViewedEvent(String sessionId, String username, String categoryCode, String[] superCategories) {
        super(sessionId, username);
        this.categoryCode = categoryCode;
        this.superCategories = superCategories;
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public String[] getSuperCategories() {
        return superCategories;
    }
}
