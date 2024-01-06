public class Horse extends Animal {
    private String breed;

    public Horse(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("The horse is neighing");
    }

    @Override
    public void eat() {
        System.out.println("The horse is eating " + food);
    }
}
