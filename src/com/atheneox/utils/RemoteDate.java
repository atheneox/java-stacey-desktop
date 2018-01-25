package com.atheneox.utils;

import java.net.InetAddress;
import org.apache.commons.net.ntp.NTPUDPClient;
import org.apache.commons.net.ntp.TimeInfo;
import java.util.Date;
 
public class RemoteDate {
    String servidor = "0.north-america.pool.ntp.org";
    public Date getNTPDate() {
        Date fechaRecibida = null;
        NTPUDPClient cliente = new NTPUDPClient();
        cliente.setDefaultTimeout(5000);
        try {
            InetAddress hostAddr = InetAddress.getByName(servidor);
            TimeInfo fecha = cliente.getTime(hostAddr);
            fechaRecibida = new Date(fecha.getMessage().getTransmitTimeStamp().getTime());
        } catch (Exception e) {
            System.err.println("Error "+e.getMessage());
        }
        cliente.close();
        return fechaRecibida == null ? new Date() : fechaRecibida ;
    }
}