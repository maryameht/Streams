import java.util.ArrayList;

public class Suma {

    public static void main(String[] args) {


        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(10);
        numeros.add(-10);
        numeros.add(2);

        Long positivos = numeros.stream()
                .filter(numero -> numero > 0)
                .count();

        Long negativos = numeros.stream()
                .filter(numero -> numero < 0)
                .count();

        System.out.println(positivos);
        System.out.println(negativos);


    }

}
