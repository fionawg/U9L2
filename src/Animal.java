public class Animal {
    private String name;
    private int age;
    private boolean vaccinated;
    private double weight;

    public Animal(String name, int age, boolean vaccinated, double weight){
        this.name = name;
        this.age = age;
        this.vaccinated = vaccinated;
        this.weight = weight;
    }

    public void adopt(){
        System.out.println(name + " has been adopted!");
    }

    public void feed(){
        System.out.println(name + " has been fed!");
    }

    public void checkUp(){
        System.out.println(name + " is healthy!");
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public boolean getVaccinated(){
        return vaccinated;
    }

    public double getWeight(){
        return weight;
    }
}
