package com.atheneox.stacey.models;

public class Locked {
 
    private int Id;
    private String Name;
    private String Description;
    
    public Locked() {
    
    }
    
    public Locked(int Id, String Name) {
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

    @Override
    public String toString() {
        return Name;
    }
    
}
