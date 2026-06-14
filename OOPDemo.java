class StudentOOP {

    String name;
    int age;

    StudentOOP(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class OOPDemo {

    public static void main(String[] args) {

        StudentOOP s1 = new StudentOOP("Preeti", 20);

        s1.display();
    }
}