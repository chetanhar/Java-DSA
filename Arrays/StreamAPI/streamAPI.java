package StreamAPI;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 15, 10);
        nums.add(10);
        nums.add(2);
        nums.add(3);
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<Integer> d=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(d);
//        List<Integer> re=numbers.parallelStream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(re);
//        List<Integer> rs=nums.stream().distinct().collect(Collectors.toList());
//        List<Integer> rs1=nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        List<Product> persons = Arrays.asList(
//                new Product(12,"Alice", 30),
//                new Product(13,"Bob", 25),
//                new Product(14,"Charlie", 35)
//        );
//       List<String> rs2=persons.stream().map(Product::getName).collect(Collectors.toList());
//        System.out.println(rs2);
//
//        numbers.stream().forEach(System.out::println);




//        List<Integer> result = numbers.parallelStream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//        ArrayList<Integer> result1 = numbers.parallelStream().filter(n -> n % 2 == 0).collect(Collectors.toCollection(() -> new ArrayList<>()));
//        ArrayList<Integer> result2 = numbers.parallelStream().map(n -> n * 2).collect(Collectors.toCollection(() -> new ArrayList<>()));
//        Optional<Integer> sum = nums.stream().reduce((x, y) -> x + y);
//        nums.stream().forEach(System.out::println);
//        System.out.println(sum);
//        Optional<String> str=Optional.ofNullable("h");
//        if(str.isPresent()){
//            System.out.println(str.get());
//        }


//        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        System.out.println(numbers1);
//        List<Integer> result1=numbers1.parallelStream().filter(d->d%2==0).collect(Collectors.toList());
//        System.out.println(result1);

//        List<Product> productsList =new ArrayList<>();
//        //Adding Products
//        productsList.add(new Product(1,"HP Laptop",25000f));
//        productsList.add(new Product(2,"Dell Laptop",30000f));
//        productsList.add(new Product(3,"Lenevo Laptop",28000f));
//        productsList.add(new Product(4,"Sony Laptop",28000f));
//        productsList.add(new Product(5,"Apple Laptop",90000f));
//        List<Float> productPriceList2 =productsList.stream()
//                .filter(p -> p.price > 30000)// filtering data
//                .map(p->p.price) // fetching price
//                .collect(Collectors.toList()); // collecting as list
//        System.out.println(productPriceList2);
//
//        List<String> myList = Arrays.asList("apple", "banana", "orange");
//        Stream<String> stream = myList.stream();
//        List<String> myListres=stream.filter(a->a.startsWith("b")).map(String::toUpperCase).collect(Collectors.toList());
//        System.out.println(myListres);


    }

}
class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}