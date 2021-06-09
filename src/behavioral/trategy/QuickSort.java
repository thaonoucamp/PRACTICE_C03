package behavioral.trategy;

import java.util.List;

public class QuickSort implements ISort<Integer>{
    @Override
    public List<Integer> sorted(List<Integer> list) {
        System.out.println("Quick sorted");
        return list;
    }
}
