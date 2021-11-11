public class Homeworkwebinar2 {

    public static void main(String[] args) {
        printAge((byte) 30);
        System.out.println(squareNumber(353));
        System.out.println(threeNumbers(5, 7, 10));
        printCircleParameters(10);

        System.out.println(Math.pow(2, 4));
        System.out.println(Math.pow(3, 2));
        System.out.println(Math.pow(5, 1));
        System.out.println(toThirdPower(10));
        System.out.println(squareroot(25));


    }

    public static void printAge(byte age) { //1
        System.out.println(age);
    }

    public static long squareNumber(int number) { //2
        return (number * number);

    }

    public static int threeNumbers(int a, int b, int c) { //3
        return (a + b + c);
    }

    //4: Aplikacja pozwalająca stworzyć mi wymarzonego monstera

//    String monsterColour = "fioletowy";
//    boolean monsterHasEars = "true";
//    byte monsterlegs = "8";
//    String monsterName1 = "Hermenegilda";
//    int monstereyes = "150";

    //5

    public static void printCircleParameters(int r) {
        System.out.println(2 * Math.PI * r);
        System.out.println(Math.PI * r * r);
    }
    //6

    public static double toThirdPower(double number) {
        return (double) Math.pow(number, 3);
    }

    public static double squareroot(double number) {
        return (double) Math.pow(number, 0.5);
    }


}
