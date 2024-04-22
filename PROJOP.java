import java.util.Scanner;
import java.util.InputMismatchException;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("chcesz skorzystać z prostego kalkulatora czy wzoru? kal/wzor");
        String wybor = scanner.next().toLowerCase();


        if (!wybor.equals("wzor")) {

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
            System.out.println("Wynik:");
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
                    // Dzielenie zabezpieczone przed dzieleniem przez zero
                    if (drugaLiczba != 0) {
                        wynik = pierwszaLiczba / drugaLiczba;
                        System.out.println(wynik);
                    } else {
                        System.out.println("Nie można dzielić przez zero.");
                    }
                    break;
                case "=":
                    if (pierwszaLiczba == drugaLiczba) {
                        System.out.println("Liczby są równe.");
                    } else {
                        System.out.println("liczby nie są równe.");
                    }
                    break;
                default:
                    // Obsługa nieprawidłowego operatora
                    System.out.println("Nieprawidłowy operator.");
            }

        }else{
            System.out.println("Który wzór?");
            System.out.println("1. Delta");
            System.out.println("2. Pole kwadratu");
            System.out.println("3. Pole prostokąta");
            System.out.println("4. Pole koła");
            System.out.println("5. Pole trójkąta");
            System.out.println("6. Pole rombu");
            System.out.println("7. Pole trapezu");
//           DELTA

            int ktoryWzor = scanner.nextInt();

            int wynik;
            double wynikD;
            double x1;
            double x2;

            switch(ktoryWzor){
                case 1:
                    System.out.println("Podaj a:");
                    int a = scanner.nextInt();
                    System.out.println("Podaj b:");
                    int b = scanner.nextInt();
                    System.out.println("Podaj c:");
                    int c = scanner.nextInt();


                    wynik = b*b - 4*a*c;
                    System.out.println(wynik);

                    if(wynik > 0){
                        System.out.println("Policzmy miejsca zerowe");
                        x1 = (-b - Math.sqrt(wynik))/2*a;
                        x2 = (-b + Math.sqrt(wynik))/2*a;
                        System.out.println("Pierwsze miejsce zerowe to:" + x1);
                        System.out.println("Drugie miejsce zerowe to:" + x2);
                    }else if(wynik == 0){
                        System.out.println("Delta wyszła 0 więc będzie tylko jedno miejsce zerowe:");
                        x1 = -b / 2*a;
                        System.out.println("Miejsce zerowe to:" + x1);
                    }else{
                        System.out.println("Delta ujemna. Nie ma miejsc zerowych.");
                    }
                break;
                case 2:
                    System.out.println("Podaj a:");
                    int ak = scanner.nextInt();

                    wynik = ak * ak;
                    System.out.println(wynik);
                break;
                case 3:
                    System.out.println("Podaj a:");
                    int ap = scanner.nextInt();
                    System.out.println("Podaj b:");
                    int bp = scanner.nextInt();

                    wynik = ap * bp;
                    System.out.println(wynik);
                break;
                case 4:
                    System.out.println("Podaj r:");
                    double r = scanner.nextInt();

                    wynik = (int) (Math.PI*r*r);
                    System.out.println(wynik);
                break;
                case 5:
                    System.out.println("Podaj b (podstawę): ");
                    int bt = scanner.nextInt();
                    System.out.println("Podaj h:");
                    int ht = scanner.nextInt();

                    wynikD = 0.5 * bt * ht;
                    System.out.println(wynikD);
                break;
                case 6:
                    System.out.println("Podaj d1 (przekątną):");
                    double d1 = scanner.nextInt();
                    System.out.println("Podaj d2:");
                    double d2 = scanner.nextInt();

                    wynikD = 0.5 * d1 * d2;
                    System.out.println(wynikD);
                break;
                case 7:
                    System.out.println("Podaj a:");
                    double atr = scanner.nextInt();
                    System.out.println("Podaj b:");
                    double btr = scanner.nextInt();
                    System.out.println("Podaj h:");
                    double htr = scanner.nextInt();

                    wynikD = 0.5 * (atr+btr)*htr;
                    System.out.println(wynikD);
            }
        }
    }
}
