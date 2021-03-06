package lambdas;

import java.util.Arrays;
import java.util.List;

public class MapReduce {
    public static void main(String[] strings)
    {
        // 不使用lambda表达式为每个订单加上12%的税
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
//        for (Integer cost : costBeforeTax) {
//            double price = cost + 0.12*cost;
//            System.out.println(price);
//        }


        // 使用lambda表达式
//        costBeforeTax.stream().map((cost) -> cost + 0.12*cost).forEach(System.out::println);


        // 为每个订单加上12%的税
//        double total = 0;
//        for (Integer cost : costBeforeTax) {
//            double price = cost + 0.12*cost;
//            total = total + price;
//        }
//        System.out.println("Total : " + total);

        double bill = costBeforeTax.stream().map((cost) -> cost + 0.12*cost).reduce((sum, cost) -> sum + cost).get();
        System.out.println("Total : " + bill);
    }
}
