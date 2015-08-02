/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondEvent;

import java.util.Scanner;

/**
 *
 * @author BRIGHTER AGYEMANG
 */
public class RestaurantMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        FoodMenu foodMenu = new FoodMenu();
        MenuListListenerImpl menuListListenerImpl = new MenuListListenerImpl();
        foodMenu.addMenuListener(menuListListenerImpl);//first listener
        foodMenu.addMenuListener(new MenuListListener() {//second listener

            public void actionPerformed(ListEventObject e) {
               System.out.println("from second listener"+e.getMessage());
            }
        });
        foodMenu.setSizeOfMenu(10);
        
        Scanner s = new Scanner(System.in);
        System.out.println("continue?");
        int count =0;
        while(true)
        {
            //System.out.println("enter food");
            foodMenu.addFood("food");
            System.out.println(count++);
            //System.out.println("continue?");
        }
    }
    
}
