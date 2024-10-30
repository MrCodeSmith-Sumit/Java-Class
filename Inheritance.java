class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}
class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

 class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        Animal animal = new Animal();
        animal.sound(); 
    }
}
