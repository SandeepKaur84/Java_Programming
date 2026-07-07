package OOPS;

class User {
    int age;
    int marks;

    User(int age, int marks) {
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println(this.age);
        System.out.println(this.marks);
    }
}

public class Student2 {
    String name;
        int rollNo;
        int marks;

        Student2(String name, int roll_no, int marks) {
            this.name = name;
            this.rollNo = roll_no;
            this.marks = marks;
        }

        void displayDetails() {
            System.out.println(this.name);
            System.out.println(this.rollNo);
            System.out.println(this.marks);
        }

        void calculateGrade() {
            if(this.marks >= 90) {
                System.out.println("Grade A");
            } 
        }
    
    public static void main(String[] args) {
        Student2 s1 = new Student2("Sandeep", 1725, 90);
        s1.displayDetails();
        s1.calculateGrade();

        User u1 = new User(10, 90);
        u1.display();
    }
}
