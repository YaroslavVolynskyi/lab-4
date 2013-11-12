package lab4;

public class Yard {

    private IAnimal walkingAnimal;

    public void setAnimal(IAnimal animal){
        this.walkingAnimal = animal;
    }

    public String getInfo(){
        if (walkingAnimal != null){
            return walkingAnimal.info();
        }
        return "yard is empty";
    }
}
