public class Cat extends Animal {
    private String color;

    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    @Override
    public void makeNoise() {
        System.out.println("The cat is meowing");
    }

    @Override
    public void eat() {
        System.out.println("The cat is eating " + food);
    }
}