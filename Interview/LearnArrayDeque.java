package Interview;

import java.util.ArrayDeque;

public class LearnArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad=new ArrayDeque<>();
        ad.offerFirst(1);
        ad.offerFirst(3);
        ad.offerFirst(5);
        ad.offerFirst(2);
        ad.offerFirst(8);
        ad.offerFirst(3);
        ad.offerLast(6);
        System.out.println(ad);
        System.out.println(ad.peekLast());
        System.out.println(ad.peekFirst());
    }
}
