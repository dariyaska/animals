public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Meat", "Home", "Labrador"),
                new Cat("Fish", "House", "Black"),
                new Horse("Grass", "Farm", "Thoroughbred")
        };

        Veterinary vet = new Veterinary();

        for (Animal animal : animals) {
            vet.treatAnimal(animal);
        }
    }
}