package pl.sdacademy.patterns.strategy;

public class RegularPrintStrategy implements Strategy {

    @Override
    public void solve(String toPrint) {
        System.out.println(toPrint);
    }
}
