package com.nemesis.platform.module.targeting.event.product;

/**
 * An event that is raised once user adds a product to their cart.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class ProductAddedToCartEvent extends AbstractProductEvent {

    @org.kie.api.definition.type.Label(value = "Quantity")
    private int quantity;

    public ProductAddedToCartEvent(String sessionId, String username, String productCode, int quantity) {
        super(sessionId, username, productCode);
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }
}
