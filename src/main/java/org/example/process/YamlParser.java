package org.example.process;

import org.example.object.App;
import org.example.object.Customer;
import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.InputStream;

public class Yamljobnet {

    final private static String YAML_PATH = "./jobnet.yaml";

    public void loadObject() {
//        Yaml yaml = new Yaml(new Constructor(App.class, new LoaderOptions()));
//        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(YAML_PATH);
////                    new FileInputStream(YAML_PATH);
//        App wj2736 = yaml.load(inputStream);

        Yaml yaml = new Yaml();
        InputStream inputStream = this.getClass()
                .getClassLoader()
                .getResourceAsStream("./test.Yaml");
        Customer customer = yaml.loadAs(inputStream, Customer.class);


        System.out.println(customer);
    }
}
