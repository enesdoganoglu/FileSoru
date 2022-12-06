package FileSoru;

import java.io.*;

public class FileExample {
	
	private static void dosyaYarat(File file) throws IOException {
	    
		if(!file.exists()) {
			file.createNewFile();
			 
	 }
		 
	  }
	private static void dosyayaYaz(File file) throws IOException {
    	String metin = "Merhaba dosya";
		FileWriter fWriter = new FileWriter(file);	
		BufferedWriter bWriter = new BufferedWriter(fWriter);
		bWriter.write(metin);
		bWriter.close();
	  }
	private static void dosyaOku(File file) throws IOException {
		 
		  FileReader fReader = new FileReader(file);
		  String line;
		  BufferedReader bReader = new BufferedReader(fReader);
		  
		  while ((line = bReader.readLine())!= null) {
			  
			  System.out.println(line);
			  
		  }
		  bReader.close();
		
		
	  }
	public static void main(String[] args) throws IOException {
		
		String yolu = "C:\\workspace\\deneme.txt";
		File file = new File(yolu);
		dosyaYarat(file);
		dosyayaYaz(file);
		dosyaOku(file);

	}

}
