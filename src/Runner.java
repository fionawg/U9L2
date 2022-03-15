public class Runner {
    public static void main(String[] args) {
        Animal ex1 = new Animal("Tofu", 5, true, 50.5);
        ex1.adopt();
        ex1.feed();
        ex1.checkUp();
        System.out.println(ex1.getName());
        System.out.println(ex1.getAge());
        System.out.println(ex1.getVaccinated());
        System.out.println(ex1.getWeight());

        Dog ex2 = new Dog("Emma", 6, false, 64.8);
        ex2.adopt();
        ex2.feed();
        ex2.checkUp();
        ex2.walk();
        ex2.learnHowToSit();
        System.out.println(ex2.getTeachSit());
        System.out.println(ex2.hasBeenWalked());
        System.out.println(ex2.getName());
        System.out.println(ex2.getAge());
        System.out.println(ex2.getVaccinated());
        System.out.println(ex2.getWeight());

        Cat ex3 = new Cat("Jordan", 2, false, 27.3);
        ex3.adopt();
        ex3.feed();
        ex3.checkUp();
        ex3.play();
        ex3.hasCleanedLitter();
        System.out.println(ex3.hasPlayedWith());
        System.out.println(ex3.getCleanedLitter());
        System.out.println(ex3.getName());
        System.out.println(ex3.getAge());
        System.out.println(ex3.getVaccinated());
        System.out.println(ex3.getWeight());
    }
}
