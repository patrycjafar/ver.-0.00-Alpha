import java.util.Scanner;
import java.util.InputMismatchException;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Wprowadzenie pierwszej liczby
        System.out.println("Podaj pierwsza liczbe: ");
        int pierwszaLiczba;
        try {
            pierwszaLiczba = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wprowadzono nieprawidłowe dane. Wprowadź liczbę całkowitą.");
            return;
        }

        // Wprowadzenie operatora matematycznego
        System.out.println("Podaj operator (+, -, *, /, =): ");
        String operator = scanner.next();

        // Wprowadzenie drugiej liczby
        System.out.println("Podaj druga liczbe: ");
        int drugaLiczba;
        try {
            drugaLiczba = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wprowadzono nieprawidłowe dane. Wprowadź liczbę całkowitą.");
            return;
        }

        // Obliczenia na podstawie operatora
        //System.out.println("Wynik:");
        int wynik;

        switch (operator) {
            case "+":
                // Dodawanie
                wynik = pierwszaLiczba + drugaLiczba;
                System.out.println(wynik);
                break;
            case "-":
                // Odejmowanie
                wynik = pierwszaLiczba - drugaLiczba;
                System.out.println(wynik);
                break;
            case "*":
                // Mnożenie
                wynik = pierwszaLiczba * drugaLiczba;
                System.out.println(wynik);
                break;
            case "/":
                // Dzielenie zabezpieczone przed dzieleniem przez zero h
                if (drugaLiczba != 0) {
                    wynik = pierwszaLiczba / drugaLiczba;
                    System.out.println(wynik);
                } else {
                    System.out.println("Nie można dzielić przez zero.");
                }
                break;
            case "=":
                if(pierwszaLiczba == drugaLiczba){
                    System.out.println("Liczby są równe.");
                }else{
                    System.out.println("liczby nie są równe.");
                }
                break;
            default:
                // Obsługa nieprawidłowego operatora
                System.out.println("Nieprawidłowy operator.");
        }
    }
}
