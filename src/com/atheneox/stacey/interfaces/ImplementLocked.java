package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.Locked;
import java.util.List;

public interface ImplementLocked {
    
    public void input(Locked user);
    
    public void update(Locked user);
    
    public void delete(int id);
    
    public List<Locked> getLocked(String name);
    
    public List<Locked> getAllLocked();
    
}
