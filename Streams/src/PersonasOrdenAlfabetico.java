import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonasOrdenAlfabetico {

    public static void main(String[] args) {

        ArrayList<Person> personas = datos();
        System.out.println(alfabetizarNombres(personas));


    }

    public static ArrayList<Person> datos () {

        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person ("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);
        personas.add(persona);

        return personas;
    }

    public static List<String> alfabetizarNombres (ArrayList<Person> personas) {

        List<String> ordenar = personas.stream().map(person -> person.getFirstName()).sorted().collect(Collectors.toList());

        return ordenar;
    }
}
