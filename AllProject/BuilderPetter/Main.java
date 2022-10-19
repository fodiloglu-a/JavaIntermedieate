package BuilderPetter;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder().name("Tuğrul").surname("Bayrak").address("Türkiye").build();
        person.getSurname();


    }



}
