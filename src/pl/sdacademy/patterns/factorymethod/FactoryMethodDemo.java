package pl.sdacademy.patterns.factorymethod;

import java.util.HashMap;

public class FactoryMethodDemo {

    private String login;
    private String email;
    private String firstName;
    private String lastName;
    private String departmentName;

    public static FactoryMethodDemo from(ResultSet rs) { // factory method
        FactoryMethodDemo demo = new FactoryMethodDemo();
        demo.login = rs.username;
        demo.email = rs.username;
        demo.firstName = rs.firstName;
        demo.lastName = rs.lastName;
        demo.departmentName = rs.departmentName;
        return demo;
    }

    public static FactoryMethodDemo from(HashMap<String, String> params) { // factory method
        FactoryMethodDemo demo = new FactoryMethodDemo();
        demo.login = params.get("login");
        demo.email = params.get("login");
        demo.firstName = params.get("firstName");
        demo.lastName = params.get("lastName");
        demo.departmentName = params.get("department");
        return demo;
    }

    @Override
    public String toString() {
        return "FactoryMethodDemo{" +
                "login='" + login + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }
}
