package com.atheneox.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import com.atheneox.stacey.controllers.SecurityController;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Utils {
    
    public static double cmToin (double cm) {
        //DecimalFormat df = new DecimalFormat("##.##");
        double rs = Math.round((cm*0.393701)*100.0)/100.0;
        //rs = df.format(rs);
    return rs;
    }
    
    public static double inTocm (double in) {
        //DecimalFormat df = new DecimalFormat("##.##");
        double rs = Math.round((in*2.54)*100.0)/100.0;
        //df.format(rs);
    return rs;
    }
    
    public static String getRemoteDate()throws ParseException  { //throws ParseException
        String date_string="";
        RemoteDate objFecha = new RemoteDate(); 
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-dd HH:mm:ss
        date_string = formato.format(objFecha.getNTPDate());
        formato.format(objFecha.getNTPDate());
        return date_string;
    }
    
    public static String getLocalDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-dd HH:mm:sss
        String  date = formato.format(calendar.getTime());
        return date;
    }
    
    public static Date getLocalDate_Date() {
        Date date=null;
        try {
                SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-MM-dd HH:mm:sss
                date = formato.parse(getLocalDate());
                return date;
        } catch (ParseException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return date;
    }
    
    public static java.sql.Timestamp getLocalTimestamp(){
        java.sql.Timestamp timestamp = null;
        java.util.Date d = new java.util.Date();  
        timestamp = new java.sql.Timestamp(d.getTime());
                           
        return timestamp;
    }
    
    
    public static String getDBDate()    {
        SecurityController securityController = new SecurityController();
        String  date  = securityController.LicenseDate();
        return date;
    }
    
    public static boolean validateLicense() {
        try {
            SimpleDateFormat sdp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date hora_local = sdp.parse(getLocalDate());
            Date hora_remote= sdp.parse(getRemoteDate());
            Date hora_bd    = sdp.parse(getDBDate()) ;
            
            boolean rs = false;
            if(hora_remote.before(hora_bd)){
                rs = true;
            }
            else{
                rs = false;
            }
            return rs;
        } catch (ParseException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean Internet()    {
        boolean res = false;
        String url = "www.google.com";
        int port = 80;
        try{
            Socket s = new Socket(url, port);
            if(s.isConnected()){
                res = true;
            }
            else {
                res = false;
            }
            
        } catch (IOException ex) {
            res = false;
            //Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    public static String getMACAddress(){
        String MACAdress="";
        InetAddress ip;
	try {
            ip = InetAddress.getLocalHost();
            NetworkInterface network = NetworkInterface.getByInetAddress(ip);
            byte[] mac = network.getHardwareAddress();
            StringBuilder sb = new StringBuilder();
                for (int i = 0; i < mac.length; i++) {
                    sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
                }
		MACAdress = sb.toString();
	} catch (UnknownHostException e) {
		
		e.printStackTrace();
		
	} catch (SocketException e){
			
		e.printStackTrace();	
	}
        return MACAdress;
    }
    
    public static String getPrivateIP()  {
        String res = "";
        try {
            InetAddress ip;
            ip = InetAddress.getLocalHost();
            res = ""+ip.getHostAddress();
            return res;
        } catch (UnknownHostException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
        
    public static String getHostname(){
        String res = "";
        try {
            InetAddress ip;
            ip = InetAddress.getLocalHost();
            res= ip.getHostName();  
            return res;
        } catch (UnknownHostException ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return res;
    }
    
    
    public static void validateDouble(java.awt.event.KeyEvent evt){
    
    char caracter = evt.getKeyChar();
            if(((caracter < '0')    ||
                (caracter > '9'))   &&
                (caracter != '.')   &&
                (caracter != ',')) {
                evt.consume();
            }
    }
    
}