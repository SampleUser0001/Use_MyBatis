package ittimfn.usemybatis.enums;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;


public enum PropertiesEnum {
    DATABASE_PATH("database.path");

    private static Properties properties;

    private String key;

    private PropertiesEnum(String key) {
        this.key = key;
    }

    public static void load(Path propertiesPath) throws IOException {
        properties = new Properties();
        properties.load(
            Files.newBufferedReader(propertiesPath, StandardCharsets.UTF_8)
        );
    }

    public String getValue() {
        return properties.getProperty(key);
    }
    
}
