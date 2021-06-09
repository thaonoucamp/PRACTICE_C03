package behavioral.trategy;

import java.util.ArrayList;
import java.util.List;

public class DemoStrategy {
    ISort strategy;
    List<Integer> list = new ArrayList<>();

    public DemoStrategy() {
    }

    public DemoStrategy(ISort strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(ISort strategy) {
        this.strategy = strategy;
    }

    public void add(int item) {
        list.add(item);
    }

    public void sorted(List<Integer> list) {
        strategy.sorted(this.list);
    }

    public static void main(String[] args) {
        DemoStrategy strategy = new DemoStrategy();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(9);
        list.add(9);
        list.add(0);
        list.add(1);
        strategy.setStrategy(new MergeSort());
        strategy.sorted(list);
    }
}
