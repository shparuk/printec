package com.printec.file;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		File rootDir = new File(args[0]);
		if ( rootDir.isDirectory() ) {
			System.out.println("Base dir: " + args[0]);
			rootDir.listFiles(new FindCVSFilter());
		}
		else {
			System.out.println("Wrong Base dir: " + args[0]);
		}
	}
	
}
