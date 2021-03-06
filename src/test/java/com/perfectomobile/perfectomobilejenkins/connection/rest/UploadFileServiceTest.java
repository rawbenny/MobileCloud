package com.perfectomobile.perfectomobilejenkins.connection.rest;

import hudson.FilePath;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;

import org.apache.http.HttpResponse;
import org.junit.Test;

import com.perfectomobile.perfectomobilejenkins.connection.http.HttpServices;

public class UploadFileServiceTest {

	@Test
	public void testuploadFile() throws FileNotFoundException, ParseException{
		
		HttpResponse perfectoResponse = null;
		FilePath fileName = new FilePath(new File("src/test/resources/photo.JPG"));
		
		try {
			perfectoResponse = HttpServices.getInstance().uploadFile(
					"https://www.perfectomobile.com", 
					"jenkins@perfectomobile.com",
					"Perfecto1",
					"media", 
					"PRIVATE:/pictures/pic22.png",
					fileName);
		} catch (Exception e) {
			e.printStackTrace(System.out);
		}
	}
}
