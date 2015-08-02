/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customevent;

/**
 *
 * @author BRIGHTER AGYEMANG
 */
//implementation of the listener interface EnrollmentListener
public class EnrollmentListenerImpl implements EnrollmentListener
{
    public void enrollmentExceeded(EnrollmentEvent e)
    {
        System.out.println("Enrollment number reached");
    }
}