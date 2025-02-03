import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite neki broj.");
        int broj = 0;
        try {
            broj = scanner.nextInt();
        }
        catch (Exception InputMismatchException) {
            System.out.println("Nevaljan unos");
        }

        scanner.nextLine();
        System.out.println("Unesite svoje ime:");
        String ime = scanner.nextLine();
        System.out.println(ime + broj);


        //1. Napišite program koji traži unos 2 cijela broja i prikazuje na ekranu njihov zbroj i umnožak.
        //2. Napišite program koji traži unos godine i ispisuje je li ta godina prijestupna ili ne.
        // Godina je prijestupna ako je djeljiva sa 4, nije djeljiva sa 100, osim ako je djeljiva sa 400
        System.out.println("Unesi dva cijela broja");
        System.out.println("Prvi:");
        int prvi = scanner.nextInt();
        System.out.println("Drugi:");
        int drugi = scanner.nextInt();
        System.out.printf("%s + %s = %s\n%s * %s = %s", prvi, drugi, prvi+drugi, prvi, drugi, prvi*drugi);
        System.out.println();

        int godina =0;
        while (godina != 100) {
            System.out.println("Unesite godinu");
            godina = scanner.nextInt();

            boolean prijestupna = false;

            if (godina % 4 == 0) {
                if (godina % 400 == 0) {
                    prijestupna = true;
                } else prijestupna = godina % 100 != 0;
            }
            if (prijestupna) {
                System.out.println("Godina je prijestupna");
            } else {
                System.out.println("Godina nije prijestupna");
            }
        }

        //Integer.parseInt(scanner.nextLine()); pretvorit liniju u broj ako moze
        scanner.close();
    }
}