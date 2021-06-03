package Exercise2;

public class ParentPet {

    int numberOfLegs;
    String name;
    String owner;
    String type;
    String sound;

    public ParentPet(int numberOfLegs, String name, String owner, String type, String sound) {
        this.numberOfLegs = numberOfLegs;
        this.name = name;
        this.owner = owner;
        this.type = type;
        this.sound = sound;
    }

    public void speak(){
        System.out.println(sound);
    }
}

class main {
    public static void main(String[] args) {

        // instans af Exercise2.ParentPet som vi kalder abe
        ParentPet abe = new ParentPet(4, "isabel", "phillip", "brøleAbe", "speak");
        abe.speak();

        //instans af Exercise2.Dog som vi kalder mobs
        Dog mobs = new Dog(4, "ruben", "isabel", "dog", "vow", "mobs");
        System.out.println(mobs.dogRace);

        mobs.speak();
        mobs.sound = "newVow";
        mobs.speak();

        //cat variable
        String catRace = "race";

        //polymorphi
        ParentPet siameser = new Dog(4, "Siameserkat", "isabel", "cat", "miaw", catRace);
        siameser = new Cat(4, "bob", "isabel", "cat", "miaw", catRace);
        Cat bobkat = new Cat(4, "bob", "isabel", "cat", "miaw", catRace);





    }
}

