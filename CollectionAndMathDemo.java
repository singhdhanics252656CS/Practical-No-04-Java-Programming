package collectionandmathdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CollectionAndMathDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("----- List Interface -----");

        List<Double> numbersList = new ArrayList<>();

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbersList.add(input.nextDouble());
        }

        System.out.println("List: " + numbersList);

        double sum = 0;
        for (double num : numbersList) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + (sum / numbersList.size()));
        System.out.println("Minimum = " + Collections.min(numbersList));
        System.out.println("Maximum = " + Collections.max(numbersList));

        System.out.print("Enter a number to remove: ");
        double removeNum = input.nextDouble();

        numbersList.remove(Double.valueOf(removeNum));
        System.out.println("Updated List: " + numbersList);

        System.out.println("\n----- Set Interface -----");

        Set<Integer> numberSet = new HashSet<>();

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numberSet.add(input.nextInt());
        }

        System.out.println("Set: " + numberSet);

        int setSum = 0;
        for (int num : numberSet) {
            setSum += num;
        }

        System.out.println("Sum = " + setSum);

        Set<Integer> squareSet = new HashSet<>();
        for (int num : numberSet) {
            squareSet.add(num * num);
        }

        System.out.println("Squared Values: " + squareSet);

        System.out.print("Enter an integer to remove: ");
        int removeInt = input.nextInt();

        numberSet.remove(removeInt);
        System.out.println("Updated Set: " + numberSet);

        System.out.println("\n----- Map Interface -----");

        Map<String, Double> marks = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Student Name: ");
            String name = input.next();

            System.out.print("Enter Marks: ");
            double mark = input.nextDouble();

            marks.put(name, mark);
        }

        System.out.println("Student Marks: " + marks);

        double total = 0;
        for (double mark : marks.values()) {
            total += mark;
        }

        System.out.println("Total Marks = " + total);

        System.out.print("Enter student name to update: ");
        String student = input.next();

        if (marks.containsKey(student)) {
            System.out.print("Enter new marks: ");
            double newMarks = input.nextDouble();
            marks.put(student, newMarks);
        }

        System.out.println("Updated Map: " + marks);

        total = 0;
        for (double mark : marks.values()) {
            total += mark;
        }

        System.out.println("New Total Marks = " + total);

        System.out.print("Enter student name to remove: ");
        String removeStudent = input.next();

        marks.remove(removeStudent);

        System.out.println("Final Map: " + marks);

        input.close();
    }
}
