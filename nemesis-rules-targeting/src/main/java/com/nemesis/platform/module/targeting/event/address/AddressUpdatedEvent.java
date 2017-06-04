package com.nemesis.platform.module.targeting.event.address;

import com.nemesis.platform.module.targeting.event.AbstractEvent;

/**
 * An event that is raised once user updates their address.
 *
 * @author Petar Tahchiev
 * @since 1.5
 */
public class AddressUpdatedEvent extends AbstractEvent {

    @org.kie.api.definition.type.Label(value = "City")
    private String city;

    @org.kie.api.definition.type.Label(value = "Country code")
    private String countryCode;

    @org.kie.api.definition.type.Label(value = "PostCode")
    private String postCode;

    public AddressUpdatedEvent(String sessionId, String username, String city, String countryCode, String postCode) {
        super(sessionId, username);
        this.city = city;
        this.countryCode = countryCode;
        this.postCode = postCode;
    }

    public String getCity() {
        return city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getPostCode() {
        return postCode;
    }
}
