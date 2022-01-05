import java.util.Scanner;

public class PersonSevice {

    public  Person[] getAllPerson(){
        Person[] persons = new Person[2];
        persons[0] = new Person(1, "khoa", 26, Gender.MALE, "hn");
        persons[1] = new Person(1, "nam", 26, Gender.MALE, "hn");
        return persons;
    }
    public void show(Person[] persons){
        for (Person p: persons) {
            System.out.println(p);
        }
    }

    public Person createPerson(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên: ");
        String name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Lựa chọn giới tính: ");
        System.out.println("1- nữ");
        System.out.println("0- nam");
        int choice = Integer.parseInt(sc.nextLine());
        Gender gender = Gender.MALE;
        if(choice==1){
             gender = Gender.MALE;
        }else if(choice==0){
            gender = Gender.FEMALE;

        }else{
            System.out.println("Không có lựa chọn này ");
        }

        System.out.println("Nhập địa chỉ: ");
        String address = sc.nextLine();

        Person newperson = new Person(id, name , age, gender, address);
        return newperson;


    }
    public Person[] addPerson(int size){
        Person[] persons = new Person[size];
        for(int i=0; i<size; i++){
            System.out.println("Nhập thêm người thứ " + i);
            persons[i] = createPerson();
        }
        return persons;
    }

}
