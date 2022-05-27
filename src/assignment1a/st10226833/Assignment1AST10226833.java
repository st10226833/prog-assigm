/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1a.st10226833;


import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 * 
 * @author ST10226833 - Tshegofatso Manok
 */
public class Assignment1AST10226833 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {  
        String Task_Status;
        Scanner code = new Scanner(System.in);
        
        Login credentials = new Login();
        boolean PasscodeSuccess =false;
        
         String FirstName ;
        System.out.println("Please enter your first name");
        FirstName =  code.nextLine();
        String lastname;
        System.out.println("Please enter your last name");
        lastname = code.nextLine();
        String username;
        System.out.println("please create your username");
        username = code.nextLine();
        int country;
        for(country =0;country <username.length();country++){
        if (username.length() <=5 && username.charAt(country) == '_' )
        {System.out.println("username successfully captured");
        
        boolean usernamesuccess = true;
        }else{System.out.println("Username must be no more than 5 characters and must include an underscore");
        }}
        code.nextLine();
        String Passcode;
        System.out.println("please enter your password");
         Passcode = code.nextLine();
         boolean Passcode_Success =false;
         credentials.checkPasswordComplexity(Passcode, Passcode_Success);
        
        if(PasscodeSuccess == true){System.out.println("please confirm your password");
            String PCode = code.next();
            if(Passcode.compareTo(PCode)==0){
            System.out.println("Password capture was successful");
        }}
       
        System.out.println("account succesfully created");
        //user must enter details to access the content in the account
        
        System.out.println("Enter username ");
        code.next();
        String  username1= code.next();
        System.out.println("enter password");
        code.next();
        String  password = code.next();
 if (username1.compareTo(username)==0 && password.compareTo(Passcode)==0)
 {System.out.println("LOGIN Successful");
       JOptionPane.showMessageDialog(null,"Welcome to EasyKanban");
      
        int a = 0;
        int b = 1;
        int c = 2;
        System.out.println("would you like to (0)= Add tasks or "
                + "(1) =Show report or (2) = "
                + "Quit?\n CHOOSE A NUMBER FOR"
                + " YOUR RESPONSE ");
        int response =code.nextInt();
        if(response != a && response != b && response != c){
            System.out.println("would you like to (0)= Add tasks or "
                + "(1) =Show report or (2) = "
                + "Quit?\n CHOOSE A NUMBER FOR"
                + " YOUR RESPONSE ");
        
                                                               } 
        if(response == a)
        { 
            System.out.println("how many tasks would you like to enter");
            int NumberOfTask = code.nextInt();
            for(int e = 0; e < NumberOfTask ;e++)
            {
            System.out.println("Please enter task name ");
            String Task_Name = code.next();
            System.out.println("Please enter task number ");
            int TaskNumber =  code.nextInt();
            System.out.println("Please enter task description");
            code.nextLine();
            String TASK_DESCRIPTION = code.nextLine(); 
            
            System.out.println("Please enter developer name");
            String DeveloperDetails;
            DeveloperDetails = code.next();
            System.out.println("Please enter developer surname");
            String DeveloperDetails2 = code.next();
            
            System.out.println("Please enter estimated task duration");
            int TaskDuR = code.nextInt();
            
            String TaskID;
             
           
            //System.out.println(TaskID);
            System.out.println("Please enter Task Status options are : \nTo Do or \nDone or \nDoing ");
            code.next();
            Task_Status = code.next();
            
            if (Task_Status.compareTo("To Do") == 0 
                    || Task_Status.compareTo("Done") == 0 || Task_Status.compareTo("Doing")==0)
            {
                System.out.println("Task Status :" + Task_Status);
            }
            else{System.out.println("incorrect value entered");
                }
            }
         }
         
        if( response == b)
        {JOptionPane.showMessageDialog(null,"COMING SOON");
        
        }
        if( response == c)
        {
            System.out.println("Good Bye");
        }
   
 }
            
    
    } 
                                      }
        
        
        
        

    
    

         
