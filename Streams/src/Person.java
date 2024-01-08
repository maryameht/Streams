import java.util.ArrayList;

public class Person {

    //Creamos los atributos del objeto persona
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;

    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getBirthYear() {
        return this.birthYear;
    }
    public static void main(String[] args) {

        ArrayList<Person> personas = datos();


    }

    public static ArrayList<Person> datos () {

        ArrayList<Person> personas = new ArrayList<>();
        Person persona = new Person("Pepe", "García", 1968);
        personas.add(persona);
        persona = new Person ("María", "García", 1998);
        personas.add(persona);
        persona = new Person("Juan", "Martínez", 1968);

        return personas;
    }

    //método para mostrar cuántas personas nacieron antes
    public static long nacerantes (ArrayList<Person> personas, String birthYear) {

        long contar = personas.stream()
                .filter(persona -> persona.getBirthYear() < 1970)
                .count();

        return contar;
    }

}
