import devCat.Cat;
import devPeople.People;

public class Main {

    static Cat cat= new Cat();
    static People people=new People();

    public static void main(String[] args) {
        cat.setName("John");
        cat.setAge(3);
        cat.setPoroda("Brodyaga");

        people.setName("Ihor");
        people.setSurname("Surname");
        people.setAge(20);
        people.setCat(cat);

        System.out.println(people);
        people.getCat().say();
    }
}
