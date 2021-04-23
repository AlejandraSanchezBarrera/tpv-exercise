package oop.inheritance.verifone.v240m;

import java.util.Properties;

public class VerifoneV240mStorageSystem {
    private static VerifoneV240mStorageSystem uniqueInstance;

    private VerifoneV240mStorageSystem(){

    }

    public static VerifoneV240mStorageSystem getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new VerifoneV240mStorageSystem();
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
