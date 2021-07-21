package application;

import java.io.File;
import java.util.concurrent.locks.ReentrantLock;


import javafx.scene.image.Image;

public final class PublicValues {
	
	public static ReentrantLock MyLocker = new ReentrantLock(); 
	public static int HesaplamaCounter = 0;
	
	public static boolean IlkHesapYapildi = false ;
	public static boolean IkinciHesapYapildi = false ;
	
	public static double kanal0_Result = 0;
	public static double kanal1_Result = 0;
	public static double kanal2_Result = 0;
	public static double kanal3_Result = 0;
	public static double kanal4_Result = 0;
	public static double kanal5_Result = 0;
	public static double kanal6_Result = 0;
	public static double kanal7_Result = 0;
	public static double kanal8_Result = 0;
	public static double kanal9_Result = 0;
	
	public static int kanal0_ilk = 0;
	public static int kanal1_ilk = 0;
	public static int kanal2_ilk = 0;
	public static int kanal3_ilk = 0;
	public static int kanal4_ilk = 0;
	public static int kanal5_ilk = 0;
	public static int kanal6_ilk = 0;
	public static int kanal7_ilk = 0;
	public static int kanal8_ilk = 0;
	public static int kanal9_ilk = 0;

	public static int kanal0_son = 0;
	public static int kanal1_son = 0;
	public static int kanal2_son = 0;
	public static int kanal3_son = 0;
	public static int kanal4_son = 0;
	public static int kanal5_son = 0;
	public static int kanal6_son = 0;
	public static int kanal7_son = 0;
	public static int kanal8_son = 0;
	public static int kanal9_son = 0;
	
	public static int kanal0_Sonuc = 0;
	public static int kanal1_Sonuc = 0;
	public static int kanal2_Sonuc = 0;
	public static int kanal3_Sonuc = 0;
	public static int kanal4_Sonuc = 0;
	public static int kanal5_Sonuc = 0;
	public static int kanal6_Sonuc = 0;
	public static int kanal7_Sonuc = 0;
	public static int kanal8_Sonuc = 0;
	public static int kanal9_Sonuc = 0;
	
	
	public static boolean TCPSentAvailable = false ; 
	
	public static String LogFileAdress = new File(".").getAbsolutePath().replace(".","");
		
	public static String BasincTotalValues = "";
	public static String BasincTotal_P1 = "";
	public static String BasincTotal_P2 = "";
	public static String BasincTotal_P3 = "";
	
	/*
	public static String Progress1BasincVal = "";
	public static String Progress2BasincVal = "";
	public static String Progress3BasincVal = "";
	public static String Progress4BasincVal = "";
	public static String Progress5BasincVal = "";
	public static String Progress6BasincVal = "";
	public static String Progress7BasincVal = "";
	public static String Progress8BasincVal = "";
	public static String Progress9BasincVal = "";
	public static String Progress10BasincVal = "";	
	*/
	
	public static boolean  Btn1_IsToggle = false;
	public static boolean  Btn2_IsToggle = false;
	public static boolean  Btn3_IsToggle = false;
	public static boolean  Btn4_IsToggle = false;
	public static boolean  Btn5_IsToggle = false;
	public static boolean  Btn6_IsToggle = false;
	public static boolean  Btn7_Lamba_IsToggle = false;
	
	
	public static byte Cihaz1_Btn_1_ON = 0x41; 	public static byte Cihaz1_Btn_1_OFF = 0x42;
	public static byte Cihaz1_Btn_2_ON = 0x43; 	public static byte Cihaz1_Btn_2_OFF = 0x44;
	public static byte Cihaz1_Btn_3_ON = 0x45; 	public static byte Cihaz1_Btn_3_OFF = 0x46;
	public static byte Cihaz1_Btn_4_ON = 0x47; 	public static byte Cihaz1_Btn_4_OFF = 0x48;
	
	public static byte Cihaz2_Btn_1_ON = 0x49; 	public static byte Cihaz2_Btn_1_OFF = 0x4A;
	public static byte Cihaz2_Btn_2_ON = 0x4B; 	public static byte Cihaz2_Btn_2_OFF = 0x4C;
	public static byte Cihaz2_Btn_3_ON = 0x4D; 	public static byte Cihaz2_Btn_3_OFF = 0x4E;
	
