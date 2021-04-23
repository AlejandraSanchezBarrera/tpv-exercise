package oop.inheritance.ingenico;

import java.util.Properties;

public class IngenicoStorageSystem {
    private static IngenicoStorageSystem uniqueInstance;

    private IngenicoStorageSystem(){

    }

    public static IngenicoStorageSystem getInstance(){
        if(uniqueInstance==null){
            uniqueInstance = new IngenicoStorageSystem();
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
