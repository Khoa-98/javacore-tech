public class Student {
    public int id;
    public String name;
    public double theoryNumber;
    public double practicNumber;
    public String school;

    public Student(int id, String name, double theoryNumber, double practicNumber, String school) {
        this.id = id;
        this.name = name;
        this.theoryNumber = theoryNumber;
        this.practicNumber = practicNumber;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", theoryNumber=" + theoryNumber +
                ", practicNumber=" + practicNumber +
                ", school='" + school + '\'' +
                '}';
    }

    public Student[] AllStudent(){
        Student[] students = new Student[3];
        students[0] = new Student(1, "khoa", 10, 9, "Mỹ thắng");
        students[1] = new Student(2, "hoa", 10, 9, "Mỹ Lộc");
        students[2] = new Student(3, "hương", 10, 9, "Mỹ Thành");
        return students;
    }

    public void show(Student[] students){
        for(Student p: students){
            System.out.println(p);
        }
    }
}

