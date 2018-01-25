package com.atheneox.stacey.models;

import java.sql.Timestamp;

public class User {
    
    private int Id;
    private String Name;
    private String Lastname;
    private String Cellphone;
    private String Email;
    private int documenttype_id;
    private String documenttype_name;
    private String documentNumber;
    private String Description;
    private String locked_Name;
    private String active_Name;
    private String visible_Name;
    private String destroyed_Name;
    private int locked_Id;
    private int active_Id;
    private int visible_Id;
    private int destroyed_Id;
    private Timestamp created_at;
    private Timestamp updated_at;
    
    public User()   {
    
    
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

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String Cellphone) {
        this.Cellphone = Cellphone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getDocumenttype_id() {
        return documenttype_id;
    }

    public void setDocumenttype_id(int documenttype_id) {
        this.documenttype_id = documenttype_id;
    }

    public String getDocumenttype_name() {
        return documenttype_name;
    }

    public void setDocumenttype_name(String documenttype_name) {
        this.documenttype_name = documenttype_name;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getLocked_Name() {
        return locked_Name;
    }

    public void setLocked_Name(String locked_Name) {
        this.locked_Name = locked_Name;
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

    public int getLocked_Id() {
        return locked_Id;
    }

    public void setLocked_Id(int locked_Id) {
        this.locked_Id = locked_Id;
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

}
