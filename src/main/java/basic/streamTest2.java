package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class streamTest2{
        public static void main(String args[]) {

            Stream.iterate(0, element->element+6)
            .filter(element->element%6==0)
            .limit(11)
            .forEach(System.out::println);





        }
 }



