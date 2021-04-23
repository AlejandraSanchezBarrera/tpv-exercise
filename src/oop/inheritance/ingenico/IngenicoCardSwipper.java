package oop.inheritance.ingenico;

import oop.inheritance.data.Card;
import oop.inheritance.data.EntryMode;
import oop.inheritance.data.ExpirationDate;

public class IngenicoCardSwipper{

    private static IngenicoCardSwipper uniqueInstance;

    private IngenicoCardSwipper(){

    }

    public static IngenicoCardSwipper getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new IngenicoCardSwipper();
        }
        return uniqueInstance;
    }

    public Card readCard(){
        return new Card("1246578514563698", new ExpirationDate(23,10), EntryMode.SWIPED);
    }
}
