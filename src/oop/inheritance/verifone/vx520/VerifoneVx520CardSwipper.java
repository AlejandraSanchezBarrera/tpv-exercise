package oop.inheritance.verifone.vx520;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;
import oop.inheritance.verifone.v240m.VerifoneV240mChipReader;

public class VerifoneVx520CardSwipper {
    private static VerifoneVx520CardSwipper uniqueInstance;

    private VerifoneVx520CardSwipper(){

    }

    public static VerifoneVx520CardSwipper getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneVx520CardSwipper();
        }
        return uniqueInstance;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
