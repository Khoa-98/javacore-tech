package service;

public class PersonService {

    public static void createPerson(){
        Person person = new Person("khoa", 23, "NĐ");

        System.out.println(person);

        person.setName("sang");
        System.out.println(person.getName());
    }
}
