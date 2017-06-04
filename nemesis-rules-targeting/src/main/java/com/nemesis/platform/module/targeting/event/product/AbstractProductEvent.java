package com.nemesis.platform.module.targeting.event.product;

import com.nemesis.platform.module.targeting.event.AbstractEvent;

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
