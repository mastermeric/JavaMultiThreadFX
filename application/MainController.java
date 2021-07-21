package application;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.control.Label;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;


public class MainController implements Initializable {		
	
	//@FXML TextArea txtMsg;
	@FXML Label lblBar, lblBar1,lblBar2,lblBar3,lblBar4,lblBar5,lblBar6,lblBar7,lblBar8,lblBar9,lblBar10 ,lblBarSbt;
	@FXML ImageView imgTitle;
	//@FXML ListView lstMesajlar;
	//@FXML ImageView imgTitle;	
	
	@FXML ProgressBar progres1,progres2,progres3,progres4,progres5,progres6,progres7,progres8,progres9,progres10;
	@FXML Slider Slider1;		
			
	DataOutputStream toServer = null ;
	DataInputStream fromServer = null ;	
	String tempStr1 = "";
	FileOperations myFileOp;	
	
	loglama mylog;	
	int ClientNo ;

	public int IlkHesap = 0;
	public int SonHesap = 1;
	
	String Progress1BasincVal = "";
	String Progress2BasincVal = "";
	String Progress3BasincVal = "";
	String Progress4BasincVal = "";
	String Progress5BasincVal = "";
	String Progress6BasincVal = "";
	String Progress7BasincVal = "";
	String Progress8BasincVal = "";
	String Progress9BasincVal = "";
	String Progress10BasincVal = "";	
	
