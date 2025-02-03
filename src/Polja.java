import java.util.Arrays;

public class Polja {
    static void Ispisi(int[] polja) {
        for (int i = 0; i < polja.length; i++) {
            System.out.printf("%s. element polja: %s\n" , i+1, polja[i]);
        }
        System.out.println();
    }

    public static void main(String args[]) {
        int[] brojevi = new int[5];
        brojevi[0] = 1;
        brojevi[1] = 2;
        brojevi[2] = 4;
        brojevi[3] = 5;
        brojevi[4] = 3;
        System.out.println(brojevi[4]);
        for (int i : brojevi) {
            System.out.println(i);
        }
        System.out.println(brojevi.length);

        Ispisi(brojevi);

        Arrays.sort(brojevi);
        System.out.println("Poslozeno");

        Ispisi(brojevi);

        Arrays.fill(brojevi, 10);
        Ispisi(brojevi);

        for (int i = 0; i < brojevi.length; i++) {
            brojevi[i] = i + 1;
        }

        Ispisi(brojevi);

        for (int i = 0; i < brojevi.length/2; i++) {
            int pom1 = brojevi[i];
            brojevi[i] = brojevi[brojevi.length -i -1];
            brojevi[brojevi.length -i -1] = pom1;
        }

        Ispisi(brojevi);


    }


}
