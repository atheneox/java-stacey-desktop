package com.atheneox.horizontefrances.models;

import java.sql.Timestamp;

public class Submodel {
    
    private int Id;
    private String Name;
    private String Description;
    private String active_Name;
    private String visible_Name;
    private String destroyed_Name;
    private int active_Id;
    private int visible_Id;
    private int destroyed_Id;
    private Timestamp created_at;
    private Timestamp updated_at;
    
    public Submodel() {

    }
    
    public Submodel(int Id, String Name) {
        this.Id = Id;
        this.Name = Name;
    }

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

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public String getActive_Name() {
        return active_Name;
    }

    public void setActive_Name(String active_Name) {
        this.active_Name = active_Name;
    }

    public String getVisible_Name() {
        return visible_Name;
    }

    public void setVisible_Name(String visible_Name) {
        this.visible_Name = visible_Name;
    }

    public String getDestroyed_Name() {
        return destroyed_Name;
    }

    public void setDestroyed_Name(String destroyed_Name) {
        this.destroyed_Name = destroyed_Name;
    }

    public int getActive_Id() {
        return active_Id;
    }

    public void setActive_Id(int active_Id) {
        this.active_Id = active_Id;
    }

    public int getVisible_Id() {
        return visible_Id;
    }

    public void setVisible_Id(int visible_Id) {
        this.visible_Id = visible_Id;
    }

    public int getDestroyed_Id() {
        return destroyed_Id;
    }

    public void setDestroyed_Id(int destroyed_Id) {
        this.destroyed_Id = destroyed_Id;
    }
    
    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
    
    @Override
    public String toString() {
        return Name;
    } 
    
}
