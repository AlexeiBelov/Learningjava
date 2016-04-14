import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Dog {
    public static void main(String[] args) {
        Map<String, String> x = new HashMap<>();
        x.put("Irina", "+79034565544");
        x.put("Alexey", "+79857575484");
        System.out.println(x.get("Irina"));
        System.out.println(x.hashCode());


        Set<String> y = new HashSet<>();
        y.add("Dog");
        y.add("Cat");
        System.out.println(y.contains("Dog"));
        System.out.println(y.contains("ddd"));
    }
}
