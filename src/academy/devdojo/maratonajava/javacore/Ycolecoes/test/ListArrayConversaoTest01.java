package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numeroArray = new Integer[3];
        numeroArray[0] = 1;
        numeroArray[1] = 2;
        numeroArray[2] = 3;

        List<Integer> arraysToList = Arrays.asList(numeroArray);
        arraysToList.set(0, 12);
        System.out.println(Arrays.toString(numeroArray));
        System.out.println(arraysToList);

        System.out.println("-------------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numeroArray));
        numerosList.add(15);
        System.out.println(numerosList);

        Arrays.asList("1", "2", "3", "4", "5");
    }
}