	public static byte Cihaz3_Btn_1_ON = 0x4F; 	public static byte Cihaz3_Btn_1_OFF = 0x50;
	public static byte Cihaz3_Btn_2_ON = 0x53; 	public static byte Cihaz3_Btn_2_OFF = 0x54;
	public static byte Cihaz3_Btn_3_ON = 0x55; 	public static byte Cihaz3_Btn_3_OFF = 0x56;
	public static byte Cihaz3_Btn_4_ON = 0x57; 	public static byte Cihaz3_Btn_4_OFF = 0x58;
	public static byte Cihaz3_Btn_5_ON = 0x5A; 	public static byte Cihaz3_Btn_5_OFF = 0x5B;
	public static byte Cihaz3_Btn_6_ON = 0x5C; 	public static byte Cihaz3_Btn_6_OFF = 0x5D;
	
	public static byte Cihaz4_Btn_1_ON = 0x61; 	public static byte Cihaz4_Btn_1_OFF = 0x62;
	public static byte Cihaz4_Btn_2_ON = 0x63; 	public static byte Cihaz4_Btn_2_OFF = 0x64;
	public static byte Cihaz4_Btn_3_ON = (byte)0xA3; 	public static byte Cihaz4_Btn_3_OFF = (byte)0xA4;
	
	public static byte Cihaz5_Btn_1_ON = 0x67; 	public static byte Cihaz5_Btn_1_OFF = 0x68;
	public static byte Cihaz5_Btn_2_ON = 0x69; 	public static byte Cihaz5_Btn_2_OFF = 0x6A;
	public static byte Cihaz5_Btn_3_ON = 0x6B; 	public static byte Cihaz5_Btn_3_OFF = 0x6C;
	public static byte Cihaz5_Btn_4_ON = 0x6D; 	public static byte Cihaz5_Btn_4_OFF = 0x6E;
	
	public static byte Cihaz6_Btn_1_ON = 0x6F; 	public static byte Cihaz6_Btn_1_OFF = 0x70;
	public static byte Cihaz6_Btn_2_ON = 0x71; 	public static byte Cihaz6_Btn_2_OFF = 0x72;
	
	public static byte Cihaz7_Btn_1_ON = 0x73; 	public static byte Cihaz7_Btn_1_OFF = 0x74;
	public static byte Cihaz7_Btn_2_ON = 0x75; 	public static byte Cihaz7_Btn_2_OFF = 0x76;
	public static byte Cihaz7_Btn_3_ON = 0x77; 	public static byte Cihaz7_Btn_3_OFF = 0x78;
	public static byte Cihaz7_Btn_4_ON = 0x79; 	public static byte Cihaz7_Btn_4_OFF = 0x59;
	public static byte Cihaz7_Btn_5_ON = 0x7B; 	public static byte Cihaz7_Btn_5_OFF = 0x7C;
	
	public static byte Cihaz8_Btn_1_ON = 0x7D; 	public static byte Cihaz8_Btn_1_OFF = 0x21;
	public static byte Cihaz8_Btn_2_ON = 0x22; 	public static byte Cihaz8_Btn_2_OFF = 0x25;
	public static byte Cihaz8_Btn_3_ON = 0x28; 	public static byte Cihaz8_Btn_3_OFF = 0x2A;
	public static byte Cihaz8_Btn_4_ON = 0x2B; 	public static byte Cihaz8_Btn_4_OFF = 0x2C;
	
	public static byte Cihaz9_Btn_1_ON = 0x2D; 	public static byte Cihaz9_Btn_1_OFF = 0x2E;
	public static byte Cihaz9_Btn_2_ON = 0x2F; 	public static byte Cihaz9_Btn_2_OFF = 0x30;
	
	public static byte Cihaz10_Btn_1_ON = 0x31; 	public static byte Cihaz10_Btn_1_OFF = 0x32;
	public static byte Cihaz10_Btn_2_ON = 0x33; 	public static byte Cihaz10_Btn_2_OFF = 0x34;
	public static byte Cihaz10_Btn_3_ON = 0x35; 	public static byte Cihaz10_Btn_3_OFF = 0x36;
	public static byte Cihaz10_Btn_4_ON = 0x37; 	public static byte Cihaz10_Btn_4_OFF = 0x38;
	public static byte Cihaz10_Btn_5_ON = 0x3B; 	public static byte Cihaz10_Btn_5_OFF = 0x3C;
	
	public static byte Cihaz11_Btn_1_ON = 0x3D; 	public static byte Cihaz11_Btn_1_OFF = 0x3E;
	public static byte Cihaz11_Btn_2_ON = 0x3F; 	public static byte Cihaz11_Btn_2_OFF = 0x3A;
	public static byte Cihaz11_Btn_3_ON = 0x26; 	public static byte Cihaz11_Btn_3_OFF = 0x27;
	
