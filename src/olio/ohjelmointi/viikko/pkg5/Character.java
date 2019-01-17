package olio.ohjelmointi.viikko.pkg5;

import java.util.Scanner;

public class Character {

    int hahmonro;
    int asenro;
    String hahmo;
    String ase;

    public Character() {
        Scanner sc = new Scanner(System.in);
        int n;

        do {

            System.out.print("*** TAISTELUSIMULAATTORI ***\n"
                    + "1) Luo hahmo\n"
                    + "2) Taistele hahmolla\n"
                    + "0) Lopeta\n"
                    + "Valintasi: ");
            n = sc.nextInt();
            if (n == 1) {
                System.out.print("Valitse hahmosi: \n"
                        + "1) Kuningas\n"
                        + "2) Ritari\n"
                        + "3) Kuningatar\n"
                        + "4) Peikko\n"
                        + "Valintasi: ");
                hahmonro = sc.nextInt();
                if (hahmonro == 1) {
                    hahmo = "King";
                }
                if (hahmonro == 2) {
                    hahmo = "Knight";
                }
                if (hahmonro == 3) {
                    hahmo = "Queen";
                }
                if (hahmonro == 4) {
                    hahmo = "Troll";
                }
                System.out.print("Valitse aseesi: \n"
                        + "1) Veitsi\n"
                        + "2) Kirves\n"
                        + "3) Miekka\n"
                        + "4) Nuija\n"
                        + "Valintasi :");
                asenro = sc.nextInt();
                if (asenro == 1) {
                    ase = "Knife";
                }
                if (asenro == 2) {
                    ase = "Axe";
                }
                if (asenro == 3) {
                    ase = "Sword";
                }
                if (asenro == 4) {
                    ase = "Club";
                }
            }
            if (n == 2) {
                System.out.println(hahmo + " tappelee aseella " + ase);
            }
        } while (n != 0);
    }
}
