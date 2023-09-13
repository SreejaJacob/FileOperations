package com.demo;

import java.io.File;
import java.util.*;

public class Runner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file path");
		String filePath = sc.next();
		File file = new File(filePath);
		if (file.exists()) {
			if (file.isDirectory()) {
				System.out.println("It's a Directory");
			} else {
				System.out.println("File Path " + file.getName());
				System.out.println("File Size " + file.length() + " bytes");
				int index = file.getName().indexOf(".");
				String split = file.getName().substring(index + 1);
				System.out.println("File Type " + split);
			}
		} else {
			System.out.println("File doesn't exist");
		}
		sc.close();
	}
}
