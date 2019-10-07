public class Cat extends Animal {
    Cat() {
        super("cat", 4);
    }

    Cat(int age) {
        super("cat", 4, age);
    }

    public void makeNoise() {
        System.out.println("Meow!");
    }
}
