import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EntradasUsuario {

    public static void main(String[] args) {

        ArrayList<String> cadenas = leerEntrada();
        System.out.println(mostrarEntradas(cadenas));

    }

    public static ArrayList<String> leerEntrada () {
        ArrayList<String> cadenas = new ArrayList<>();
        Scanner miScanner = new Scanner(System.in);
        String cadena = " ";
        do {
            System.out.println("Introduce la cadena");
            cadena = miScanner.nextLine();
            cadenas.add(cadena);
        } while (!cadena.isEmpty());

        return cadenas;
    }

    public static List<String> mostrarEntradas (ArrayList<String> cadenas) {

        List<String> listaCadenas = cadenas.stream().collect(Collectors.toList());
        return listaCadenas;

    }




}
