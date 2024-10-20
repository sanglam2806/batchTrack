package org.example;

import org.example.object.AppWrapper;
import org.example.process.Scraper;
import org.example.process.YamlParser;

public class Main {
    public static void main(String[] args) {
        YamlParser yamlParser = new YamlParser();
        AppWrapper appWrapper = yamlParser.loadObject();

        if(appWrapper != null) {
            System.out.println(Scraper.extractExcecutionTime(appWrapper));
        }
    }
}