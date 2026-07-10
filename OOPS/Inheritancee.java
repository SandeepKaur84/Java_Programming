package OOPS;

class Animal {
    void legs() {
        System.out.println("All animals have legs");
    }
}

class Dog extends Animal {
    void legs() {
        System.out.println("Dogs have 4 legs");
    }
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Inheritancee {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.legs();
    }
}
