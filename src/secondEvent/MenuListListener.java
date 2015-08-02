/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondEvent;

import java.util.EventListener;

/**
 *
 * @author BRIGHTER AGYEMANG
 */
public interface MenuListListener extends EventListener {
    
    public void actionPerformed(ListEventObject e);
}
