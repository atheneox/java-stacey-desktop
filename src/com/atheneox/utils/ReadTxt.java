package com.atheneox.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTxt {
    public String DBSQL(){
      File archivo = null;
      FileReader fr = null;
      BufferedReader br = null;

      try {
         StringBuilder sb = new StringBuilder("");
         archivo = new File ("/Users/amint/Documents/stacey.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         String datos="";
         String linea;
         while((linea=br.readLine())!=null){
             datos = sb.append(linea).append("\n").toString();
         }
         
         return datos;
      }
      
      catch(Exception e){
         e.printStackTrace();
      }finally{
          
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    return "";
}
}