package DZ4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Petea", "Vasea", "Dima", "Kolea", "Ala", "Petea", "Olea", "Ira", "Masha", "Ira");
        Map<String, Integer> Name = new HashMap<>();
        for (String s : name) {
            Name.put(s, Name.getOrDefault(s, 0) + 1);
        }
        Set<String> U = new HashSet<>(name);
        U.forEach(System.out::println);
    }


}
