package Lockersproject;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class OptionMenu {
	
	public void Operation() throws IOException {
		System.out.println("Select one from  Options Menu below");
        System.out.println("1 - Add A File ");
        System.out.println("2- Delete A file ");
        System.out.println("3- Search A file");
        System.out.println("4- Back to Main Menu");
       
       try { 
    	   System.out.print("Please Enter your Selection: ");
           
           Scanner menuInput = new Scanner(System.in);
           int selection = menuInput.nextInt();
           switch (selection) {
           case 1:FileOperations addfile = new FileOperations();
                  addfile.creation();
                  Operation();
                  break;
                  
           case 2:FileOperations delfile = new FileOperations();
                  delfile.delmethod();
                  Operation();
                  break;
           case 3:FileOperations searchfile = new FileOperations();
                  searchfile.search();
                  Operation();
                  break;
           case 4:MainMenu mainmenu = new MainMenu(); 
	              mainmenu.method1();
                  break;
           default:System.out.println("\nInvalid Input\n"+"Please Enter Valid Input");
                  Operation();
                   break;
                   
               }
       
                 }  catch (NoSuchElementException e) {
    	               System.out.println("Invalid Input \n");
    	               Operation();}
	        }
	    }
