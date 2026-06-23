package OOPS;

class Teacher {

}


public class Student {
    String name;
    int age;
    int roll_no;

    Student() {
        System.out.println("Constructor called");
    }

    Student(int a , String n) {
        this.name = n;
        this.age = a;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student(23, "abc");
        s2.display();
        s1.display();
    }
}
