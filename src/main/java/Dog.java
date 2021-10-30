public class Dog extends Pet {
    // Instance variable(s)
private String breed;

    // Constructors
public Dog (String name, int age, String breed){
    super(name, age);
    this.breed = breed;
}
    public Dog(){
        this.name = "fred";
        this.age = 4;
        this.breed = "Pug";


}

    // makeNoise() method
public void makeNoise(){
    System.out.println("woof woof");
}

    // toString method
public String toString(){
    return( this.getName() + this.getAge() + this.breed);
}

    // Getter
public String getBreed(){
    return breed;
}


    // Setter
    public void setBreed(String newbreed){
    this.breed = newbreed;
    }
}