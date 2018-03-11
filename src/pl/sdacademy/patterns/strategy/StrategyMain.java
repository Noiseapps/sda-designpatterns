package pl.sdacademy.patterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        Solver solver = new Solver();

        solver.setStrategy(new RegularPrintStrategy());
        solver.solve("asdjad jiao jdosij oa");

        solver.setStrategy(new VerticalPrintStrategy());
        solver.solve("asdjad jiao jdosij oa");
    }
}
