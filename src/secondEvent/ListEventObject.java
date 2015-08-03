/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondEvent;

import java.util.EventObject;

/**
 *
 * @author BRIGHTER AGYEMANG
 */
public class ListEventObject extends EventObject
{
    private String message;
    public ListEventObject(Object source, String message) {
        super(source);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
