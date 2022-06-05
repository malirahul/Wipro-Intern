package io_Operation;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class IO_01 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file name");
		String fileName = sc.nextLine();
		System.out.println("Enter the character to be counted");
		char c = sc.nextLine().charAt(0);
		
		int count=0,j=0;
		FileInputStream fi = new FileInputStream(fileName);
		int i = 0;
		
		while((i=fi.read())!=-1) {
			if(i>=65 && i<=90)
				i+=32;
			if(c>=65 && c<=90)
				c+=32;

			if(i==c)
				count++;
		}

			System.out.println("File '"+ fileName+"' has "+ count+" instance of letter '"+c+"'.");
			System.out.println(j);
		
	}

}
