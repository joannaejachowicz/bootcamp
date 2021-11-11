public class Class3 {
    public static void main(String[] args) {
        printHello();

        printName("Ania");
        printName("Kamil");
        printName("Asia");


    }

    public static void printHello() {//nic nie zwraca i nie przyjmuje argumentow
        System.out.println("Hello");

    }

    public static void printName(String name) {// nic nie zwraca, przyjmuje jeden argument
        System.out.println("Hello " + name);
    }

    public static double sum(double firstNumber, double secondNumber) {
        double sum = firstNumber + secondNumber;
        return sum;
    }
    //dobra praktyka
    public static double sum2(double firstNumber, double secondNumber){
        return firstNumber+secondNumber;
    }


}
