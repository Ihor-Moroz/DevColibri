package First;
public class Main {

    static byte b=8;
    static short sh=16;
    static int it =32;
    static long lg=64;

    static float fl=32.0f;
    static double dl=64.0;

    static boolean bt=true;
    static boolean bf=false;

    static String str="String";
    static char ch='c';
    //значееня це розмір у байтах

    public static void variables(){
        System.out.println("Byte: " + b);
        System.out.println("Short: " + sh);
        System.out.println("Integer: " + it);
        System.out.println("Long: " + lg);
        System.out.println("Float: " + fl);
        System.out.println("Double: " + dl);
        System.out.println("Boolean: " + bt);
        System.out.println("Boolean: " + bf);
        System.out.println("String: " + str);
        System.out.println("Char: " + ch);
    }
    /*ctrl+Space=методи об'єкту
ctrl+D=копіювати поточний рядок
ctrl+Y=Видалити поточний рядок*/

    static final int CONST=55;//final-константа

    static int ai=2;
    static double bi=2.9;
    static char d='0';

    static Integer inc=16;
    static Float flc=32.0f;
    static Double dlc=64.0;
    static Short shc=8;
    static String strc="Str";


    public static void main(String[] arg){
        //variables();

        //Приведення типів
        int ci=(int)bi;//обрізає дробову частину
        int cd=(int)d;
        //Number n=new Double(2.2);
        Integer temp1=flc.intValue();
        temp1=dlc.intValue();

        //Математичні функції
        int a=4;
        float b=5.2f;
        double c=Math.PI +Math.abs(a)+ b;

        //Умови
        if(a==3){
            //System.out.println("a=3");
        } else if(a<3) {
            //System.out.println("a<3");
        }else if(a>3){
            //System.out.println("a>3");
        }

        switch(a){
            case 3:
                //System.out.println("3");
                break;
            case 4:
                //System.out.println("4");
                break;
        }
        //Логічні оператори
        //Логічне І - &&
        //Логічне АБО - ||
        //Логічне НЕ - !
        a=10;
        b=4;
        if(a==b || bf) {
            System.out.println("True");
        }

        //Цикли
        for(int i=0; i<10;i++){//доки посередині правда
            //System.out.println(i);
        }

        while(a>0){//Доки в дужках правда
            //System.out.println(a);
            a--;
        }

        String[] st="Hello World, I am Ihor Moroz".split(" ");//поділ строки по значенню regex
        for (String s:st) {//по черзі у змінну "s" будуть поміщені окремі елементи масиву строк "st"
            //System.out.println(s);
        }

        //Рекурсія
        System.out.println(calcSum(-2,2));

        //Масиви
        int[] nums= new int[10];
        nums[0]=10;
        nums[1]=5;
        nums[2]=513;
        nums[3]=15;
        nums[4]=5684;
        nums[5]=5651;
        nums[6]=84;
        nums[7]=13;
        nums[8]=89;
        nums[9]=864;
        for (int i=0;i<nums.length;i++) {
            //System.out.println(i+" : "+nums[i]);
        }
        String[] strs=new String[3];
        strs[0]="Hello";
        strs[1]=" ";
        strs[2]="Ihor";
        for (String s:strs
             ) {
            //System.out.print(s);
        }


    }

        //Функції
        static int calcSum(int a, int b){
        if((a+b)==0) {
            calcSum(1, 1);
        }
        return a+b;
        }
}
