package com.atheneox.stacey.interfaces;

import com.atheneox.stacey.models.DocType;
import java.util.List;

public interface ImplementdocumentType {
    
     public void input(DocType documenttype);
    
    public void update(DocType documenttype);
    
    public void delete(int id);
    
    public List<DocType> getdocumentType(String name);
    
    public List<DocType> getAlldocumentType();
    
}
