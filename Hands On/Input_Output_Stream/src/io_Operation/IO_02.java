package io_Operation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class IO_02 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input file name");
		String inpFileName = sc.nextLine();
		System.out.println("Enter the output file name");
		String outFileName = sc.nextLine();
		
		FileInputStream fi = new FileInputStream(inpFileName);
		
		FileOutputStream fo = new FileOutputStream(outFileName);
		
		int i=0;
		while((i=fi.read())!=-1) {
			fo.write(i);
		}
		System.out.println("File is Copied");
		fi.close();
		fo.close();
		
		
	}

}
