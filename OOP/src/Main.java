public class Main {

    static Cat cat= new Cat();
    static People people=new People();

    public static void main(String[] args) {
        cat.name="John";
        cat.age=3;
        cat.poroda="Brodyaga";

        people.name="Ihor";
        people.surname="Surname";
        people.age=20;
        people.cat=cat;

        System.out.println(people);
        cat.say();
        people.cat.say();
    }
}
