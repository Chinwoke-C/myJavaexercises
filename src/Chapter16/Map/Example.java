package Chapter16.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Example {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Amirah", 50);
        map.put("Balablu", 49);
        map.put("Shepard", 125);

        System.out.println(map);
        Integer amirahAge = map.get("Amirah");
        System.out.println("amirah-> "+amirahAge+"years");

        System.out.println(map.containsKey("Atiku"));

        System.out.println(map.getOrDefault("Amirk", 60));

        Set<String> key = map.keySet();
        System.out.println(key);

        int result = map.replace("Amirah", 80);
        System.out.println(result);
        System.out.println(map.size());


    }
}
