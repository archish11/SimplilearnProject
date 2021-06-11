package Lockersproject;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class MainMenu {
	
	public void method1() throws IOException {
	System.out.println(" ~~ Welcome to Main Menu ~~ "); 
	System.out.println("Type 1 - Show files ");	 
	System.out.println("Type 2 - Show Options Menu ");	
	System.out.println("Type 3 - Exit");
	System.out.print("Please Enter your Choice : ");
	
    try {Scanner menuInput = new Scanner(System.in);
		int Input = menuInput.nextInt();
		
   switch (Input) {
		        case 1:
		        	 FileOperations filesList = new FileOperations();
		             filesList.viewFiles();
		             System.out.println("Back to main Menu.........");
		             method1();
		             break;
		        case 2:
		        	 OptionMenu option = new OptionMenu();
		             option.Operation();
		             break;
		        case 3:
		        	 System.out.println("Thank You!!! .GoodBye ");
		             break;
		        default: 
			         System.out.println("\nInvalid Input\n"+"Please Enter Valid Input");
			         method1();
		             break;
                     }
                     }catch (NoSuchElementException e ) {
		    	       System.out.println("Invalid Input \n");
		    	        method1();
 			       }catch (NullPointerException e)
                    { System.out.println("Empty Directory \n");
                      method1();
                      }
	                }
            }	
  

