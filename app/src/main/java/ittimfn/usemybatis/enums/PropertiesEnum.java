package ittimfn.usemybatis.enums;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;


public enum PropertiesEnum {
    DATABASE_PATH("database.path"),
    MYBATIS_ENVIRONMENT_ID("mybatis.environment.id");

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
