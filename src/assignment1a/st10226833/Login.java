/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1a.st10226833;
import java.util.Scanner;
/**
 *
 * @author u
 */
public class Login 
{ Scanner code = new Scanner(System.in);
     public  String registerUser(String FirstName, String lastname,String username,String passcode)
  {     
        System.out.println("Please enter your first name");
        FirstName = code.nextLine();
        
        System.out.println("Please enter your last name");
        lastname = code.nextLine();
        
        System.out.println("please create your username");
        username = code.nextLine();
        
        System.out.println("please enter your password");
         passcode = code.nextLine();
      
  }
     public boolean checkPasswordComplexity(String Passcode,boolean Passcode_Success)
   { 
    Scanner code = new Scanner(System.in);
       System.out.println("please enter your password");
       String PCode = code.next();
       boolean PasscodeSuccess = false;
       boolean terms1;
       terms1 = false;
       boolean terms2;
       
       terms2 = false;
       boolean terms3;
       terms3 = false;
       boolean terms4;
       terms4 = false;
       
       if ( Passcode.length() >= 8 )
       {
           terms1 = true;
       }
       
       char[] alphabets = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q'
               ,'R','S','T','U','V','W','X','Y','Z'};
       for(int a =0; a <Passcode.length();a++)
       {
           for(int b =0; b < 26; b++)
           {
       if(Passcode.charAt(a) == alphabets[b])
       {
         terms2 = true;
         b =28;
       a =Passcode.length()+2;
       }
      }
    }
        char [] numbers = {'0','1','2','3','4','5','6','7','8','9'};
           for (int a =0; a < Passcode.length(); a++)
           {
               for(int b = 0; b < 10; b++)
                {
                  if( Passcode.charAt(a) == numbers[b] )
                        {
                            terms3 = true;
                        }
                }
           }
         char[] SpecialChar = {'!','@','#','$','%','.',',','+','-','_','%','^','&','*','(',')','{','}','|','?','<','>','/',};
               for (int a =0; a <Passcode.length(); a++)
               {
                   for(int b =0 ; b < 23 ; b++)
                      {
                        if(Passcode.charAt(a) == SpecialChar[b])
                          {
                              terms4 = true;
                          }
                      }
               }
              
              if(terms1==true && terms2 == true && terms3 ==true && terms4==true)
              {
                   Passcode_Success =true;
                   System.out.println("Password succesfully captured");
               }
              else
              {
                  System.out.println("password is incorrect \npassword must have a special character, number ,must have atleast\n one uppercase letter and at least be 8 characters long");
              }
              return PasscodeSuccess;
               
               }
            
  
   
   public boolean checkUserName(String username,String firstName, String lastName,boolean usernamesuccess){
       
       usernamesuccess = false;
       
       System.out.println("please enter username"); 
       username = code.nextLine();
       if (username.length() <=5 && username.charAt(4) == '_' )
       {System.out.println(" Username succesfully created" );
       usernamesuccess = true;
       }
        else{System.out.println("Username is not valid ,username must end with an underscore");
       
            }return usernamesuccess;
                    
   
    
  }
  public boolean loginUser(String username1,String username,String password,String Passcode)
  { username1= code.next();
    password = code.next();
      if (username1.compareTo(username)==0 && password.compareTo(Passcode)==0)
  {
      System.out.println("welcome to the platform");
  }else{System.out.println("ERROR, \nplease make sure the password and username you entered are correct");
  }
      
  
  }
  public boolean returnloginStatus(boolean usernamesuccess,boolean PasscodeSuccess)
  {if(usernamesuccess == true && PasscodeSuccess == true)
      {
          System.out.println("You have successfully logged in");
      }
      else{
          System.out.println("please type the correct username and password");
          
  }
  }
  }
  

