package academy.devdojo.maratonajava.javacore.ZZEstream.test;

import academy.devdojo.maratonajava.javacore.ZZEstream.dominio.LightNovel;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest08 {

    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overlord", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)));

    public static void main(String[] args) {
        //lightNovels.stream().map(LightNovel::getPrice).filter(price -> price > 3).reduce(Double::sum).ifPresent(System.out::println);

//        System.out.println(lightNovels.stream().map(LightNovel::getPrice).peek());

        LightNovel ln = new LightNovel("teste", 50);
        LightNovel ln1 = new LightNovel("teste5", 50);

        Predicate<LightNovel> valor = l -> l.getPrice() >= 2;

        System.out.println(valor.test(ln));

        Consumer<LightNovel> consumer = c -> System.out.println(c.getTitle());

        consumer.accept(ln);

        Function<LightNovel, Integer> teste = x -> x.getTitle().length();

        System.out.println(teste.apply(ln));

        Supplier<Stream<LightNovel>> supplier =() -> Stream.of(ln);
        List<LightNovel> collect = supplier.get().filter(valor).collect(Collectors.toList());

        System.out.println("Collect" + collect);

        BiPredicate<LightNovel, LightNovel> biPredicate = (bi1, bi2) -> (bi1.getTitle().compareTo(bi2.getTitle()) == 0);

        System.out.println(biPredicate.test(ln, ln1));

        BiConsumer<LightNovel, LightNovel> bic = (b1, b2) -> System.out.println(b1.getTitle() +" - "+ b2.getTitle());
        bic.accept(ln, ln1);



    }
}
