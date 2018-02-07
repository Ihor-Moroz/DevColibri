public class People {

    String name;
    String surname;
    int age;
    Cat cat;

    @Override
    public String toString() {
        return "People[Ім'я-" + name +","+"Прізвище-"+surname+","+"Вік-"+ age+","+"Кіт-" +cat+"]";
    }
}
