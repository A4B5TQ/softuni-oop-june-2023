package encapsulation.demo;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(30,"Goshko");
        List<String> asd = new ArrayList<>();
        asd.add("Pesho");
        asd.add("Gosho");
        asd.add("Stamat");
        asd.add("Unufri");
//        person.setInnerData(asd);

        System.out.println(person.getInnerData());
        System.out.println(person.getInnerData().add("Mariq"));
        person.getInnerData().clear();
        System.out.println(person.getInnerData());
        System.out.println();
    }
}
