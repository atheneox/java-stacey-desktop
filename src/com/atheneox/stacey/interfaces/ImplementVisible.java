package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.Visible;
import java.util.List;

public interface ImplementVisible {
    
    public void input(Visible user);
    
    public void update(Visible user);
    
    public void delete(int id);
    
    public List<Visible> getVisible(String name);
    
    public List<Visible> getAllVisible();
    
}
