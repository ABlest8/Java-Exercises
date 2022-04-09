package animal;

public class Pigeon extends Bird{
    String species;

    Pigeon(){
        super();
        species = "NN";
    }

    public Pigeon(String name, int age, int weight, String featherColor, String species) {
        super(name, age, weight, featherColor);
        this.species = species;
    }
    public void attitude(){
        System.out.println("The bird is flying.");
    }

    @Override
    public void drinkWater(){
        System.out.println("The bird is drinking water.");
    }

    @Override
    public void getVoice() {
        System.out.println("The bird is chirps.");
    }

    @Override
    public void eat(String food) {
        System.out.println("The bird is eating" + food);
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString()
    {
        return "Dog{"+"species='"+species+'\''+'}';
    }
}
