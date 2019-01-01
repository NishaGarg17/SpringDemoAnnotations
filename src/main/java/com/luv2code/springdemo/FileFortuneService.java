package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService{
	//Initialize Array List
	ArrayList<String> theFortunes = new ArrayList<String>();
	Random random = new Random();
	
	public FileFortuneService() throws IOException {
		
		
		File file = new File("E:\\Data\\Spring\\Sts-Project-Resource\\fortune-data.txt");
		
		System.out.println("Reading fortunes from file: " + file);
		System.out.println("File exists: " + file.exists());
		
		try {
			String tempLine;
			BufferedReader br = new BufferedReader(new FileReader(file));
			while((tempLine = br.readLine()) != null) {
				theFortunes.add(tempLine);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Not Able to Load requested file: " + e.getMessage());
		}
	}
	public String getFortune() {
		
		int index = random.nextInt(theFortunes.size());
		return theFortunes.get(index);
	}
	
}
