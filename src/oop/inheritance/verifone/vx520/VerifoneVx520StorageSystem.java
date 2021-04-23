package oop.inheritance.verifone.vx520;

import java.util.Properties;

public class VerifoneVx520StorageSystem {
    private static VerifoneVx520StorageSystem uniqueInstance;

    private VerifoneVx520StorageSystem(){

    }

    public static VerifoneVx520StorageSystem getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneVx520StorageSystem();
        }
        return uniqueInstance;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
