package pl.sdacademy.patterns.strategy;

public class VerticalPrintStrategy implements Strategy {

    @Override
    public void solve(String toPrint) {
        for (char c : toPrint.toCharArray()) {
            System.out.println(c);
        }
    }
}
