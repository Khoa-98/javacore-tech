public class Person {
    public int id ;
    public  String name;
    public int age;
    public Gender gender;
    public String address;
    public static String school = "Techmaster";

    public Person(int id, String name, int age, Gender gender, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    public static void study(){

        school = "CNTT";
    }


//    public void job()


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender.getValue() + '\'' +
                ", address='" + address + '\'' +
                ", school='" + school + '\'' +
                '}';
    }
}
