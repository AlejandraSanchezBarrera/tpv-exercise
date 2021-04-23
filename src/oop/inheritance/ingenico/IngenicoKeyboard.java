package oop.inheritance.ingenico;

public class IngenicoKeyboard {
    private static IngenicoKeyboard uniqueInstance;

    private IngenicoKeyboard(){

    }

    public static IngenicoKeyboard getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new IngenicoKeyboard();
        }
        return uniqueInstance;
    }

    /**
     * @return key pressed
     */
    public String get() {
        return "Key pressed";
    }
}