	public static byte Cihaz12_Btn_1_ON = 0x29; 	public static byte Cihaz12_Btn_1_OFF = 0x5E;
	public static byte Cihaz12_Btn_2_ON = 0x5F; 	public static byte Cihaz12_Btn_2_OFF = 0x65;
	
	/*
	public static byte Cihaz1_Lamba_ON = (byte) 0xA1; 		public static byte Cihaz1_Lamba_OFF = (byte) 0xA2;
	public static byte Cihaz4_Lamba_ON = (byte) 0xA3; 		public static byte Cihaz4_Lamba_OFF = (byte) 0xA4;
	public static byte Cihaz10_Lamba_ON = (byte) 0xA5; 		public static byte Cihaz10_Lamba_OFF = (byte) 0xA6;
	*/
	
	public static final String TYPE_CIHAZ_1 = "EKRAN-1";
	public static final String TYPE_CIHAZ_2= "EKRAN-2";
	public static final String TYPE_CIHAZ_3= "EKRAN-3";
	public static final String TYPE_CIHAZ_4= "EKRAN-4";
	public static final String TYPE_CIHAZ_5= "EKRAN-5";
	public static final String TYPE_CIHAZ_6= "EKRAN-6";
	public static final String TYPE_CIHAZ_7= "EKRAN-7";
	public static final String TYPE_CIHAZ_8= "EKRAN-8";
	public static final String TYPE_CIHAZ_9= "EKRAN-9";
	public static final String TYPE_CIHAZ_10= "EKRAN-10";
	public static final String TYPE_CIHAZ_11= "EKRAN-11";
	public static final String TYPE_CIHAZ_12= "EKRAN-12";
	public static final String TYPE_test= "test-EKRAN";
	
	
	public static String DeviceType = "";
	public static boolean IsServer = false;
	public static String ConfigFile = ""; 

	
	//IP Blok 
	public static String ServerIP = "192.168.1.222";  	// Linux : 220 
	public static String Client1_IP = "192.168.1.252";  // Linux : 221
		
	public static String Client2_IP = "192.168.1.202";
	public static String Client3_IP = "192.168.1.203";
	public static String Client4_IP = "192.168.1.204";
	public static String Client5_IP = "192.168.1.205";
	public static String Client6_IP = "192.168.1.206";
	public static String Client7_IP = "192.168.1.207";
	public static String Client8_IP = "192.168.1.208";
	public static String Client9_IP = "192.168.1.209";
	public static String Client10_IP = "192.168.1.210";
	public static String Client11_IP = "192.168.1.211";
	public static String test_IP = "192.168.1.101";			
	
	// Goresl blok
	public static Image image_hansgrohe_title ;//= new Image(file_hansgrohe_title.toURI().toString());
	public static Image image_Axor_title;//= new Image(file_hansgrohe_title.toURI().toString());
	public static Image image_1_1 ;//= new Image(file_1_1.toURI().toString());
	public static Image image_1_2 ;//= new Image(file_1_2.toURI().toString());
	public static Image image_1_3 ;//= new Image(file_1_3.toURI().toString());
	public static Image image_1_4 ;//= new Image(file_1_4.toURI().toString());
	public static Image image_2_1 ;//= new Image(file_2_1.toURI().toString());
	public static Image image_2_2 ;//= new Image(file_2_2.toURI().toString());
	public static Image image_2_3 ;//= new Image(file_2_3.toURI().toString());
	public static Image image_3_1 ;
	public static Image image_3_2 ;
	public static Image image_3_3 ;
	public static Image image_3_4 ;
	public static Image image_3_5 ;
	public static Image image_3_6 ;
	
	public static Image image_4_1 ;
	public static Image image_4_2 ;
	public static Image image_4_3 ;
	
	public static Image image_5_1 ;
	public static Image image_5_2 ;
	public static Image image_5_3 ;
	public static Image image_5_4 ;
	public static Image image_6_1 ;
	public static Image image_6_2 ;
	public static Image image_7_1 ;
	public static Image image_7_2 ;
	public static Image image_7_3 ;
	public static Image image_7_4 ;
	public static Image image_7_5 ;
	public static Image image_8_1 ;
	public static Image image_8_2 ;
	public static Image image_8_3 ;
	public static Image image_8_4 ;
	public static Image image_9_1 ;
	public static Image image_9_2 ;
	public static Image image_10_1;
	public static Image image_10_2;
	public static Image image_10_3;
	public static Image image_10_4;
	public static Image image_10_5;
	public static Image image_11_1;
	public static Image image_11_2;
	public static Image image_11_3;
	public static Image image_12_1;
	public static Image image_12_2;
	public static Image image_lamba;	
}
