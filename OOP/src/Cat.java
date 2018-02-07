public class Cat {

    int age;
    String poroda;
    String name;

    void say(){
        System.out.println("Мяяяяуууу");
    }

    //alt+insert
    @Override
    public String toString() {
        return "Cat[Ім'я-" + name +","+"Порода-"+poroda+","+"Вік-"+ age+"]";
    }
}
