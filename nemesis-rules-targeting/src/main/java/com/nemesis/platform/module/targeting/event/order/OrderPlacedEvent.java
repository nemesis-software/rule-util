package com.nemesis.platform.module.targeting.event.order;

import com.nemesis.platform.module.targeting.event.AbstractEvent;
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
