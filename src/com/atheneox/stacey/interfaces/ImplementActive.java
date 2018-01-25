package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.Active;
import java.util.List;

public interface ImplementActive {

    public void input(Active active);
    
    public void update(Active active);
    
    public void delete(int id);
    
    public List<Active> getActive(String name);
    
    public List<Active> getAllActive();
}
