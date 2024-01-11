import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EntradasUsuarioNumeros {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = leerNumeros();
        System.out.println(mostrarNumeros(numeros));

    }

    public static ArrayList<Integer> leerNumeros () {

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner miScanner = new Scanner(System.in);
        Integer numero;
        do {
            System.out.println("Introduce el número");
            numero = miScanner.nextInt();
            numeros.add(numero);
        } while (numero >= 0);

        return numeros;


    }

    public static List<Integer> mostrarNumeros (ArrayList<Integer> numeros) {

        List<Integer> listaNumeros = numeros.stream()
                .filter(numero -> numero >= 1)
                .filter(numero -> numero <= 5).collect(Collectors.toList());

        return listaNumeros;

    }
}
