import java.util.ArrayList;

public class PersonasApellidoEmpiezaPorA {
    public static void main(String[] args) {

        ArrayList<Person> personas = datos();
        System.out.println("Se han encontrado " + contar(personas) + " personas con apellido que empiza por A");
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

    public static long contar ( ArrayList<Person> personas ) {


        long contar = personas.stream()
                .filter(persona -> persona.getLastName().startsWith("A"))
                .count();
        return contar;

    }
}
