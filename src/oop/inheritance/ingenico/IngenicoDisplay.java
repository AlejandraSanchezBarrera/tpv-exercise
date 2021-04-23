package oop.inheritance.ingenico;

import oop.inheritance.core.TPVDisplay;

public class IngenicoDisplay implements TPVDisplay {

    private static IngenicoDisplay uniqueInstance;

    private boolean lightTurnedOn;

    private IngenicoDisplay(){

    }

    public static IngenicoDisplay getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new IngenicoDisplay();
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

    /**
     * Clears the screen
     */
    public void clear() {

    }

    @Override
    public void toggleLight() {
        lightTurnedOn=!lightTurnedOn;
    }

}
