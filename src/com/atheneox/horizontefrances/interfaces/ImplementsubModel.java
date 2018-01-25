package com.atheneox.horizontefrances.interfaces;

import com.atheneox.horizontefrances.models.Submodel;
import java.util.List;

public interface ImplementsubModel {
    public void input(Submodel model);
    
    public void update(Submodel collection);
    
    public void delete(int id);
    
    public List<Submodel> getSubModel(String name);
    
    public List<Submodel> getAllSubModel();  
}
