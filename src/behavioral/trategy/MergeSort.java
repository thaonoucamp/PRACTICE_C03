package behavioral.trategy;

import java.util.List;

public class MergeSort implements ISort<Integer>{
    @Override
    public List<Integer> sorted(List<Integer> list) {
        System.out.println("Merge sorted");
        return list;
    }
}
