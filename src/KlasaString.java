import javax.management.relation.InvalidRelationTypeException;
import javax.swing.text.Style;
import java.util.Scanner;

public class KlasaString {
    public static void main(String[] args) {
        String nizZnakova = "Danas je cetvrtak";
        System.out.println(nizZnakova);
        String[] znakovi = new String[5];
        for (String s : znakovi) {
            System.out.println(s);
        }

        System.out.println("Trece slovo je "+ nizZnakova.charAt(2));
        System.out.println("Velicina je " + nizZnakova.length());
        System.out.println("index of \"a\" " + nizZnakova.indexOf("a"));
        System.out.println("indexoOf \"ce\" " + nizZnakova.indexOf("ce"));

        System.out.println("Split ' ':");
        for (String s : nizZnakova.split(" ")) {
            System.out.println(s);
        }

        System.out.println("startsWith \"Da\" :" + nizZnakova.startsWith("Da"));
        System.out.println("substring(2,5) :" + nizZnakova.substring(2,5));


        //Domaci istrazivanje ostalih metoda trada sa stringom

        "aA".equals("aA");

        String naziv1 = "Perica";
        String naziv = new String("Perica");
        System.out.println(naziv1.equals(naziv));
        System.out.println(naziv1 == naziv);

        /// : //          Zadatak 1: Domaće istraživanje ostalih metoda rada sa Stringom: https://www.w3schools.com/java/ref_string_replace.asp
        /// //          Zadatak 2: Napišite program koji ispisuje je li uneseni broj savršen ili ne. Savršen broj je broj koji je jednak zbroju svojih djelitelja (bez njega samoga). Npr. 6 (1 + 2 + 3 = 6)
        /// //          Zadatak 3: Unijeti u program broj ocjena po želji, ispisati prosjek ocjena. (int brojGodina = Integer.parseInt(sc.nextLine());)

        // ZADATAK 2
        int n = 6;
        int zbrojDjelitelja = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                zbrojDjelitelja += i;
            }
        }
        if (zbrojDjelitelja == n) {
            System.out.println("Broj je savršen");
        }
        else {
            System.out.printf("Broj %s nije savršen\n", n);
        }

        // ZADATAK 3
        int brojOCjena = 10;
        double prosjek = 0;
        int zbroj = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite zeljeni broj ocjena");
        brojOCjena = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= brojOCjena; i++) {
            System.out.println("Unesite ocjenu");
            zbroj += Integer.parseInt(scanner.nextLine());
        }
        prosjek = (double)zbroj / brojOCjena;
        System.out.println("prosjek je "+prosjek);
    }
}
