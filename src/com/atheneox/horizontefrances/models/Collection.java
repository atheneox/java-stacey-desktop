package com.atheneox.horizontefrances.models;

public class Collection {
    
    private int Id;
    private double Hight_cm;
    private double Width_cm;
    private double Hight_in;
    private double Width_in;
    private double price;
    private int Model_Id;
    private int Submodel_Id;
    private String Model;
    private String SubModel;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public double getHight_cm() {
        return Hight_cm;
    }

    public void setHight_cm(double Hight_cm) {
        this.Hight_cm = Hight_cm;
    }

    public double getWidth_cm() {
        return Width_cm;
    }

    public void setWidth_cm(double Width_cm) {
        this.Width_cm = Width_cm;
    }

    public double getHight_in() {
        return Hight_in;
    }

    public void setHight_in(double Hight_in) {
        this.Hight_in = Hight_in;
    }

    public double getWidth_in() {
        return Width_in;
    }

    public void setWidth_in(double Width_in) {
        this.Width_in = Width_in;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getModel_Id() {
        return Model_Id;
    }

    public void setModel_Id(int Model_Id) {
        this.Model_Id = Model_Id;
    }

    public int getSubmodel_Id() {
        return Submodel_Id;
    }

    public void setSubmodel_Id(int Submodel_Id) {
        this.Submodel_Id = Submodel_Id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getSubModel() {
        return SubModel;
    }

    public void setSubModel(String SubModel) {
        this.SubModel = SubModel;
    }

}
