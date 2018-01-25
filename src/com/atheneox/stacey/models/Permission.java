package com.atheneox.stacey.models;

import java.util.Date;

public class Permission {
    
    private int Id;
    private String Name;
    private String displayName;
    private String Description;
    private Date createdAt;
    private Date updateAt;
    private int active_Id;
    private String active_Name;
    private int destroyed_Id;
    private String destroyed_Name;
    private int visible_Id;
    private String visible_Name;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public int getActive_Id() {
        return active_Id;
    }

    public void setActive_Id(int active_Id) {
        this.active_Id = active_Id;
    }

    public String getActive_Name() {
        return active_Name;
    }

    public void setActive_Name(String active_Name) {
        this.active_Name = active_Name;
    }

    public int getDestroyed_Id() {
        return destroyed_Id;
    }

    public void setDestroyed_Id(int destroyed_Id) {
        this.destroyed_Id = destroyed_Id;
    }

    public String getDestroyed_Name() {
        return destroyed_Name;
    }

    public void setDestroyed_Name(String destroyed_Name) {
        this.destroyed_Name = destroyed_Name;
    }

    public int getVisible_Id() {
        return visible_Id;
    }

    public void setVisible_Id(int visible_Id) {
        this.visible_Id = visible_Id;
    }

    public String getVisible_Name() {
        return visible_Name;
    }

    public void setVisible_Name(String visible_Name) {
        this.visible_Name = visible_Name;
    }
    
}
