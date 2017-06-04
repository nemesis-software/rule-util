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

    public AddressUpdatedEvent() {
    }

    public AddressUpdatedEvent(String sessionId, String username, String city, String countryCode, String postCode) {
        super(sessionId, username);
        this.city = city;
        this.countryCode = countryCode;
        this.postCode = postCode;
    }

    /* getters/setters */

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }
}
