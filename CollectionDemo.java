package listandmapinterface;

import java.util.*;

public class CollectionDemo {

    public static void main(String[] args) {

        System.out.println("----- List Interface -----");
        List<String> list = new ArrayList<>();

        list.add("Rahul");
        list.add("Priya");
        list.add("Amit");
        list.add("Neha");
        list.add("Rahul");

        System.out.println("List Elements: " + list);
        System.out.println("First Student: " + list.get(0));

        list.set(2, "Karan");
        System.out.println("After Updating: " + list);

        list.remove("Neha");
        System.out.println("After Removing Neha: " + list);

        System.out.println("Size of List: " + list.size());

        System.out.println("\n----- Set Interface -----");
        Set<String> set = new HashSet<>();

        set.add("Rohan");
        set.add("Sneha");
        set.add("Anjali");
        set.add("Vikram");
        set.add("Rohan");

        System.out.println("Set Elements: " + set);
        System.out.println("Contains Sneha: " + set.contains("Sneha"));

        set.remove("Anjali");
        System.out.println("After Removing Anjali: " + set);

        System.out.println("Size of Set: " + set.size());

        System.out.println("\n----- Map Interface -----");
        Map<Integer, String> map = new HashMap<>();

        map.put(101, "Arjun");
        map.put(102, "Meera");
        map.put(103, "Sanjay");
        map.put(104, "Pooja");

        System.out.println("Employee Records:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("Employee with ID 102: " + map.get(102));

        map.put(103, "Nikhil");
        System.out.println("After Updating Employee 103:");
        System.out.println(map);

        map.remove(104);
        System.out.println("After Removing Employee 104:");
        System.out.println(map);

        System.out.println("Size of Map: " + map.size());
    }
}
