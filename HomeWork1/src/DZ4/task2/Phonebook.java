package DZ4.task2;

import java.util.*;

public class Phonebook {
    Map<String, List<String>> PB = new HashMap<>();

    public void add( String name, String phone) {
        List<String> phonenumber;
        if (PB.containsKey(name)) {
            phonenumber = PB.get(name);
            phonenumber.add(phone);
            PB.put(name, phonenumber);
        } else {
            phonenumber = new ArrayList<>();
            phonenumber.add(phone);
            PB.put(name, phonenumber);
        }
    }

    public List<String> get(String name) {
        return PB.get(name);
    }




}
