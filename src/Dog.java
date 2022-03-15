public class Dog extends Animal{
    private boolean walked;
    private boolean teachSit;

    public Dog(String name, int age, boolean vaccinated, double weight){
        super(name, age, vaccinated, weight);
        walked = false;
        teachSit = false;
    }

    public void walk(){
        walked = true;
        System.out.println(getName() + " is getting walked.");
    }

    public void learnHowToSit(){
        teachSit = true;
        System.out.println(getName() + " knows how to sit!");
    }

    public boolean getTeachSit(){
        return teachSit;
    }

    public boolean hasBeenWalked(){
        return walked;
    }
}
