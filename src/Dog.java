public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog is barking");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating " + food);
    }
}
