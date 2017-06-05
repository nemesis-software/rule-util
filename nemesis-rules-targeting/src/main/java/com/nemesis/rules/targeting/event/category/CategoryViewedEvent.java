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

package com.nemesis.rules.targeting.event.category;

import com.nemesis.rules.targeting.event.AbstractEvent;
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

    public CategoryViewedEvent() {
    }

    public CategoryViewedEvent(String sessionId, String username, String categoryCode, String[] superCategories) {
        super(sessionId, username);
        this.categoryCode = categoryCode;
        this.superCategories = superCategories;
    }

    /* getters/setters */

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    public String[] getSuperCategories() {
        return superCategories;
    }

    public void setSuperCategories(String[] superCategories) {
        this.superCategories = superCategories;
    }
}
