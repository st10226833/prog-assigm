/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author u
 */
public class TASK {
    String[] Task_Name;
    int [] task_Duration;
    String[] DeveloperDetails;
    int Task_Number;
    String[] TaskID;
    String[] Task ;
    
         
    public static boolean checkTaskDescription(String TASK_DESCRIPTION)
    {  

          if (TASK_DESCRIPTION.length()<= 50  )
        { 
        return true;
                
        }else{ return false;
             }
          }
    public static String createTaskID(String TaskID, String Task_Name,int TaskNumber,String DeveloperDetails)
    { 
      
        TaskID = Task_Name.substring(0, 2) + ":" + TaskNumber + ":"
                + DeveloperDetails.substring(DeveloperDetails.length() - 3);
        return TaskID;
    }
    public static String printTaskDetails()
    {
        return "";
    }
    public static int returnTotalHours(int totaltasks)
    {int totalhours = 0;
    for (int a =0;a < totaltasks ; a++){
        totalhours = totalhours + task_Duration[a];}
        return totalhours ;
    }
}
