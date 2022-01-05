public class Main {
    public static void main(String[] args) {

//        Animal cat = new Animal();
//        cat.name = "kitty";
//        cat.age = 3;
//        cat.leg = 4;
//        cat.color = "Trắng";
//
//        System.out.println(cat);
//        cat.eat("fish");
//
//        Animal dog = new Animal("Mike", 7, 4, "black");
//        System.out.println(dog);
//
//
//
//        Person male = new Person(1, "Jonh", 24, Gender.MALE, "HN" );
//        Person p = new Person(1, "khoa", 24, Gender.MALE, "HN" );
//
//        Person.study();
//
//        System.out.println(male);
//        System.out.println(p);

//        AnimalDog dog1 = new AnimalDog("German Shepherct", Size.Large, "White & Grey", 6);
//        System.out.println(dog1);
        PersonSevice service = new PersonSevice();
        Person[] persons = service.addPerson(2);
        service.show(persons);


    }
}
