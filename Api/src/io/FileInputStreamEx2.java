package io;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx2 {

	private static FileInputStream fis;
	private static FileOutputStream fos;

	public static void main(String[] args) throws IOException {
		
//		try {
//			fis = new FileInputStream(new File("c:\\temp\\file1.txt"));
//			fos = new FileOutputStream("c:\\temp\\test1.txt");
//			
//			byte datas[]=new byte[100];
//			while (fis.read(datas)!=-1) {
//				fos.write(datas);
//			}
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				fis.close();
//				fos.close();
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
		
		try(FileInputStream fis=new FileInputStream(new File("c:\\temp\\file1.txt"));
			FileOutputStream fos=FileOutputStream("c:\\temp\\test1.txt")) {
			
			byte datas[]=new byte[100];
			while (fis.read(datas)!=-1) {
				fos.write(datas);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
	}

}
