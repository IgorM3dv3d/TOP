package Ucheba.DZ_57_58.PrinterLambda;

public class Main {
    public static void main(String[] args) {
        Printer print = new Printer() {
            @Override
            public void print(String message) {
                System.out.println("Hello world");
            }
        };
        print.print("");


        Printer print1 = (message) -> System.out.println("Hello World!");
        print1.print("");


        Printable print12 = (m, sm) -> "Hello " + m + (sm + "n");
        System.out.println(
                print12.print("world!!! ", "Длина сообщения - "));
    }
}
