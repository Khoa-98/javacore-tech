public class Animal {
    public String name ;
    public int age;
    public int leg;
    public String color;

    public Animal(){
        System.out.println("gọi tới contructor");
    }

//    public Animal(String ten, int tuoi, int sochan, String maulong){
//        name = ten;
//        age = tuoi;
//        leg = sochan;
//        color = maulong;
//
//    }

            // alt+ ins: Tạo nhanh 1 constructor
    public Animal(String name, int age, int leg, String color) {
        this.name = name;
        this.age = age;
        this.leg = leg;
        this.color = color;
    }

    public void eat(String food){
        System.out.println(name + " eat " + food);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", leg=" + leg +
                ", color='" + color + '\'' +
                '}';
    }
}
