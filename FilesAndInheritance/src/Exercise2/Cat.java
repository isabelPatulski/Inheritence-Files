package Exercise2;

public class Cat extends ParentPet {

    String catRace;
    public Cat(int numberOfLegs, String name, String owner, String type, String sound, String catRace) {
        super(numberOfLegs, name, owner, type, sound);
        this.catRace = catRace;
    }


}