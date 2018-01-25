package com.atheneox.stacey.models;

import java.sql.Timestamp;

public class Price {
    
    private int Id;
    private int active_Id;
    private int visible_Id;
    private int destroyed_Id;
    
    private String Code;
    private String Name;
    private String Description;
    private String active_Name;
    private String visible_Name;
    private String destroyed_Name;
    
    private Timestamp created_at;
    private Timestamp updated_at;
}
