package OOPS;

public class Example {
    String name;
    int age;

    void markAttendance() {
        System.out.println("Student can mark attendance");
    }

    void printData() {
        System.out.println(name);
        System.out.println(age);
        markAttendance();
    }
    public static void main(String[] args) {
           Example e1 = new Example();
           e1.name = "sandeep";
           e1.age = 22;

           Example e2 = new Example();
           e2.name = "abc";

           e1.printData();
           e2.printData();

    }
}
