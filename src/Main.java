import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy;
        double kilo;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz:");
        boy = keyboard.nextDouble();
        System.out.print("Kilonuzu kg cinsinden giriniz:");
        kilo = keyboard.nextDouble();

        double VucutKitleIndex;
        VucutKitleIndex = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz " + VucutKitleIndex + "'dir.");






    }
}