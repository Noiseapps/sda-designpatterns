package pl.sdacademy.patterns.command;

import pl.sdacademy.patterns.adapter.UserData;

import java.util.ArrayList;
import java.util.List;

public class CommandMain {

    public static void main(String[] args) {
        UserData admin = new UserData();
        admin.username = "admin";
        admin.password = "admin";
        List<String> adminRoles = new ArrayList<>();
        adminRoles.add("USER");
        adminRoles.add("ADMIN");
        adminRoles.add("MODERATOR");
        admin.roles = adminRoles;
        printHelloIfAdmin(admin);


        List<String> userRoles = new ArrayList<>();
        userRoles.add("USER");
        UserData user = new UserData();
        user.username = "user";
        user.password = "user";
        user.roles = userRoles;

        printHelloIfAdmin(user);
    }

    private static void printHelloIfAdmin(UserData data) {
        if (data.isAdmin()) {
            System.out.println("Hello admin");
        } else {
            System.out.println("Sorry, only restricted to administrators");
        }
    }
}
