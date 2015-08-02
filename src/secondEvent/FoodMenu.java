/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondEvent;

import java.util.ArrayList;

/**
 *
 * @author BRIGHTER AGYEMANG
 */
public class FoodMenu 
{
    private ArrayList<String> foodList;
    private ArrayList<MenuListListener> menuListeners;
    private int sizeOfMenu;

    public FoodMenu(ArrayList<String> foodList, ArrayList<MenuListListener> menuListeners) {
        this.foodList = foodList;
        this.menuListeners = menuListeners;
    }

    public FoodMenu() {
        foodList = new ArrayList<String>();
        menuListeners = new ArrayList<MenuListListener>();
    }

    public ArrayList<String> getFoodList() {
        return foodList;
    }

    public void setFoodList(ArrayList<String> foodList) {
        this.foodList = foodList;
    }

    public ArrayList<MenuListListener> getMenuListeners() {
        return menuListeners;
    }

    public void setMenuListeners(ArrayList<MenuListListener> menuListeners) {
        this.menuListeners = menuListeners;
    }

    public int getSizeOfMenu() {
        return sizeOfMenu;
    }

    public void setSizeOfMenu(int sizeOfMenu) {
        this.sizeOfMenu = sizeOfMenu;
    }       
    
    public void addMenuListener(MenuListListener listener)
    {
        if(listener != null)
        {
            this.menuListeners.add(listener);
        }
    }
    
    public void addFood(String food)
    {
        if(food != null)
        {
            if(this.foodList == null)
            {
                this.foodList = new ArrayList<String>();
            }
            if(this.foodList.size() == this.sizeOfMenu )
            {
                for(MenuListListener listener : this.menuListeners)
                {
                    listener.actionPerformed(new ListEventObject(this, "Menu capacity reached"));
                }
            }
            else
                this.foodList.add(food);
        }
    }
}
