package com.tamilramasamy.jmockit.test;

import java.io.File;
import java.io.FileReader;

public class FileUtils {

	public static String readFile(String fileName) throws Exception {
		
		File file = new File(fileName);
		FileReader fr = new FileReader(file);
		char[] array = new char[25];
		fr.read(array);
		//fis.read(array);
		
		String fileContent = new String(array);
		System.out.println(fileContent);
		
		fr.close();
		
		return fileContent;
	}
	
	public static void main(String[] args) throws Exception {
		
		readFile("a-file.txt");
	}
}
