package hashMap;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        map1.put(111234,"Петров Петр");
        map1.put(321432,"Иванов Иван");
        map1.put(245321, "Семенов Семен");
        map1.put(674832, "Дмитриенко Дмитрий");
        map1.put(689332, "Дмитриенко Дмитрий");
        System.out.println(map1);

        map1.putIfAbsent(111234, "Гром Иван");
        System.out.println(map1);

        System.out.println(map1.get(111234));

        map1.remove(689332);
        System.out.println(map1);

        System.out.println(map1.containsValue("Семенов Семен"));
        System.out.println(map1.containsKey(245321));
        System.out.println(map1.keySet());
        System.out.println(map1.values());

        System.out.println(map1.entrySet());


        Map<Integer, String> map2 = new HashMap<>(16, 0.75F);


    }
}
