package pl.sdacademy.patterns.factorymethod;

import java.util.HashMap;

public class FactoryMethodMain {

    public static void main(String[] args) {
        ResultSet rs = new ResultSet("test@test.pl",
                "Test",
                "Test",
                "Departament Testowy");
        FactoryMethodDemo methodDemo = FactoryMethodDemo.from(rs);
        System.out.println(methodDemo);


        HashMap<String, String> map = new HashMap<>();
        // fill map with data
        System.out.println(FactoryMethodDemo.from(map));

    }
}
