package oop.inheritance.verifone.vx690;

public class VerifoneVx690Keyboard {
    private static VerifoneVx690Keyboard uniqueInstance;

    private VerifoneVx690Keyboard(){

    }

    public static VerifoneVx690Keyboard getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneVx690Keyboard();
        }
        return uniqueInstance;
    }

    public String get(){
        return "Key pressed";
    }
}
