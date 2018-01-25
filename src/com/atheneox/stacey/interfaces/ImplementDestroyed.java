package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.Destroyed;
import java.util.List;

public interface ImplementDestroyed {
    
    
    public void input(Destroyed destroyed);
    
    public void update(Destroyed destroyed);
    
    public void delete(int id);
    
    public List<Destroyed> getDestroyed(String name);
    
    public List<Destroyed> getAllDestroyed();
    
}
