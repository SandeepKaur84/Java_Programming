package OOPS;

class Car {
    int tyres;
    String color;

    Car(int tyres, String color) {
        this.tyres = tyres;
        this.color = color;
    }

    void display() {
        System.out.println("Total tyres are : " + this.tyres);
        System.out.println(this.color);
    }
}

public class Examplee {
    String name;
    int age;
    int marks;

    Examplee() {
        System.out.println("Constructor called");
    }

    Examplee(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.marks);
    }

    public static void main(String[] args) {
        Examplee s1 = new Examplee();
        Examplee s2 = new Examplee("ABC", 20, 30);
        Examplee s3 = new Examplee("XYZ", 40, 90);
        s2.display();
        s3.display();
        s1.display();

        Car c1 = new Car(3, "Red");
        c1.display();
    }
}
