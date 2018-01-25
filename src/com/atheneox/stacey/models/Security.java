package com.atheneox.stacey.models;

public class Security {
    private int Id;
    private String key_update;
    private String key_upgrade;
    private String key_general;
    private String license_expire;
    
    public Security()   {
    
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getKey_update() {
        return key_update;
    }

    public void setKey_update(String key_update) {
        this.key_update = key_update;
    }

    public String getKey_upgrade() {
        return key_upgrade;
    }

    public void setKey_upgrade(String key_upgrade) {
        this.key_upgrade = key_upgrade;
    }

    public String getKey_general() {
        return key_general;
    }

    public void setKey_general(String key_general) {
        this.key_general = key_general;
    }

    public String getLicense_expire() {
        return license_expire;
    }

    public void setLicense_expire(String license_expire) {
        this.license_expire = license_expire;
    }

    @Override
    public String toString() {
        return license_expire;
    }
    
    
}
