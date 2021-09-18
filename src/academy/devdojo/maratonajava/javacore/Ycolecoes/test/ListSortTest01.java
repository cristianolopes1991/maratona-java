package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {

    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>(6);
        mangas.add("Bersek");
        mangas.add("Pokemon");
        mangas.add("Dragon ball Z");
        mangas.add("Hellsing Ultimate");
        mangas.add("Attack on titan");

        Collections.sort(mangas);

        List<Double> dinheiros = new ArrayList<>();
        dinheiros.add(100.21);
        dinheiros.add(23.98);
        dinheiros.add(21.21);
        dinheiros.add(98.10);

        System.out.println(dinheiros);
        Collections.sort(dinheiros);

        System.out.println(dinheiros);


        for(String manga : mangas){
            System.out.println(manga);
        }
    }
}
