package number.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inputFile = new File("/home/keerthi/Documents/linux.jpg");
		File outputFile = new File("/home/keerthi/Documents/linux2.jpg");

			FileInputStream fis = new FileInputStream(inputFile);
			FileOutputStream fos = new FileOutputStream(outputFile);
			int r = fis.read(); 
			while(r!=-1)
			{
				fos.write(r); 
				r = fis.read();
				
			}
			fos.flush();
			fos.close(); 
	}
	
}


