package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.*;

public class Test {

    public static void main(String[] args) {
        Test test = new Test();
        test.java8();
    }
    public void java8() {
        List<String> list= new ArrayList<>();
        list.add("renu");
        list.add("manu");
        list.add("Abhi");
        System.out.println(list);
        final int CONNECTION_TIMEOUT = 15_000;
        System.out.println(CONNECTION_TIMEOUT);

        List<Person> listOfPerson = new ArrayList<Person>();
        listOfPerson.add(new Person("abc", 27));
        listOfPerson.add(new Person("mno", 26));
        listOfPerson.add(new Person("pqr", 28));
        listOfPerson.add(new Person("xyz", 27));

        BiFunction<Person,Person,Integer> biFunction = (p1,p2) -> {
            return p1.getAge() + p2.getAge();
        };
        int totalAge = biFunction.apply(new Person("renu",30),new Person("manu",30));
        System.out.println(totalAge);

        Consumer<Person> consumer = (p1) ->{
            System.out.println(p1.getAge());
            System.out.println(p1.getName());
        };

        Function<Person,PersonDTO> function = (p1) -> {
            return new PersonDTO(p1.getName(),p1.getAge());
        };
        PersonDTO p = function.apply(new Person("renu",20));

        Predicate<Person> predicate = (person) -> person.getAge() > 28;
        boolean result = predicate.test(new Person("ramesh", 29));
        System.out.println(result);

        Supplier<Person> supplier = () -> {
            return new Person("Ramesh", 30 );
        };

        Person p2 = supplier.get();
        System.out.println("Person Detail:\n" + p2.getName() + ", " + p2.getAge());

        Collections.sort(listOfPerson, (Person o1, Person o2) -> {
            return o1.getAge() - o2.getAge();
        });
        System.out.println(" sort persons by age in ascending order");
        listOfPerson.forEach(
                (person) -> System.out.println(" Person name : " + person.getName()));



    }
    class PersonDTO{
        String name;
        int age;
        PersonDTO(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return  this.name;
        }
        public int getAge(){
            return this.age;
        }
    }
    class Person{
        String name;
        int age;
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        public String getName(){
            return  this.name;
        }
        public int getAge(){
            return this.age;
        }
    }
}
