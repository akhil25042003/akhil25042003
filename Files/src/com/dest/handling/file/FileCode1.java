package com.dest.handling.file;

import java.io.FileInputStream;
import java.io.IOException;

public class FileCode1 {
	public static void main(String[] args) throws IOException {
		String path1 = "C:\\IOProgrmas\\Input.txt";
		String path2 = "C:\\IOProgmas\\Output.txt";
		FileInputStream fis = new FileInputStream(path1);
		int temp;
		FileInputStream fos = new FileInputStream(path2);
		
		while((temp=fis.read())!=0){
			fos.write(temp);
			
		}
		fos.close();
		fis.close();
	}

}
