public class Cat extends Animal{
    private boolean played;
    private boolean cleanedLitter;

    public Cat(String name, int age, boolean vaccinated, double weight){
        super(name, age, vaccinated, weight);
        played = false;
        cleanedLitter = false;
    }

    public void play(){
        played = true;
        System.out.println(getName() + " is playing with the staff.");
    }

    public void hasCleanedLitter(){
        cleanedLitter = true;
        System.out.println("The litter box is cleaned and ready to go!");
    }

    public boolean hasPlayedWith(){
        return played;
    }

    public boolean getCleanedLitter(){
        return cleanedLitter;
    }
}
