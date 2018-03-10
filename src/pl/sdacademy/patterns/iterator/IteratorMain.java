package pl.sdacademy.patterns.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

public class IteratorMain {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 200; i++) {
            list.add(random.nextInt());
        }

        ListIterator<Integer> integerListIterator = list.listIterator();
        System.out.println(list.size());
        while (integerListIterator.hasNext()) {
            int next = integerListIterator.next();
            System.out.print(next);
            if (next > 200000) {
                integerListIterator.remove();
                System.out.print(" is greater");
            }
            System.out.println();
        }
        System.out.println(list.size());
    }
}
