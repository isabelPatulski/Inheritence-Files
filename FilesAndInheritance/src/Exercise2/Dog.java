package Exercise2;

public class Dog extends ParentPet {

    String dogRace;

    public Dog(int numberOfLegs, String name, String owner, String type, String sound, String dogRace) {
        // constructor fra parent
        super(numberOfLegs, name, owner, type, sound);
        this.dogRace = dogRace;
    }


    // this method is inherited
/*
    public void speak(){
        System.out.println(sound);
    }
*/

}
