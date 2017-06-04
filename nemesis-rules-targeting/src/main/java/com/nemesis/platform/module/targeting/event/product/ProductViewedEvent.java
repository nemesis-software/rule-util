package com.nemesis.platform.module.targeting.event.product;

/**
 * An event that gets raised once a user views a product.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class ProductViewedEvent extends AbstractProductEvent {

    @org.kie.api.definition.type.Label(value = "Category Codes")
    private String[] categoryCodes;

    public ProductViewedEvent(String sessionId, String username, String productCode, String[] categoryCodes) {
        super(sessionId, username, productCode);
        this.categoryCodes = categoryCodes;
    }

    public String[] getCategoryCodes() {
        return categoryCodes;
    }
}
