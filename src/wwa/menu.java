package wwa;

import java.util.*;
import java.util.Scanner;
import java.io.*;


public class menu {
  OperationExecutor operationExecutor  = new OperationExecutor();
  
  

  public static void main(String[] args) throws IOException {
    
    Scanner keyboard = new Scanner(System.in);

    System.out.println(
        " ###################\n#                   #\n# World War of Ants #\n#                   # \n ###################  \n ");

    System.out.println(" _________\n 1) Start \n _________\n 2) Load\n _________\n 3) Exit \n _________\n\n");
    int text;//
    
    
      try 
      
      {
      text = Integer.parseInt(keyboard.next());
        
    } catch (NumberFormatException e) {
          System.out.println("Wrong input!");
          text = 0;
    }
      //hier musste der finally block weg sonst w�hre immer 0 rausgekommen
      
      
      switch (text) {

        case 1:
          OperationExecutor.executeOperation(new StartGame());
          break;
        
        case 2:
          OperationExecutor.executeOperation(new LoadGame());
          break;
        
        case 3:
          OperationExecutor.executeOperation(new ExitGame());
          break;
          default:
        	  //ich hab mal noch nen default reingemacht 
        	  System.out.println("Input error!");
    } // end of switch
      

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

  } // end of static void main

} // end of wwa
