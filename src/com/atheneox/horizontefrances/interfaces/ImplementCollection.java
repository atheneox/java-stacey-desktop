package com.atheneox.horizontefrances.interfaces;

import com.atheneox.horizontefrances.models.Collection;
import java.util.List;

public interface ImplementCollection {
    public void input(Collection collection);
    
    public void update(Collection collection);
    
    public void delete(int id);
    
    public List<Collection> getCollection(double hight, double width);
    
    public List<Collection> getAllCollection();
}
