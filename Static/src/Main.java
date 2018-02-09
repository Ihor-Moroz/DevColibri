public class Main {

    public static void main(String... args) {
        //static-можна стукатись до поля без оголошення екземпляру класу
        //також методи та поля класу з модивікатором static не будуть доступні екземплярам класу
        ExampleStatic es1=new ExampleStatic();
        System.out.println(ExampleStatic.example);
        System.out.println(ExampleStatic.getHelloWorld());
    }
}
