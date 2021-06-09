package behavioral.trategy;

import java.util.List;

public class SellectionSorted implements ISort<Integer>{
    @Override
    public List<Integer> sorted(List<Integer> list) {
        System.out.println("Selection sorted");
        return list;
    }
}
