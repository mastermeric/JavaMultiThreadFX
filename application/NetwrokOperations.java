package application;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;

public class NetwrokOperations {
	
	public NetwrokOperations()
	{
		
	}
	
	loglama mylog;
	public String GetIPAdress()
	{
		if(mylog == null ) mylog  = new loglama(); 
		
		// -----  IP elde etme blogu -------------------------------
		String lokalIP = "";
		try {
			
			Enumeration e = NetworkInterface.getNetworkInterfaces();
			while(e.hasMoreElements())
			{
			    NetworkInterface n = (NetworkInterface) e.nextElement();
			    Enumeration ee = n.getInetAddresses();
			    while (ee.hasMoreElements())
			    {
			        InetAddress i = (InetAddress) ee.nextElement();
			        String temIP = i.getHostAddress();
			        if(temIP.contains("192.168.1."))
			        {
			        	lokalIP = temIP;
			        	return lokalIP;
			        }
			    }
			}			
			return lokalIP;
		}
		catch (Exception ex) {
			System.out.println("ERROR at GetIPAdress :\n"+ ex.toString());
			mylog.logYaz("ERROR at GetIPAdress :\n"+ ex.toString());
			return "";
			}
		//---------------------------------------------------------------------
	}
	
	
	public void ServerClientConfigurasyon(String ip)
	{
		if(mylog == null ) mylog  = new loglama();
		boolean isIpFound = false ;
		
		try
		{						
			if(ip.equals(PublicValues.ServerIP))
			{
				PublicValues.IsServer = true ;		
				PublicValues.DeviceType = "MASTER";
			}
			else
			{
				PublicValues.IsServer = false ;
				PublicValues.DeviceType = "SLAVE";
			}
						
			/*
			if(ip.equals( PublicValues.ServerIP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_1 ;}			
			else if(ip.equals(PublicValues.Client1_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_2;}
			else if(ip.equals(PublicValues.Client2_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_3;}
			else if(ip.equals(PublicValues.Client3_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_4;}
			else if(ip.equals(PublicValues.Client4_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_5;}
			else if(ip.equals(PublicValues.Client5_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_6;}
			else if(ip.equals(PublicValues.Client6_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_7;}
			else if(ip.equals(PublicValues.Client7_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_8;}
			else if(ip.equals(PublicValues.Client8_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_9;}
			else if(ip.equals(PublicValues.Client9_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_10;}
			else if(ip.equals(PublicValues.Client10_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_11;}
			else if(ip.equals(PublicValues.Client11_IP)) { PublicValues.DeviceType = PublicValues.TYPE_CIHAZ_12;}
			else 		
			{ PublicValues.DeviceType = "ORNEK-TEST-CIHAZ";}
			*/
			
			System.out.println("DeviceType : " + PublicValues.DeviceType);	
			mylog.logYaz(PublicValues.DeviceType + " : " + ip + " started...");
		}
		catch (Exception ex)
		{
			System.out.println("ERROR at ServerClientConfigurasyon :\n"+ ex.toString());
			mylog.logYaz("ERROR at ServerClientConfigurasyon :\n"+ ex.toString());
		}
	}
	
	/*
	public void IPListesiKontrol(String IP)
	{
		if(PublicValues.IsServer == true)  // SERVER IP ISLEMLERI
		{
			if(PublicValues.ServerIP .equals("")) { PublicValues.ServerIP = IP; } // burasi her zaman  ilk calisan kod blogu
		}
		else // CLIENT IP ISLEMLERI
		{
			if(PublicValues.Client1_IP.equals("")) { PublicValues.Client1_IP = IP ; }
			if(PublicValues.Client2_IP.equals("")) { PublicValues.Client2_IP = IP ; }
			if(PublicValues.Client3_IP.equals("")) { PublicValues.Client3_IP = IP ; }
			if(PublicValues.Client4_IP.equals("")) { PublicValues.Client4_IP = IP ; }
			if(PublicValues.Client5_IP.equals("")) { PublicValues.Client5_IP = IP ; }
			if(PublicValues.Client6_IP.equals("")) { PublicValues.Client6_IP = IP ; }
			if(PublicValues.Client7_IP.equals("")) { PublicValues.Client7_IP = IP ; }
			if(PublicValues.Client8_IP.equals("")) { PublicValues.Client8_IP = IP ; }
			if(PublicValues.Client9_IP.equals("")) { PublicValues.Client9_IP = IP ; }
			if(PublicValues.Client10_IP.equals("")) { PublicValues.Client10_IP = IP ; }
			if(PublicValues.Client11_IP.equals("")) { PublicValues.Client11_IP = IP ; }
		}
	}
	*/
	
	public void GetMACIDList()
	{
		if(mylog == null ) mylog  = new loglama(); 		
		
		try {
		    Process proc = Runtime.getRuntime().exec("nmap -PR -sn 192.168.1.0/24");

		    BufferedReader stdInput = new BufferedReader(new InputStreamReader(proc.getInputStream()));
		    BufferedReader stdError = new BufferedReader(new InputStreamReader(proc.getErrorStream()));

		    // read the output from the command
		    String s = null;

		    while ((s = stdInput.readLine()) != null) 
		    {
		        System.out.println(s);

			    // read any errors from the attempted command
			    while ((s = stdError.readLine()) != null)
			    {
			    	System.err.println(s);
			    }
		    } 
		}
		catch (Exception ex) 
		{
		    System.err.println(ex);
		    System.out.println("ERROR at GetMACIDList :\n"+ ex.toString());
		    mylog.logYaz("ERROR at GetMACIDList :\n"+ ex.toString());
		}
	}
		
}
