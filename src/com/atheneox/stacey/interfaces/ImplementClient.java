package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.Client;
import java.util.List;

public interface ImplementClient {
    
    public void input(Client client);
    
    public void update(Client client);
    
    public void delete(int id);
    
    public List<Client> getClient(String name);
    
    public List<Client> getAllClient();

}
