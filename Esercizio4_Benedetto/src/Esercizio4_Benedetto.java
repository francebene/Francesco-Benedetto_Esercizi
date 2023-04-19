import java.util.*;

public class Esercizio4_Benedetto {


    public static void main(String[] args)
    {

                List<Integer> lista = Arrays.asList(3,2,4,5,1,10,23,6);
        System.out.println("L'intero minimo della lista è " + Collections.min(lista));
        System.out.println("L'intero massimo della lista è " + Collections.max(lista));

        int somma = lista.stream().mapToInt(Integer::intValue).sum();
        System.out.println("La somma della lista è " + somma);

//        double media = getMedia(lista);
        double media=lista.stream().mapToInt(a -> a).average().orElse(0);
        System.out.println("La media della lista è "+ media);

        lista.sort(Comparator.naturalOrder());
        System.out.println("La lista ordinata è "+ lista);

    }

}
