import java.util.*;

public class SumCalculator {
    public int sum; //creats public ints for sum and product

    public static int sumCalculator(List<Integer> list){ ////creats a method and int to use inside of it
        int sum = 0;
        for (int i: list){
            sum += i;
        }
        return sum;
    }
}
