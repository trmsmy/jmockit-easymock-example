package com.tamilramasamy.jmockit.test;

import mockit.Mock;
import mockit.MockUp;
import mockit.Mocked;
import mockit.NonStrictExpectations;

import org.junit.Before;
import org.junit.Test;

public class FileUtilsTest {

	@Mocked FileUtils utils ;
	
	@Before
	public void setUp() {
		
		new MockUp<FileUtils>() {
			
			@Mock
			public String readFile(String file) throws Exception {
				return "a dummy content";
			}
			
		};
		
	}
	
	@Test
	public void testReadFile() throws Exception {
		
//	    new NonStrictExpectations() {
//	    	{
//	    		utils.readFile("b-file.xml");
//	    		returns("its a dummy file content");
//	    	}
//	    };
		
		String fileContent = FileUtils.readFile("b-file.txt");
		
		System.out.println(fileContent);
		
	}
	
}
