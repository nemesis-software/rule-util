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
package com.nemesis.rules.targeting.event.order;

import com.nemesis.rules.targeting.event.AbstractEvent;
import org.kie.api.definition.type.Role;

import java.math.BigDecimal;

/**
 * An event that is raised once a user places an order.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
@Role(value = Role.Type.EVENT)
public class OrderPlacedEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "Total")
    private BigDecimal total;

    public OrderPlacedEvent() {
    }

    public OrderPlacedEvent(String sessionId, String username, BigDecimal total) {
        super(sessionId, username);
        this.total = total;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}