	int aradeger0 =0;
	int aradeger1 =0;
	int aradeger2 =0;
	int aradeger3 =0;
	int aradeger4 =0;
	int aradeger5 =0;
	int aradeger6 =0;
	int aradeger7 =0;
	int aradeger8 =0;
	int aradeger9 =0;
	
	
    Runnable EkraniGuncelle = new Runnable() {		
		@Override
		public void run() {
			
			while(true)
			{
			   try {
				   //Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}			
				progres1.progressProperty().setValue(PublicValues.kanal0_Result);// >0 ? PublicValues.kanal0_Result: 0);
				progres2.progressProperty().setValue(PublicValues.kanal1_Result);//>0 ? PublicValues.kanal1_Result: 0);
				progres3.progressProperty().setValue(PublicValues.kanal2_Result);//>0 ? PublicValues.kanal2_Result: 0);
				progres4.progressProperty().setValue(PublicValues.kanal3_Result);//>0 ? PublicValues.kanal3_Result: 0);
				progres5.progressProperty().setValue(PublicValues.kanal4_Result);//>0 ? PublicValues.kanal4_Result: 0);
				progres6.progressProperty().setValue(PublicValues.kanal5_Result);//>0 ? PublicValues.kanal5_Result: 0);
				progres7.progressProperty().setValue(PublicValues.kanal6_Result);//>0 ? PublicValues.kanal6_Result: 0);
				progres8.progressProperty().setValue(PublicValues.kanal7_Result);//>0 ? PublicValues.kanal7_Result: 0);
				progres9.progressProperty().setValue(PublicValues.kanal8_Result);//>0 ? PublicValues.kanal8_Result: 0);
				progres10.progressProperty().setValue(PublicValues.kanal9_Result);//>0 ? PublicValues.kanal9_Result: 0);				
				
				lblBar1.setText(PublicValues.kanal0_Result>0 ? String.valueOf(PublicValues.kanal0_Result): "0.0");
				lblBar2.setText(PublicValues.kanal1_Result>0 ? String.valueOf(PublicValues.kanal1_Result): "0.0");
				lblBar3.setText(PublicValues.kanal2_Result>0 ? String.valueOf(PublicValues.kanal2_Result): "0.0");
				lblBar4.setText(PublicValues.kanal3_Result>0 ? String.valueOf(PublicValues.kanal3_Result): "0.0");
				lblBar5.setText(PublicValues.kanal4_Result>0 ? String.valueOf(PublicValues.kanal4_Result): "0.0");
				lblBar6.setText(PublicValues.kanal5_Result>0 ? String.valueOf(PublicValues.kanal5_Result): "0.0");
				lblBar7.setText(PublicValues.kanal6_Result>0 ? String.valueOf(PublicValues.kanal6_Result): "0.0");
				lblBar8.setText(PublicValues.kanal7_Result>0 ? String.valueOf(PublicValues.kanal7_Result): "0.0");
				lblBar9.setText(PublicValues.kanal8_Result>0 ? String.valueOf(PublicValues.kanal8_Result): "0.0");
				lblBar10.setText(PublicValues.kanal9_Result>0 ? String.valueOf(PublicValues.kanal9_Result): "0.0");				
			   }
			   catch (IllegalStateException ex)
			   {
				   
			   }
			   catch(Exception ex)
			   {
				   
			   }
			}
		}
	};
	
	
	 Runnable DegerUret = new Runnable() {			
		@Override
		public void run() {
			try
			{
				while(true)
				{
					int TempVal1 = ThreadLocalRandom.current().nextInt(1, 100);
					int TempVal2 = ThreadLocalRandom.current().nextInt(1, 100);
					int TempVal3 = ThreadLocalRandom.current().nextInt(1, 100);
					int TempVal4 = ThreadLocalRandom.current().nextInt(1, 100);
					int TempVal5 = ThreadLocalRandom.current().nextInt(1, 100);
										
					String Temp_1 = String.valueOf(TempVal1) ;
					String Temp_2 = String.valueOf(TempVal2) ;
					String Temp_3 = String.valueOf(TempVal3) ;
					String Temp_4 = String.valueOf(TempVal4) ;					
					String Temp_5 = String.valueOf(TempVal5) ;					
					
					PublicValues.BasincTotalValues = "A0>"+Temp_1+"A1>"+Temp_2+"A2>"+Temp_3+"A3>"+Temp_4+"A4>"+Temp_5+"A5>5A6>5A7>5A8>5A9>5";																				
					//if(TempVal > 999) TempVal = 0;
					System.out.println("BasincTotalValues ==> " + PublicValues.BasincTotalValues);
					Thread.sleep(500);
				}
			}
			catch (IllegalStateException ex)
			{
				
			}
			catch(Exception ex) 
			{
				//PublicValues.MyLocker.unlock();
				//String AA  = ex.getMessage();
				System.out.println("ERROR at Uret -> \n"+ ex.toString());
				mylog.logYaz("ERROR at Uret -> :\n"+ ex.toString());
			}			
		}
	};	
	
	
   Runnable DegerleriYaz = new Runnable() {		
		@Override
		public void run() {
			int Temp_Index_0 ;
			int Temp_Index_1 ;
			int Temp_Index_2 ;
			int Temp_Index_3 ;
			int Temp_Index_4 ;
			int Temp_Index_5 ;
			int Temp_Index_6 ;
			int Temp_Index_7 ;
			int Temp_Index_8 ;
			int Temp_Index_9 ;
			
			try
			{
				while(true)
				{
				//PublicValues.MyLocker.lock();				
				//Thread.sleep(250);				
				//System.out.println("... Stage-1");	
				
				try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}				
				//if(PublicValues.BasincTotalValues.length()>27)
				{
					String Temp_P = PublicValues.BasincTotalValues;					
					System.out.println("Gelen Veri : "+ Temp_P);					
					try
					{
						//System.out.println("... Stage-1");					
						Temp_Index_0 = Temp_P.indexOf("A0>");
						Temp_Index_1 = Temp_P.indexOf("A1>");
						Temp_Index_2 = Temp_P.indexOf("A2>");
						Temp_Index_3 = Temp_P.indexOf("A3>");
						Temp_Index_4 = Temp_P.indexOf("A4>");
						Temp_Index_5 = Temp_P.indexOf("A5>");
						Temp_Index_6 = Temp_P.indexOf("A6>");
						Temp_Index_7 = Temp_P.indexOf("A7>");
						Temp_Index_8 = Temp_P.indexOf("A8>");
						Temp_Index_9 = Temp_P.indexOf("A9>");
						
						//System.out.println("... Stage-2");
					}
					catch (IllegalStateException ex)
					{
						System.out.println("ERROR at INIT -> \n"+ ex.toString());
						
						Temp_P = "A0>5A1>5A2>5A3>5A4>5A5>5A6>5A7>5A8>5A9>5";
						Temp_Index_0 = Temp_P.indexOf("A0>");
						Temp_Index_1 = Temp_P.indexOf("A1>");
						Temp_Index_2 = Temp_P.indexOf("A2>");
						Temp_Index_3 = Temp_P.indexOf("A3>");
						Temp_Index_4 = Temp_P.indexOf("A4>");
						Temp_Index_5 = Temp_P.indexOf("A5>");
						Temp_Index_6 = Temp_P.indexOf("A6>");
						Temp_Index_7 = Temp_P.indexOf("A7>");
						Temp_Index_8 = Temp_P.indexOf("A8>");
						Temp_Index_9 = Temp_P.indexOf("A9>");		
					}
					catch(Exception ex)
					{
						System.out.println("ERROR at INIT -> \n"+ ex.toString());
						
						Temp_P = "A0>5A1>5A2>5A3>5A4>5A5>5A6>5A7>5A8>5A9>5";
						Temp_Index_0 = Temp_P.indexOf("A0>");
						Temp_Index_1 = Temp_P.indexOf("A1>");
						Temp_Index_2 = Temp_P.indexOf("A2>");
						Temp_Index_3 = Temp_P.indexOf("A3>");
						Temp_Index_4 = Temp_P.indexOf("A4>");
						Temp_Index_5 = Temp_P.indexOf("A5>");
						Temp_Index_6 = Temp_P.indexOf("A6>");
						Temp_Index_7 = Temp_P.indexOf("A7>");
						Temp_Index_8 = Temp_P.indexOf("A8>");
						Temp_Index_9 = Temp_P.indexOf("A9>");				
					}
					
						
					if(Temp_P.contains("A0>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_0+3,Temp_Index_1).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress1BasincVal = Temp_SubStr; 
							System.out.println("BASINC-1: " + Progress1BasincVal);
						}
					}																	
					if(Temp_P.contains("A1>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_1+3,Temp_Index_2).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress2BasincVal = Temp_SubStr;
							System.out.println("BASINC-2: " + Progress2BasincVal);
						}
					}						
					if(Temp_P.contains("A2>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_2+3,Temp_Index_3).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress3BasincVal = Temp_SubStr;
							System.out.println("BASINC-3: " + Progress3BasincVal);
						}
					}						
					if(Temp_P.contains("A3>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_3+3,Temp_Index_4).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress4BasincVal = Temp_SubStr;
							//System.out.println("BASINC-4: " + Progress4BasincVal);
						}
					}						
					if(Temp_P.contains("A4>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_4+3,Temp_Index_5).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress5BasincVal = Temp_SubStr;
							//System.out.println("BASINC-5: " + Progress5BasincVal);
						}							
					}						
					if(Temp_P.contains("A5>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_5+3,Temp_Index_6).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress6BasincVal = Temp_SubStr;
							//System.out.println("BASINC-6: " + Progress6BasincVal);
						}
					}						
					if(Temp_P.contains("A6>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_6+3,Temp_Index_7).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress7BasincVal = Temp_SubStr;
							//System.out.println("BASINC-7: " + Progress7BasincVal);
						}
					}						
					if(Temp_P.contains("A7>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_7+3,Temp_Index_8).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress8BasincVal = Temp_SubStr;
							//System.out.println("BASINC-8: " + Progress8BasincVal);
						}
					}						
					if(Temp_P.contains("A8>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_8+3,Temp_Index_9).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress9BasincVal = Temp_SubStr;
							//System.out.println("BASINC-9: " + Progress9BasincVal);
						}				
					}						
					if(Temp_P.contains("A9>")) 
					{
						String Temp_SubStr = Temp_P.substring(Temp_Index_9+3,Temp_P.length()).replace(" ", "");
						if(Temp_SubStr.length()>0)
						{
							Progress10BasincVal = Temp_SubStr;
							//System.out.println("BASINC-10: " + Progress10BasincVal);
						}				
					}
									
					PublicValues.kanal0_Result =  isStringNumeric(Progress1BasincVal) ? (double)Integer.valueOf(Progress1BasincVal)/60 : 0;
					PublicValues.kanal1_Result =  isStringNumeric(Progress2BasincVal) ? (double)Integer.valueOf(Progress2BasincVal)/60 : 0;
					PublicValues.kanal2_Result =  isStringNumeric(Progress3BasincVal) ? (double)Integer.valueOf(Progress3BasincVal)/60 : 0;
					PublicValues.kanal3_Result =  isStringNumeric(Progress4BasincVal) ? (double)Integer.valueOf(Progress4BasincVal)/60 : 0;
					PublicValues.kanal4_Result =  isStringNumeric(Progress5BasincVal) ? (double)Integer.valueOf(Progress5BasincVal)/60 : 0;
					PublicValues.kanal5_Result =  isStringNumeric(Progress6BasincVal) ? (double)Integer.valueOf(Progress6BasincVal)/60 : 0;
					PublicValues.kanal6_Result =  isStringNumeric(Progress7BasincVal) ? (double)Integer.valueOf(Progress7BasincVal)/60 : 0;
					PublicValues.kanal7_Result =  isStringNumeric(Progress8BasincVal) ? (double)Integer.valueOf(Progress8BasincVal)/60 : 0;
					PublicValues.kanal8_Result =  isStringNumeric(Progress9BasincVal) ? (double)Integer.valueOf(Progress9BasincVal)/60 : 0;
					PublicValues.kanal9_Result =  isStringNumeric(Progress10BasincVal) ? (double)Integer.valueOf(Progress10BasincVal)/60 : 0;					
										
					
					//PublicValues.MyLocker.unlock();
					
					//try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
					
					}			
				//else
				{
					//System.out.println("...  DEFAUKLT DEGER ... ");
					//PublicValues.BasincTotalValues = "A0>5A1>5A2>5A3>5A4>5A5>5A6>5A7>5A8>5A9>5";
				}									
			 }
			}
			catch (IllegalStateException ex)
			{
				
			}
			catch(Exception ex) 
			{
				//PublicValues.MyLocker.unlock();
				//String AA  = ex.getMessage();
				System.out.println("ERROR at P1-> \n"+ ex.toString());
				mylog.logYaz("ERROR at P1-> :\n"+ ex.toString());
			}
			
		}
	}; 
	
	
	public Thread hesapKanali ;
	@Override
	public void initialize(URL location, ResourceBundle resources) 
	{
		if(mylog == null)  mylog = new loglama();
		
		String GorselDosyaAdresi = new File(".").getAbsolutePath().replace(".","");
		//System.out.println("GORSEL DOSYALAR : " + GorselDosyaAdresi );
		mylog.logYaz("GORSEL DOSYALAR : " + GorselDosyaAdresi);
		
		String Str_hansgrohe_title = GorselDosyaAdresi + "hansgrohe_title.png";
		File file_hansgrohe_title = new File(Str_hansgrohe_title);
		PublicValues.image_hansgrohe_title = new Image(file_hansgrohe_title.toURI().toString());

		imgTitle.imageProperty().set(PublicValues.image_hansgrohe_title);
		boolean isIpFound = false ;		
				
		
		loglama mylog =new loglama();
		
		
		ExecutorService EkranGuncelleExecutor = Executors.newSingleThreadExecutor();
		EkranGuncelleExecutor.submit( new Runnable() {			
			@Override
			public void run() {
				while(true)
				{
				   try {Thread.sleep(100);} catch (InterruptedException e) {e.printStackTrace();}
				   
				   Platform.runLater(new Runnable() {@Override public void run() {progres1.progressProperty().setValue(PublicValues.kanal0_Result);}});
				   
				   Platform.runLater(new Runnable() {@Override public void run() {progres2.progressProperty().setValue(PublicValues.kanal1_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres3.progressProperty().setValue(PublicValues.kanal2_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres4.progressProperty().setValue(PublicValues.kanal3_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres5.progressProperty().setValue(PublicValues.kanal4_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres6.progressProperty().setValue(PublicValues.kanal5_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres7.progressProperty().setValue(PublicValues.kanal6_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres8.progressProperty().setValue(PublicValues.kanal7_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres9.progressProperty().setValue(PublicValues.kanal8_Result); }});
				   Platform.runLater(new Runnable() {@Override public void run() {progres10.progressProperty().setValue(PublicValues.kanal9_Result);}});			

				   Platform.runLater(new Runnable() {@Override public void run() {lblBar1.setText(PublicValues.kanal0_Result>0 ? String.valueOf(PublicValues.kanal0_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar2.setText(PublicValues.kanal1_Result>0 ? String.valueOf(PublicValues.kanal1_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar3.setText(PublicValues.kanal2_Result>0 ? String.valueOf(PublicValues.kanal2_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar4.setText(PublicValues.kanal3_Result>0 ? String.valueOf(PublicValues.kanal3_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar5.setText(PublicValues.kanal4_Result>0 ? String.valueOf(PublicValues.kanal4_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar6.setText(PublicValues.kanal5_Result>0 ? String.valueOf(PublicValues.kanal5_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar7.setText(PublicValues.kanal6_Result>0 ? String.valueOf(PublicValues.kanal6_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar8.setText(PublicValues.kanal7_Result>0 ? String.valueOf(PublicValues.kanal7_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar9.setText(PublicValues.kanal8_Result>0 ? String.valueOf(PublicValues.kanal8_Result): "0.0"); }});
				   Platform.runLater(new Runnable() {@Override public void run() {lblBar10.setText(PublicValues.kanal9_Result>0 ? String.valueOf(PublicValues.kanal9_Result): "0.0");}});
				}
				
			}
		});
				
				
		//Thread kanal0 = new Thread(DegerUret); kanal0.start();
		ExecutorService DegerUretExecutor = Executors.newSingleThreadExecutor();
		DegerUretExecutor.submit(DegerUret);											
		
		try {Thread.sleep(1000);} catch (InterruptedException e1) {e1.printStackTrace();}
		
		//Thread kanal1 = new Thread(DegerleriYaz); kanal1.start();			
		ExecutorService DegerYazExecutor = Executors.newSingleThreadExecutor();
		DegerYazExecutor.submit(DegerleriYaz);
		
		try {Thread.sleep(1000);} catch (InterruptedException e1) {e1.printStackTrace();}		
				
		//--------------------------------------------					
		 /* Slider1.valueProperty().addListener(new ChangeListener<Number>() {
	            @Override
	            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue)
	            {            	
	            	progres1.progressProperty().setValue(newValue.doubleValue());
	            }
	        });				 */
		//--------------------------------------------	
		
		// -----  IP elde etme blogu ---------------------------------------------------------------------				
		//lblHeader.setText( PublicValues.DeviceType + " : " + tempIP );
		//mylog.logYaz(PublicValues.DeviceType + " : " + tempIP + " started..");
		//------------------------------------------------------------------------------------------------				
		
		/*
		if(PublicValues.IsServer == true) // Server davranislar..
		{
			//System.out.println("SISTEM SERVER OLARAK BASLADI... OK.: ");			
			new Thread( ()-> {
				// burasi MultiThread icinde olmali----------------------------------
				try
				{
					ServerSocket myServerSoket = new ServerSocket(1001);
					
					Platform.runLater(() -> {
						//System.out.println("Master cihaz baslatildi. OK. ");
						//lstMesajlar.getItems().add("Master cihaz baslatildi. OK.");
					});
										
					while(true)
					{
						ClientNo++;
						Socket soket = myServerSoket.accept();						
						Platform.runLater(() -> {
							try {															
								String GelenClientIP = soket.getInetAddress().getHostAddress();
								//System.out.println( ClientNo + ". No'lu baglanti saglandi  : " + GelenClientIP );
								//lstMesajlar.getItems().add( ClientNo + ". No'lu baglanti saglandi  : " + GelenClientIP );								
								//String gelenveri = new DataInputStream(soket.getInputStream()).readUTF();
								//System.out.println( GelenClientIP + "==>>" + gelenveri);
								//lblBar.setText(gelenveri);																
								}
								catch (Exception ex) 
								{									
									//System.out.println("ERROR at MASTER-1  :\n"+ ex.toString());
									mylog.logYaz("ERROR at MASTER-1  :\n"+ ex.toString());
									try { myServerSoket.close();} catch (IOException e) {e.printStackTrace();}
								}
								});								 
						new Thread( new ThreadClient(soket)).start(); // her bir gelen Client icin yeni kanal yarat..						
					}									
				}
				catch(Exception ex)
				{
					//System.out.println("ERROR at MASTER-2  :\n"+ ex.toString());
					mylog.logYaz("ERROR at MASTER-2  :\n"+ ex.toString());
					//lstMesajlar.getItems().add("ERROR at MASTER initialize :\n"+ ex.toString());
				}
				//---------------------------------------------------------------------
			}).start(); 			
		}
		else  // Client davranislar..
		{
			
		}
		*/
		
	}	
	
	boolean isStringNumeric(String str)
	{
		try
		{
			double aa = Double.parseDouble(str);
		}
		catch(Exception ex)
		{
			return false;
		}
		return true;
	}
		
	class ThreadClient implements Runnable 
	{
		private Socket mySoket ;
		
		public ThreadClient(Socket _soket) {
			this.mySoket  = _soket;
		}
		
		@Override
		public void run() {
			try {
				//System.out.println("ThreadClient stage - 1");
				DataInputStream tempInputStrem = new DataInputStream(mySoket.getInputStream());
				DataOutputStream tempOutputStrem = new DataOutputStream(mySoket.getOutputStream());
				
				while(true)
				{
					//tempStr1 = ""; //isServer ? "I am Server: " : "I am Client: "; //tempStr clear islemi
					//tempStr1 +=  txtMsg.getText();  
					//txtMsg.clear();
					//System.out.println("ThreadClient stage - 2");
					String GelenVeri = tempInputStrem.readUTF().replace("\r", "").replace("\n", ""); //tempInputStrem.readByte();// .readUTF();					
					//System.out.println("ThreadClient GelenVeri : " + GelenVeri);
					//System.out.println("ThreadClient stage - 3");
					
					//System.out.println(mySoket.getInetAddress().getHostAddress() + " GelenVeri : "+ GelenVeri); //byteToHex(GelenVeri)					
					//tempOutputStrem.writeUTF( "OK. " +  mySoket.getInetAddress().getHostAddress() + " you said :" + GelenVeri); // tekrar stream uzerine yanit yaz..
					
					Platform.runLater(() -> {
						//System.out.println(mySoket.getInetAddress().getHostAddress() + " says : "+ GelenVeri); //byteToHex(GelenVeri)
						//lstMesajlar.getItems().add(mySoket.getInetAddress().getHostAddress() + " says : "+ byteToHex(GelenVeri));						
						// 
												
						String Progress1BasincVal = "";
						String Progress2BasincVal = "";
						String Progress3BasincVal = "";
						String Progress4BasincVal = "";
						String Progress5BasincVal = "";
						String Progress6BasincVal = "";
						String Progress7BasincVal = "";
						String Progress8BasincVal = "";
						String Progress9BasincVal = "";
						String Progress10BasincVal = "";	
						
						
						
						if(GelenVeri.contains("PWM"))
						{
							lblBar.setText(GelenVeri.substring(4,8));
						}
						
						//A6->1022
						//System.out.println("ThreadClient Temp : " + GelenVeri);						
						//P1->A0->0.00 A1->0.16 A2->0.40 A4->0.57   // Orjinal Format..
					
					});
				}				
			}
			catch(Exception ex) {
				System.out.println("ERROR at ThreadClient :\n"+ ex.toString());
				mylog.logYaz("ERROR at ThreadClient :\n"+ ex.toString());
				//lstMesajlar.getItems().add("ERROR at ThreadClient :\n"+ ex.toString());
			}			
		}

		private Number Double(String gelenVeri) {
			// TODO Auto-generated method stub
			return null;
		}		
	}
		
	
}
