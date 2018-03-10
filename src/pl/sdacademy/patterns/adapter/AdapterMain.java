package pl.sdacademy.patterns.adapter;

import java.util.Arrays;

public class AdapterMain {

    public static void main(String[] args) {
        UserModel model = getUserData();
        UserData data = translate(model);
        authenticate(data);
    }

    // Adapter
    static UserData translate(UserModel model) {
        UserData data = new UserData();
        data.username = model.username;
        data.password = model.password;
        data.roles = Arrays.asList(model.permissions.split(","));
        return data;
    }

    // Spring
    static void authenticate(UserData data) {}

    // database
    static UserModel getUserData() {
        UserModel model = new UserModel();
        model.username = "test";
        model.email = "test@test.pl";
        model.firstName = "Test";
        model.lastName = "Test";
        model.officeName = "Test";
        model.password = "Test123!";
        model.permissions = "A,B,C,D,E,F,G";
        return model;
    }
}
