package com.example.mosquefinder;

public class Admin {
    String adminId;
    String adminName;

    public Admin(){}

    public Admin(String adminId, String adminName) {
        this.adminId = adminId;
        this.adminName = adminName;
    }

    public String getAdminId() {
        return adminId;
    }

    public String getAdminName() {
        return adminName;
    }
}
