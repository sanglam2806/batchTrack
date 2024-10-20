package org.example.process;

import org.example.object.App;
import org.example.object.AppWrapper;
import org.yaml.snakeyaml.Yaml;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class YamlParser {
    final private static String YAML_PATH = "jobnet.yaml";

    public AppWrapper loadObject(){
        Yaml yaml = new Yaml();
        InputStream inputStream = YamlParser.class
                .getClassLoader()
                .getResourceAsStream(YAML_PATH);

        if (inputStream == null) {
            System.out.println("cant not red data");
            return null;
        }

       return yaml.loadAs(inputStream, AppWrapper.class);
    }
}

