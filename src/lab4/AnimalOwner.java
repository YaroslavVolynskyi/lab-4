package lab4;

public class AnimalOwner implements Runnable{

    private Peterson peterson;
    private Yard yard;
    private IAnimal animal;
    private int id;
    private int walks;

    public AnimalOwner(Peterson peterson, int id, int walks){
        this.peterson = peterson;
        this.id = id;
        this.walks = walks;
    }

    public void setAnimal(IAnimal animal){
        this.animal = animal;
    }

    public void setYard(Yard yard){
        this.yard = yard;
    }

    public void run(){
        for (int i = 0; i < walks; i++) {
            peterson.lock(id);
            yard.setAnimal(animal);
            System.out.println(yard.getInfo());
            peterson.unlock(id);
        }
    }
}
