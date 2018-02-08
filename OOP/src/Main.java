import devCat.Cat;
import devPeople.People;

public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {

        cat=new Cat("John",2,"Brodyaga");
        people=new People("Ihor", "Moroz", 20, cat);
        //extence-наслідування
    }
}
