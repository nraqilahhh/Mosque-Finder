package com.example.mosquefinder;

public class Location {

    String locationId;
    String locationName;

    public Location(){}

    public Location(String locationId, String locationName) {
        this.locationId = locationId;
        this.locationName = locationName;
    }

    public String getLocationId() {
        return locationId;
    }

    public String getLocationName() {
        return locationName;
    }
}
