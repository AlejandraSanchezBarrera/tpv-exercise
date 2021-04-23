package oop.inheritance.verifone.vx690;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.verifone.vx520.VerifoneVx520CardSwipper;

public class VerifoneVx690CardSwipper {
    private static VerifoneVx690CardSwipper uniqueInstance;

    private VerifoneVx690CardSwipper(){

    }

    public static VerifoneVx690CardSwipper getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneVx690CardSwipper();
        }
        return uniqueInstance;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
