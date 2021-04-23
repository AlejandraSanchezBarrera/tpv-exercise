package oop.inheritance.verifone.vx520;

import oop.inheritance.core.TPVDisplay;
import oop.inheritance.ingenico.IngenicoDisplay;

public class VerifoneVx520Display implements TPVDisplay {

    public static VerifoneVx520Display uniqueInstance;

    private boolean lightTurnedOn;

    private VerifoneVx520Display(){

    }

    public static VerifoneVx520Display getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneVx520Display();
        }
        return uniqueInstance;
    }
    /**
     * Prints a message to specied position
     *
     * @param x       horizontal position
     * @param y       vertical position
     * @param message message to be printed
     */
    public void showMessage(int x, int y, String message) {
        System.out.println(message);
    }

    @Override
    public void toggleLight() {
        lightTurnedOn=!lightTurnedOn;
    }

    /**
     * Clears the screen
     */
    public void clear() {

    }
}
