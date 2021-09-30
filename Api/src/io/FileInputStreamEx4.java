package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStreamEx4 {

	private static byte[] datas;

	public static void main(String[] args) {
		//Rolling 읽은 후 다른 파일로 저장
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("c:\\temp\\Rolling.mp3");
			fos = new FileOutputStream("c:\\temp\\Rolling_copy.mp3");
			
			byte[] datas= new byte[10000];
			while (fis.read()!=-1) {
				fos.write(datas);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				fos.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				                     
			}
		}
		
		
		
		
		
	}

}
