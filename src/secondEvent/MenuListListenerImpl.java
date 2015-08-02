/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondEvent;

/**
 *
 * @author BRIGHTER AGYEMANG
 */
public class MenuListListenerImpl implements MenuListListener{
    

    public void actionPerformed(ListEventObject e) {
        System.out.println(e.getMessage());
    }
    
}
