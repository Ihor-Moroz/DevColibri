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
//ctrl+Space=методи об'єкту
    public static void main(String[] arg){
        variables();
    }

}
