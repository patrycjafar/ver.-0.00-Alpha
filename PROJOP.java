package zadania;
import java.util.Scanner;

public class kalkulator {
    public static <string> void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbe: ");
        int liczba = scanner.nextInt();

        System.out.println("Podaj znak: ");
        String znak = scanner.next();

        System.out.println("Podaj druga liczbe: ");
        int druga = scanner.nextInt();

        System.out.println("Wynik:");
        int wynik;

        boolean cofnięcie;



        switch (znak){
            case "+" :
                wynik = liczba + druga;
                System.out.println(wynik);
                break;
            case "-" :
                wynik = liczba - druga;
                System.out.println(wynik);
                break;
            case "*":
                wynik = liczba * druga;
                System.out.println(wynik);
                break;
            case "/":
                wynik = liczba / druga;
                System.out.println(wynik);
                break;
        }
    }
}
