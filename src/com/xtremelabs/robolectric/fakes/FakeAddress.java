package com.xtremelabs.robolectric.fakes;

import android.location.Address;
import com.xtremelabs.robolectric.util.Implementation;
import com.xtremelabs.robolectric.util.Implements;

@SuppressWarnings({"UnusedDeclaration"})
@Implements(Address.class)
public class FakeAddress {
    private String addressLine1;
    private String locality;
    private String postalCode;
    private String adminArea;
    private String countryCode;

    @Implementation
    public void setAddressLine(int index, String line) {
        addressLine1 = line;
    }

    @Implementation
    public String getAddressLine(int index) {
        return addressLine1;
    }

    @Implementation
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Implementation
    public String getLocality() {
        return locality;
    }

    @Implementation
    public String getAdminArea() {
        return adminArea;
    }

    @Implementation
    public void setAdminArea(String adminArea) {
        this.adminArea = adminArea;
    }

    @Implementation
    public String getPostalCode() {
        return postalCode;
    }

    @Implementation
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    @Implementation
    public String getCountryCode() {
        return countryCode;
    }

    @Implementation
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
}
