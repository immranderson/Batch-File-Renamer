package com.immranderson.renamer;

import java.io.File;
import java.io.FileNotFoundException;

public class RecursiveDirectoryCrawler
	{

		static int i = 0;

		public static void CrawlGenerate(File topdirectory) throws FileNotFoundException
		{

			for (File file : topdirectory.listFiles())
			{
				
				if (file.isDirectory())
				{
					System.out.println(file.getAbsolutePath()); // prints out all directories
					CrawlGenerate(file);
				}	
				
					System.out.println(file.getAbsolutePath()); // prints out all files	
			}
		}
		
		public static void CrawlSearch(File topdirectory) {

			for (File file : topdirectory.listFiles())
			{
					System.out.println(file.getAbsolutePath()); // prints out all files

				if (file.isDirectory())
				{
					System.out.println(file.getAbsolutePath()); // prints out all directories
					CrawlSearch(file);
				}
			}

		}



		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub

			DirectoryOpener directoryOpener = new DirectoryOpener();
			File topdirectory = new File (directoryOpener.getName());
			CrawlGenerate(topdirectory);

		}

	}
