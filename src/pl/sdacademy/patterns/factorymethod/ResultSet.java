package pl.sdacademy.patterns.factorymethod;

public class ResultSet {

    String username;
    String firstName;
    String lastName;
    String departmentName;

    public ResultSet(String username,
                     String firstName,
                     String lastName,
                     String departmentName) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
    }
}
