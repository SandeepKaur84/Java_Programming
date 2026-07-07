package OOPS;
public class Ex2 {
    class Student {
        String name;
        int rollNo;
        int marks;

        Student(String name, int roll_no, int marks) {
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

        }
    }
    public static void main(String[] args) {
        
    }
}
