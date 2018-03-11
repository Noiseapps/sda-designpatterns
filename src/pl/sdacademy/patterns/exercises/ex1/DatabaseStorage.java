package pl.sdacademy.patterns.exercises.ex1;


import java.util.ArrayList;
import java.util.List;

// przetrzymuje dane jako listę wpisów w tabeli
public class DatabaseStorage {

    List<Row> rows = new ArrayList<>();

    public static class Row {
        String value;
        long createdTime;
    }

    public void addRow(String data) {

    }

    public List<Row> getData() {
        return null;
    }
}
