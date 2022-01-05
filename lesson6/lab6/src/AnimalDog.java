public class AnimalDog {
    public String breed;
    public Size size;
    public String color;
    public int age;

    public AnimalDog(String breed, Size size, String color, int age) {
        this.breed = breed;
        this.size = size;
        this.color = color;
        this.age = age;
    }

    @Override
    public String toString() {
        return "AnimalDog{" +
                "breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
