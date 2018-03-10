package pl.sdacademy.patterns.adapter;

import java.util.List;

public class UserData {

    public String username;
    public String password;
    public List<String> roles;

    public boolean isAdmin() {
        return roles.stream().anyMatch((item) -> item.equalsIgnoreCase("admin"));
    }
}
