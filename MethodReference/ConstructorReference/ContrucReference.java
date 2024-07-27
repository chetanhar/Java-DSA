package MethodReference.ConstructorReference;

import java.util.function.Predicate;

public class ContrucReference {
    public static void main(String[] args) {
        System.out.println("Learning Constructor Reference");
        WorkIntern wr=()->{
            return new Student();
        };
        //Constructor Reference
        WorkIntern wr1=Student::new;
        Student student=wr1.getsStudent();
        student.display();
        Predicate<Integer> p=n->n%2==0;
        System.out.println(p.test(33));
        System.out.println(p.test(34));
    }
}
