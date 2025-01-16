class Animal {
    private String name;

    //constructor
    public Animal(String name) {
        this.name = name;
    }

    //Encapulation :Getter method
    public String getName() {
        return name;
    }

    // Polymorphism: Overridden method  
    public void makeSound() {
        System.out.println("Some sound");
    }

}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    // Polymorphism: Overridden method
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class OopsExample1{
public static void main(String[] args) {
    Dog dog = new Dog("Buddy");
    Cat cat = new Cat("Whiskers");

    System.out.println("Dog Name:" + dog.getName());
    dog.makeSound();
    System.out.println("Cat Name" + cat.getName());
    cat.getName();
}
}
