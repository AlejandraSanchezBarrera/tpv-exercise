package oop.inheritance.verifone.v240m;

public class VerifoneV240mKeyboard {
    private static VerifoneV240mKeyboard uniqueInstance;

    private VerifoneV240mKeyboard(){

    }

    public static VerifoneV240mKeyboard getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneV240mKeyboard();
        }
        return uniqueInstance;
    }

    public String get(){
        return "Key pressed";
    }
}
