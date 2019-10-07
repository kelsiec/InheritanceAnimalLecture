public class Main {
    public static void main(String[] args) {
        Cat myKitten = new Cat();
        Cat adultCat = new Cat(7);


        System.out.println(myKitten);
        System.out.println(adultCat);

        myKitten.makeNoise();

        Dog myDog = new Dog(4);
        myDog.makeNoise();
        myDog.dig();

        YappyDog yapper = new YappyDog();
        System.out.println(yapper.getSpecies());
        yapper.makeNoise();
        yapper.dig();

        Animal yapper1 = new YappyDog();
        System.out.println(yapper1.getSpecies());
        yapper1.makeNoise();

//        yapper1.dig(); // Compiler error!

        Dog yapper2 = new YappyDog();
        System.out.println(yapper2.getSpecies());
        yapper2.makeNoise();
        yapper2.dig();
    }
}
