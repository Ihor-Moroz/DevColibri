public class Main {

    public static void main(String... args) {
        //static-можна стукатись до поля без оголошення екземпляру класу
        //також методи та поля класу з модивікатором static не будуть доступні екземплярам класу
        //System.out.println(ExampleStatic.example);
        ExampleMethod ex1=new ExampleMethod();
        String s1=ex1.getHelloWorld();
        String s2=ex1.getHelloWorld(3);
        String s3=ex1.getHelloWorld("ZZ");
        System.out.println(s1+s2+s3);

    }
}
