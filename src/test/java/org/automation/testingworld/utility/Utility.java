package org.automation.testingworld.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Utility {
    public static Object fetchProperty(String key) throws IOException {
        FileInputStream file = new FileInputStream("./Config/config.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key);

    }

    public static String fetchLocatorValue(String key) throws IOException {
        FileInputStream file = new FileInputStream("./Config/Elements.properties");
        Properties property = new Properties();
        property.load(file);
        return property.get(key).toString();
    }
}
