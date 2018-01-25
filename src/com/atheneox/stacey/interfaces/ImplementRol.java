package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.Rol;
import java.util.List;

public interface ImplementRol {
    
    public void input(Rol rol);
    
    public void update(Rol rol);
    
    public void delete(int id);
    
    public List<Rol> getRol(String name);
    
    public List<Rol> getAllRol();
    
}
