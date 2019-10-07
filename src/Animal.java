public class Animal {
    private final String species;
    private int age;
    private final int numLegs;

    public Animal(String species, int numLegs) {
        this(species, numLegs, 0);
    }

    public Animal(String species, int numLegs, int age) {
        this.species = species;
        this.numLegs = numLegs;

        this.age = age;
    }

    public String getSpecies() {
        return this.species;
    }

    public void makeNoise() {
        System.out.println("Hello");
    }

    public String toString() {
        return "Species: " + species + " numLegs: " + numLegs + " age: " + age;
    }
}
