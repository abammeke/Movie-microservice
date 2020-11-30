package com.webnet.moviecatalog;

import lombok.Data;

import java.util.*;

public class Main2 {

    public static void main(String[] args) {
       /* int[] a = {1, 1, 2, 3, 6, 20};
        int[] b = {2, 2, 2, 8, 19, 50, 100};
        System.out.println(Arrays.toString(merger(a, b)));
        */

        Practice p1 = new Practice(101, "John", "Doe", 90.49, 34);
        p1.addBook(101, "Open Book");     p1.addBook(102, "Java8");
        p1.addBook(106, "SpringBoot");    p1.addProduct("Books");
        p1.addProduct("Toiletries");                       p1.addProduct("Automobiles");

        Practice p2 = new Practice(102, "Blake", "James", 190.49, 36);
        p2.addBook(101, "MVC Java");     p2.addBook(102, "Angular");
        p2.addBook(106, "SpringBoot");   p2.addProduct("Electronics");
        p2.addProduct("Home Decorator");                  p2.addProduct("Automobiles");

        Practice p3 = new Practice(103, "Guiliani", "David", 150.49, 47);
        p3.addBook(106, "Open Book");   p3.addBook(102, "Java8");
        p3.addBook(110, "SpringBoot");  p3.addProduct("Books");
        p3.addProduct("Toiletries");                     p3.addProduct("Automobiles");

        Practice p4 = new Practice(102, "Blake", "James", 190.49, 36);
        p4.addBook(101, "MVC Java");    p4.addBook(102, "Angular");
        p4.addBook(106, "SpringBoot");  p4.addProduct("Electronics");
        p4.addProduct("Home Decorator");                 p4.addProduct("Automobiles");

        Practice p5 = new Practice(204, "John", "Doe", 90.49, 34);
        p5.addBook(149, "Open Book");     p5.addBook(112, "Java8");
        p5.addBook(116, "SpringBoot");    p5.addProduct("Pen");
        p5.addProduct("Tables");                       p5.addProduct("TV");

        Practice p6 = new Practice(100, "Ray", "Jay", 1190.49, 56);
        p6.addBook(101, "MVC Java");     p6.addBook(212, "Angular");
        p6.addBook(106, "SpringBoot");   p6.addProduct("Electronics");
        p6.addProduct("Home Decorator");                  p6.addProduct("Automobiles");

        Practice p7 = new Practice(297, "Ruddy", "David", 150.49, 47);
        p7.addBook(254, "Glory Book");   p7.addBook(102, "Java8");
        p7.addBook(110, "SpringBoot");  p7.addProduct("Books");
        p7.addProduct("Toiletries");                     p7.addProduct("Automobiles");

        Practice p8 = new Practice(102, "Blake", "James", 290.67, 72);
        p8.addBook(170, "MVC Java");    p8.addBook(102, "Angular");
        p8.addBook(619, "SpringBoot");  p8.addProduct("Electronics");
        p8.addProduct("Home Decorator");                 p8.addProduct("Automobiles");



        List<Practice> all = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8);
        Optional<String> getNames = all.stream().filter(i -> i.getFirstName().endsWith("e"))
                .map(Practice::getFirstName).findFirst();

        getNames.ifPresent(System.out::println);



        System.out.println(all);


    }

    public static int[] merger(int[] arr, int[] arr2) {
        int len = arr.length + arr2.length;
        int[] arr3 = new int[len];
        int firstPointer = 0;
        int secondPointer = 0;
        for (int i = 0; i < len; i++) {
            if ((firstPointer < arr.length) && (secondPointer < arr2.length)) {
                if (arr[firstPointer] <= arr2[secondPointer]) {
                    arr3[i] = arr[firstPointer++];
                } else {
                    arr3[i] = arr2[secondPointer++];
                }
            } else if ((firstPointer == arr.length)) {
                arr3[i] = arr2[secondPointer++];
            } else {
                arr3[i] = arr[firstPointer++];
            }
        }
        return arr3;
    }


}

@Data
class Practice {

    private int id;
    String firstName;
    String lastName;
    private double price;
    private int age;
    private List<String> products = new ArrayList<>();
    Map<Integer, String> books = new HashMap<>();

    public Practice(int id, String firstName, String lastName, double price, int age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.price = price;
        this.age = age;
    }

    public void addBook(int bookId, String bookName){
        this.books.put(bookId, bookName);
    }

    public void addProduct(String product){
        this.products.add(product);
    }

    @Override
    public String toString() {
        return  "Id: " + id + "\n" +
                "FirstName: " + firstName + "\n" +"LastName: " + lastName + "\n" +
                "Price: $" + price + "\n" +
                "Age: " + age + "\n" +
                "Products: " + products+ "\n" +
                "Books: " + books + "\n------------------------------------\n";
    }
}