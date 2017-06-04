package com.nemesis.platform.module.targeting.event.product;

/**
 * An event that gets raised once a user adds a product to their wishlist.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class ProductAddedToWishlistEvent extends AbstractProductEvent {
    public ProductAddedToWishlistEvent(String sessionId, String username, String productCode) {
        super(sessionId, username, productCode);
    }
}
