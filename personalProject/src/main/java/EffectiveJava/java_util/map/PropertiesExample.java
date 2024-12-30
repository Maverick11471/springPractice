package EffectiveJava.java_util.map;

import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
    public static void main(String[] args) throws Exception {
        try {
            Properties properties = new Properties();

            properties.load(PropertiesExample.class.getResourceAsStream("database.properties"));

            String username = properties.getProperty("username");
            System.out.println(username);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
