import java.util.ArrayList;

public class PersonasAntes1970 {

    public static void main(String[] args) {

        ArrayList<Person> personas = datos();


        System.out.println("El número de personas que nacieron antes de 1970 es:" + nacerantes(personas));

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

    //método para mostrar cuántas personas nacieron antes
    public static long nacerantes (ArrayList<Person> personas) {

        long contar = personas.stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .count();

        return contar;
    }
}
