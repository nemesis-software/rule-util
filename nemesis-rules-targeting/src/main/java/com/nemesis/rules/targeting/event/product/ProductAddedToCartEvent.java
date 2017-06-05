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
package com.nemesis.rules.targeting.event.product;

/**
 * An event that is raised once user adds a product to their cart.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class ProductAddedToCartEvent extends AbstractProductEvent {

    @org.kie.api.definition.type.Label(value = "Quantity")
    private int quantity;

    public ProductAddedToCartEvent() {
    }

    public ProductAddedToCartEvent(String sessionId, String username, String productCode, int quantity) {
        super(sessionId, username, productCode);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
