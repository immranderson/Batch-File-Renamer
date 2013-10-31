package com.immranderson.renamer;

import java.io.File;
import java.io.FileNotFoundException;

public class RecursiveDirectoryCrawler
	{

		public static void RecursivelyRename(File topdirectory, String fromText, String toText) throws FileNotFoundException
		{

			for (File file : topdirectory.listFiles())
			{
				
				if (file.isDirectory())
				{
					System.out.println(file.getAbsolutePath()); // prints out all directories
					rename(file, fromText, toText);
					RecursivelyRename(file, fromText, toText);
				}					
					System.out.println(file.getAbsolutePath()); // prints out all files	
					rename(file, fromText, toText);
			}
		}

		public static void rename(File file, String fromText, String toText) {			
			File renamedFile = new File(file.getAbsolutePath().replace(fromText, toText));			
			
			if (file.renameTo(renamedFile)) {
				System.out.println("Rename Success");
			} else {
				System.out.println("Rename Failure");
			}
		}

		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub

			DirectoryOpener directoryOpener = new DirectoryOpener();
			File topdirectory = new File (directoryOpener.getName());
			RecursivelyRename(topdirectory, "Tom", "Nan");

		}

	}
