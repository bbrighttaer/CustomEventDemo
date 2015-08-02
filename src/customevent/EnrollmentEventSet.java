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
public class EnrollmentEventSet 
{
    //array for containing all registered listeners
    ArrayList<EnrollmentListener> enrollmentListener;

    //variables for the enrollment
    ArrayList<String> students = new ArrayList();
    String message = "";
    int enrollmentCap = 10;

    public EnrollmentEventSet(String message)
    {
        this.message = message;
    }

    //method for setting the enrollment number
    public void setEnrollmentCap(int enrollmentCap)
    {
        this.enrollmentCap = enrollmentCap;
    }

    //accessor method for enrollment cap
    public int getEnrollmentCap()
    {
        return this.enrollmentCap;
    }

    //method for adding students
    public void addStudent(String student)
    {
        this.students.add(student);

        //condition for checking whether the enrollment cap has been reached
        if(this.students.size() == this.enrollmentCap)
        {
            this.students.remove(student);
            processEvent(new EnrollmentEvent(this, students.size(),getEnrollmentCap()));
        }
    }
    //method for registering the listener
    public synchronized void addEnrollmentListener(EnrollmentListener listener)
    {
        //checks whether the listener array has already been created
        if(enrollmentListener == null)
        {
            enrollmentListener = new ArrayList(2);
        }
        
        /*checks to see whether the listener has already been added to avoid
         * duplicate entries               
        */
        if(listener != null && !enrollmentListener.contains(listener))
        {
            enrollmentListener.add(listener);
        }
    }

    //method for removing the listener from the array
    public synchronized void removeEnrollmentListener(EnrollmentListener listener)
    {
        if(enrollmentListener != null && enrollmentListener.contains(listener))
            enrollmentListener.remove(listener);
    }

    //method for processing the event
    public void processEvent(EnrollmentEvent e)
    {
        ArrayList<EnrollmentListener> list;

        synchronized (this)
        {
            if(enrollmentListener == null)
                return;
            list = (ArrayList)enrollmentListener.clone();//creates a copy of the listener array
        }

        //a for each loop to treat every array item as a listener object
        for(EnrollmentListener enroll: list)
        {
            EnrollmentListener listener = enroll;
            listener.enrollmentExceeded(e);
        }
    }
}
