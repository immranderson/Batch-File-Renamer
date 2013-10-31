package com.immranderson.renamer;

import java.io.File;

public class RenameFile
	{

		public static void rename(File file, String fromText, String toText) {			
			File renamedFile = new File(file.getAbsolutePath().replace(fromText, toText));			
			
			if (file.renameTo(renamedFile)) {
				System.out.println("Rename Success");
			} else {
				System.out.println("Rename Failure");
			}
		}
		
		public static void main(String[] args)
			{
				// TODO Auto-generated method stub
				
				File file = new File("C:\\GitHub\\Batch-File-Renamer\\Test\\Nan.txt");
				
				rename(file, "Nan", "Tom");
				
			}

	}
