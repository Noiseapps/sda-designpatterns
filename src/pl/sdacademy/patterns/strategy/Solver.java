package pl.sdacademy.patterns.strategy;

public class Solver {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void solve(String toPrint) {
        strategy.solve(toPrint);
    }
}
