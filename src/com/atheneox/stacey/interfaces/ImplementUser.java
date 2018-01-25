package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.User;
import java.util.List;

public interface ImplementUser {
   
    public void input(User user);
    
    public void update(User user);
    
    public void delete(int id);
    
    public List<User> getUser(String name);
    
    public List<User> getAllUser();
    
}
