package pl.sdacademy.patterns.exercises.ex1;


import java.util.ArrayList;
import java.util.List;

// przetrzymuje dane w liście Stringów
public class InMemoryStorage {

    List<String> data = new ArrayList<>();

    public boolean store(String data) {
        return true;
    }

    public List<String> read() {
        return null;
    }

}
