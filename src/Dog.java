public class Dog extends Animal {
    Dog() {
        super("dog", 4);
    }

    Dog(int age) {
        super("dog", 4, age);
    }

    public void makeNoise() {
        System.out.println("Woof!");
    }

    public void dig() {
        System.out.println("Lawn ruined successfully!");
    }
}
