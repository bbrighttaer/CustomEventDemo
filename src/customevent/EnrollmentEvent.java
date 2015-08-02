/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package customevent;

/**
 *
 * @author AG BRIGHTER
 */
public class EnrollmentEvent extends java.util.EventObject
{
    private int numberOfStudents, enrollmentCap;//local properties

    public EnrollmentEvent(Object source, int numberOfStudents, int enrollmentCap)
    {
        super(source);
        this.enrollmentCap = enrollmentCap;
        this.numberOfStudents = numberOfStudents;
    }

    //accessor methods

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public int getEnrollmentCap()
    {
        return enrollmentCap;
    }
}
