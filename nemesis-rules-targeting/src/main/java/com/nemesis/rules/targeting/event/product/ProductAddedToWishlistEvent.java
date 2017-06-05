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
 * An event that gets raised once a user adds a product to their wishlist.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class ProductAddedToWishlistEvent extends AbstractProductEvent {

    public ProductAddedToWishlistEvent() {
    }

    public ProductAddedToWishlistEvent(String sessionId, String username, String productCode) {
        super(sessionId, username, productCode);
    }
}
