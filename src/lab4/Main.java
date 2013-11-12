package lab4;

public class Main {

    public static void main(String[] args){
        IAnimal dog = new Dog();
        IAnimal cat = new Cat();

        Yard yard = new Yard();

        Peterson peterson = new Peterson();
        int walks = 1000;

        AnimalOwner dogOwner = new AnimalOwner(peterson, 0, walks);
        dogOwner.setAnimal(dog);
        dogOwner.setYard(yard);

        AnimalOwner catOwner = new AnimalOwner(peterson, 1, walks);
        catOwner.setAnimal(cat);
        catOwner.setYard(yard);

        Thread dogThread = new Thread(dogOwner);
        Thread catThread = new Thread(catOwner);

        dogThread.start();
        catThread.start();

        try {
            dogThread.join();
            catThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
