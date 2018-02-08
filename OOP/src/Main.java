import devCat.Cat;
import devPeople.People;
import devPeople.Sportsman;
import impl.DriverBus;
import impl.Transport;

public class Main {

    static Cat cat;
    static People people;

    public static void main(String[] args) {

        cat=new Cat("John",2,"Brodyaga");
        people=new People("Ihor", "Moroz", 20, cat);
        //extends-наслідування
        //super-звертання до батьківського класу
        //null-пустота, пам'ять не виділяється
        Sportsman sportsman=new Sportsman("Andriy", "Moroz", 15,null, "Baseball");
        //System.out.println(sportsman);
        //people.sayHello();
        //sportsman.sayHello();
        //cat.eat();
        //DriverBus d=new DriverBus();
        //System.out.println(d.getSpeed());
        //d.go();
        //d.setCategory("B");
        //d.go();
    }
}
