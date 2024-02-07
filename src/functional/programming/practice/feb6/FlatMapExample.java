package functional.programming.practice.feb6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> productList1 = Arrays.asList("Printer", "Mouse", "Keyboard", "Motherboard");
        List<String> productList2 = Arrays.asList("Scanner", "Projector", "Light Pen");
        List<String> productList3 = Arrays.asList("Pen Drive", "Charger", "WIFI Adapter", "Cooling Fan");
        List<String> productList4 = Arrays.asList("CPU Cabinet", "WebCam", "USB Light", "Microphone", "Power cable");
        List<List<String>> allProductList = new ArrayList<>();
        allProductList.add(productList1);
        allProductList.add(productList2);
        allProductList.add(productList3);
        allProductList.add(productList4);
        List<String> collect = allProductList.stream().flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(collect);
    }
}
