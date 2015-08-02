/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package customevent;

import java.util.*;

/**
 *
 * @author AG BRIGHTER
 */
public class CustomEventHandling
{

    /**
     * @param args the command line arguments
     */
    
    public CustomEventHandling()
    {
        EnrollmentEventSet customEvent = new EnrollmentEventSet("THIS IS BRYTHA'S CUSTOM EVENT SET");
        EnrollmentListener listener = new EnrollmentListenerImpl();        
        customEvent.addEnrollmentListener(listener);//registers the Enroll_listener listener object

        int cap_limit =1;
        String student;
        boolean error = false;
        
        //instanctiates the Scanner class
        Scanner input = new Scanner(System.in);

        //input validation
        try
        {
            cap_limit = set_cap_limit();
        }
        catch(InputMismatchException ex)
        {
            System.out.println("Enter an integer, please.");
            error = true;
            
            //gives the user another opportunity to key in the correct input
            do
            {
                try
                {
                    cap_limit = set_cap_limit();
                    error = false;
                }
                catch(InputMismatchException inner)
                {
                    System.out.println("Enter an integer, please.");
                    error = true;
                }
            }while(error);
        }

        customEvent.setEnrollmentCap(cap_limit);

        //getting student names
        System.out.println("Enter the names, ENTER 'Q' OR 'q' when finished");
        do
        {
            student = input.next();
            customEvent.addStudent(student);
        }while( student != "q" || student != "Q");
    }
    
    public static void main(String[] args) 
    {
         new CustomEventHandling();//calls the constructor of this class
    }
    
    //methodfor getting the enrollment limit
    public static int set_cap_limit()
    {
        int cap_limit;

        //instanctiates the Scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the enrollment limit");
        cap_limit = input.nextInt();

        return cap_limit;
    }    
    
}