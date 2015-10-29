package com.printec.file;

import java.io.File;
import java.io.FileFilter;

public class DeleteContentFilter implements FileFilter {

	@Override
	public boolean accept(File src) {
		if ( src.isDirectory() )
			src.listFiles(new DeleteContentFilter());
		else
			src.delete();
		return false;
	}
}
