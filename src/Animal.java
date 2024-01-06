public class Animal {
    protected String food;
    protected String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise() {
        System.out.println("The animal is making noise");
    }

    public void eat() {
        System.out.println("The animal is eating " + food);
    }

    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}