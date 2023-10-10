package pro.sky;

import java.util.List;

public class App {
    public static void main(final String[] args) {
        List<String> names = List.of("Bill", "Ben", "Bob", "Sarah", "Elena", "Slava");
        List<String> namesResult = names.stream()
                .map(name -> name.substring(1))
                .sorted()
                .toList();
        System.out.println(namesResult);
    }
}