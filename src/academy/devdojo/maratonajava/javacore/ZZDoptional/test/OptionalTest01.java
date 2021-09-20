package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of(findName("william"));
        String name = findName("william");

    }

    private static String findName(String name){
        List<String> list = List.of("William", "DevDojo");
        int i = list.indexOf(name);
        if(i > 0){
            return list.get(i);
        }

        return null;
    }
}
