package functionalInterface;

import data.StudentDataBase;
import data.Student;


import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){

        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name+" : "+activities);

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });

    }
    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a,b) ->{
            System.out.println("a: "+a+", b: "+b);
        };

        biConsumer.accept("Rana", "Swami");

        BiConsumer<Integer, Integer> multiply = (a,b) ->{
            System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
        };

        BiConsumer<Integer, Integer> division = (a,b) ->{
            System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
        };

        multiply.andThen(division).accept(4, 3);

        nameAndActivities();

        int n = (int) (Math.log10(123) + 1);
        System.out.println(n);
    }
}
