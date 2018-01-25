package com.atheneox.horizontefrances.interfaces;

import com.atheneox.horizontefrances.models.Model;
import java.util.List;

public interface ImplementModel {
    public void input(Model model);
    
    public void update(Model model);
    
    public void delete(int id);
    
    public List<Model> getModel(String name);
    
    public List<Model> getAllModel();
}
