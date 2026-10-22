package lt.vcd;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Įveskite metus: ");
        int year = scanner.nextInt();

        // Tikrinam ar keliamieji
        // Jei tai šimtmečio metai, turi dalintis iš 400. Jei ne šimtmečio - iš 4.
        boolean isLeap = false;

        if (year % 400 == 0) {
            isLeap = true;
        } else if (year % 100 == 0) {
            isLeap = false;
        } else if (year % 4 == 0) {
            isLeap = true;
        }

        if (isLeap) {
            System.out.println(year + " metai yra keliamieji (leap year).");
        } else {
            System.out.println(year + " metai nėra keliamieji (non-leap year).");
        }

        scanner.close();
    }
}
