package com.printec.file;

import java.io.File;
import java.io.FileFilter;

public class FindCVSFilter implements FileFilter {

	@Override
	public boolean accept(File src) {
		if ( src.isDirectory() ) {
			if ( src.getName().equalsIgnoreCase("CVS") ) {
				System.out.println("CVS dir: " + src.getAbsolutePath());
//				src.listFiles(new DeleteContentFilter());
//				src.delete();
			}
			else {
				src.listFiles(new FindCVSFilter());
			}
		}
		else {
			String filename = src.getName(); 
			if ( filename.length() > 2 && filename.substring(0, 2).equals(".#") ) {
				System.out.println("CVS file: " + src.getAbsolutePath());
//				src.delete();
			}
		}
		return false;
	}

}
