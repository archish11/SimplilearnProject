package Lockersproject;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperations {
	
	public static void creation() throws IOException {
			System.out.println("Enter the File Name you want to ADD:\n");
		    Scanner fileInput = new Scanner(System.in);
		    String fileName = fileInput.next();
		    File myfile = new File(WelcomeScreen.path,fileName);
		    if (myfile.createNewFile())
			{System.out.println("File " + myfile.getName() +" Created Successfully\n");}
			else {System.out.println("File Already Exists");
		          creation();}
		    }
	
	public static void delmethod() throws IOException  {
		    System.out.println("Enter the File Name you want to DELETE:\n");
		    Scanner fileInput = new Scanner(System.in);
		    String fileName = fileInput.next();
		    File myfile = new File(WelcomeScreen.path,fileName);
			if (myfile.delete())
			{System.out.println("File "+ myfile.getName() + " deleted Successfully\n");}
			else {System.out.println("File Does not exist");
				  delmethod();}
	           }
	
	public static void viewFiles() throws IOException {
	       //function to return file names in ascending order
		
		 File dir = new File(WelcomeScreen.path);
	       File[] files = dir.listFiles();
	       Arrays.sort(files);
	       for(File f:files) 
	    	    System.out.println(f.getName());
	    	   }
	       
	     
	   
           
	
	public static void search() throws IOException {
		
		System.out.println("Enter the File Name you want to Search:\n");
	    Scanner fileInput = new Scanner(System.in); 
		String fileName = fileInput.next();
		 File myfile = new File(WelcomeScreen.path,fileName);
			if (myfile.exists())
			      {System.out.println("File "+ myfile.getName() + " found Succesfully\n");}
			else 
				{System.out.println("File Not Found");
				search();}
	            }
	         }

		         
			 
			
      


