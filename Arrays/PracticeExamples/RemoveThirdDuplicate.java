package PracticeExamples;

import java.util.*;

public class RemoveThirdDuplicate {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(2);
        System.out.println("Original List: " + numbers);
        System.out.println("List after removing third duplicates: " + removeThirdDuplicate(numbers));
        int c=2;
        switch (c){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("default");
        }
    }

    private static List<Integer> removeThirdDuplicate(List<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer current = iterator.next();
            int occurrence = 0;
            for (Integer element : list) {
                if (Objects.equals(current, element)) {
                    occurrence++;
                }
                if (occurrence == 3) {
                    iterator.remove();
                    break;
                }
            }
        }
        return list;
    }
}
