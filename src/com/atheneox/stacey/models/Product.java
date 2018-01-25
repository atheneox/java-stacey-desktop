package com.atheneox.stacey.models;

import java.sql.Timestamp;

public class Product {
    
    private int Id;
    private int model_Id;
    private int submodel_Id;
    private int group_Id;
    private int type_Id;
    private int active_Id;
    private int visible_Id;
    private int destroyed_Id;
    
    private String Name;
    private String model_Name;
    private String submodel_Name;
    private String group_Name;
    private String Code;
    private String barCode;
    private String Observation;
    private String active_Name;
    private String visible_Name;
    private String destroyed_Name;
    
    private Timestamp created_at;
    private Timestamp updated_at;
    
}
