package application;

import java.io.File;

import javafx.scene.image.Image;

public class FileOperations {
	
	loglama mylog ;
	public FileOperations()
	{
		mylog = new loglama();
	}
	
	public void CheckConfigdFile()
	{
		
	}
	
	public void GenerateImageFiles()
	{
		if(mylog == null ) mylog  = new loglama(); 
		
		try
		{
		//-------------------------------------------------------------------------------------------------
		// Gorsel imajlar ---------------------------------------------------------------------------------
		String GorselDosyaAdresi = new File(".").getAbsolutePath().replace(".","");
		System.out.println("GORSEL DOSYALAR : " + GorselDosyaAdresi );
		mylog.logYaz("GORSEL DOSYALAR : " + GorselDosyaAdresi);
		
		
		String Str_hansgrohe_title = GorselDosyaAdresi + "hansgrohe_title.png";
		String Str_axor_title = GorselDosyaAdresi + "axor.png";
		String Str_1_1 = GorselDosyaAdresi + "1_1.png";
		String Str_1_2 = GorselDosyaAdresi + "1_2.png";
		String Str_1_3 = GorselDosyaAdresi + "1_3.png";
		String Str_1_4 = GorselDosyaAdresi + "1_4.png";
		String Str_2_1 = GorselDosyaAdresi + "2_1.png";
		String Str_2_2 = GorselDosyaAdresi + "2_2.png";
		String Str_2_3 = GorselDosyaAdresi + "2_3.png";
		
		String Str_3_1 = GorselDosyaAdresi + "3_1.png";
		String Str_3_2 = GorselDosyaAdresi + "3_2.png";
		String Str_3_3 = GorselDosyaAdresi + "3_3.png";
		String Str_3_4 = GorselDosyaAdresi + "3_4.png";
		String Str_3_5 = GorselDosyaAdresi + "3_5.png";
		String Str_3_6 = GorselDosyaAdresi + "3_6.png";
		
		String Str_4_1 = GorselDosyaAdresi + "4_1.png";
		String Str_4_2 = GorselDosyaAdresi + "4_2.png";
		String Str_4_3 = GorselDosyaAdresi + "4_3.png";
		
		String Str_5_1 = GorselDosyaAdresi + "5_1.png";
		String Str_5_2 = GorselDosyaAdresi + "5_2.png";
		String Str_5_3 = GorselDosyaAdresi + "5_3.png";
		String Str_5_4 = GorselDosyaAdresi + "5_4.png";
		
		String Str_6_1 = GorselDosyaAdresi + "6_1.png";
		String Str_6_2 = GorselDosyaAdresi + "6_2.png";
		
		String Str_7_1 = GorselDosyaAdresi + "7_1.png";
		String Str_7_2 = GorselDosyaAdresi + "7_2.png";
		String Str_7_3 = GorselDosyaAdresi + "7_3.png";
		String Str_7_4 = GorselDosyaAdresi + "7_4.png";
		String Str_7_5 = GorselDosyaAdresi + "7_5.png";
		
		String Str_8_1 = GorselDosyaAdresi + "8_1.png";
		String Str_8_2 = GorselDosyaAdresi + "8_2.png";
		String Str_8_3 = GorselDosyaAdresi + "8_3.png";
		String Str_8_4 = GorselDosyaAdresi + "8_4.png";
		
		String Str_9_1 = GorselDosyaAdresi + "9_1.png";
		String Str_9_2 = GorselDosyaAdresi + "9_2.png";
		
		String Str_10_1 = GorselDosyaAdresi + "10_1.png";
		String Str_10_2 = GorselDosyaAdresi + "10_2.png";
		String Str_10_3 = GorselDosyaAdresi + "10_3.png";
		String Str_10_4 = GorselDosyaAdresi + "10_4.png";
		String Str_10_5 = GorselDosyaAdresi + "10_5.png";
		
		String Str_11_1 = GorselDosyaAdresi + "11_1.png";
		String Str_11_2 = GorselDosyaAdresi + "11_2.png";
		String Str_11_3 = GorselDosyaAdresi + "11_3.png";
		                                       
		String Str_12_1 = GorselDosyaAdresi + "12_1.png";
		String Str_12_2 = GorselDosyaAdresi + "12_2.png";
		String Str_lamba = GorselDosyaAdresi + "lamba.png";		
		
		File file_hansgrohe_title = new File(Str_hansgrohe_title);
		File file_axor_title = new File(Str_axor_title);
		File file_1_1 = new File(Str_1_1);
		File file_1_2 = new File(Str_1_2);
		File file_1_3 = new File(Str_1_3);
		File file_1_4 = new File(Str_1_4);
		File file_2_1 = new File(Str_2_1);
		File file_2_2 = new File(Str_2_2);
		File file_2_3 = new File(Str_2_3);
		File file_3_1 = new File(Str_3_1);
		File file_3_2 = new File(Str_3_2);
		File file_3_3 = new File(Str_3_3);
		File file_3_4 = new File(Str_3_4);
		File file_3_5 = new File(Str_3_5);
		File file_3_6 = new File(Str_3_6);
		
		File file_4_1 = new File(Str_4_1);
		File file_4_2 = new File(Str_4_2);
		File file_4_3 = new File(Str_4_3);
		
		File file_5_1 = new File(Str_5_1);
		File file_5_2 = new File(Str_5_2);
		File file_5_3 = new File(Str_5_3);
		File file_5_4 = new File(Str_5_4);
		File file_6_1 = new File(Str_6_1);
		File file_6_2 = new File(Str_6_2);
		File file_7_1 = new File(Str_7_1);
		File file_7_2 = new File(Str_7_2);
		File file_7_3 = new File(Str_7_3);
		File file_7_4 = new File(Str_7_4);
		File file_7_5 = new File(Str_7_5);
		File file_8_1 = new File(Str_8_1);
		File file_8_2 = new File(Str_8_2);
		File file_8_3 = new File(Str_8_3);
		File file_8_4 = new File(Str_8_4);
		File file_9_1 = new File(Str_9_1);
		File file_9_2 = new File(Str_9_2);
		File file_10_1 = new File(Str_10_1);
		File file_10_2 = new File(Str_10_2);
		File file_10_3 = new File(Str_10_3);
		File file_10_4 = new File(Str_10_4);
		File file_10_5 = new File(Str_10_5);
		File file_11_1 = new File(Str_11_1);
		File file_11_2 = new File(Str_11_2);
		File file_11_3 = new File(Str_11_3);
		File file_12_1 = new File(Str_12_1);
		File file_12_2 = new File(Str_12_2);
		File file_lamba = new File(Str_lamba);	
		
		// GENERATE PUBLIC VALUES of IMAGES ... 
		PublicValues.image_hansgrohe_title = new Image(file_hansgrohe_title.toURI().toString());
		PublicValues.image_Axor_title = new Image(file_axor_title.toURI().toString());
		PublicValues.image_1_1 = new Image(file_1_1.toURI().toString());
		PublicValues.image_1_2 = new Image(file_1_2.toURI().toString());
		PublicValues.image_1_3 = new Image(file_1_3.toURI().toString());
		PublicValues.image_1_4 = new Image(file_1_4.toURI().toString());
		PublicValues.image_2_1 = new Image(file_2_1.toURI().toString());
		PublicValues.image_2_2 = new Image(file_2_2.toURI().toString());
		PublicValues.image_2_3 = new Image(file_2_3.toURI().toString());
		PublicValues.image_3_1 = new Image(file_3_1.toURI().toString());
		PublicValues.image_3_2 = new Image(file_3_2.toURI().toString());
		PublicValues.image_3_3 = new Image(file_3_3.toURI().toString());
		PublicValues.image_3_4 = new Image(file_3_4.toURI().toString());
		PublicValues.image_3_5 = new Image(file_3_5.toURI().toString());
		PublicValues.image_3_6 = new Image(file_3_6.toURI().toString());
		
		PublicValues.image_4_1 = new Image(file_4_1.toURI().toString());
		PublicValues.image_4_2 = new Image(file_4_2.toURI().toString());
		PublicValues.image_4_3 = new Image(file_4_3.toURI().toString());
		
		PublicValues.image_5_1 = new Image(file_5_1.toURI().toString());
		PublicValues.image_5_2 = new Image(file_5_2.toURI().toString());
		PublicValues.image_5_3 = new Image(file_5_3.toURI().toString());
		PublicValues.image_5_4 = new Image(file_5_4.toURI().toString());
		PublicValues.image_6_1 = new Image(file_6_1.toURI().toString());
		PublicValues.image_6_2 = new Image(file_6_2.toURI().toString());
		PublicValues.image_7_1 = new Image(file_7_1.toURI().toString());
		PublicValues.image_7_2 = new Image(file_7_2.toURI().toString());
		PublicValues.image_7_3 = new Image(file_7_3.toURI().toString());
		PublicValues.image_7_4 = new Image(file_7_4.toURI().toString());
		PublicValues.image_7_5 = new Image(file_7_5.toURI().toString());
		PublicValues.image_8_1 = new Image(file_8_1.toURI().toString());
		PublicValues.image_8_2 = new Image(file_8_2.toURI().toString());
		PublicValues.image_8_3 = new Image(file_8_3.toURI().toString());
		PublicValues.image_8_4 = new Image(file_8_4.toURI().toString());
		PublicValues.image_9_1 = new Image(file_9_1.toURI().toString());
		PublicValues.image_9_2 = new Image(file_9_2.toURI().toString());
		PublicValues.image_10_1 = new Image(file_10_1.toURI().toString());
		PublicValues.image_10_2 = new Image(file_10_2.toURI().toString());
		PublicValues.image_10_3 = new Image(file_10_3.toURI().toString());
		PublicValues.image_10_4 = new Image(file_10_4.toURI().toString());
		PublicValues.image_10_5 = new Image(file_10_5.toURI().toString());
		PublicValues.image_11_1 = new Image(file_11_1.toURI().toString());
		PublicValues.image_11_2 = new Image(file_11_2.toURI().toString());
		PublicValues.image_11_3 = new Image(file_11_3.toURI().toString());
		PublicValues.image_12_1 = new Image(file_12_1.toURI().toString());
		PublicValues.image_12_2 = new Image(file_12_2.toURI().toString());
		PublicValues.image_lamba = new Image(file_lamba.toURI().toString());	
		}
		catch (Exception ex) {
			System.out.println("ERROR at GenerateImageFiles : \n" + ex.getMessage());
			mylog.logYaz("ERROR at GenerateImageFiles : \n" + ex.getMessage());
		}
	}
}
