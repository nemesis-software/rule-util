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
package io.nemesis.rules.targeting.event.product;

import io.nemesis.rules.targeting.event.AbstractEvent;

/**
 * A base class for all product related events.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class AbstractProductEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "Product Code")
    private String productCode;

    public AbstractProductEvent() {
    }

    public AbstractProductEvent(String sessionId, String username, String productCode) {
        super(sessionId, username);
        this.productCode = productCode;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
