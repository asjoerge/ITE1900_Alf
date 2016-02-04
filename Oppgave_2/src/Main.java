import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Enebolig ebl1 = new Enebolig("Marihaugen 2", "Ole Joan Olsen", 1100000, 204, 23, 400, Enebolig.FRITTSTAAENDE);
        ebl1.nyttBud("Ole Pedersen", 2400000, "90522355", 24);
        ebl1.nyttBud("John McIntosh", 2500000, "90822655", 12);


        //ebl.skrivAlleBud();

        System.out.println("\n");

        Leilighet leil1 = new Leilighet("Marihaugen 2", "Ole Joan Olsen", 900000, 204, 23, 400, 250000, 3500, 2);
        leil1.nyttBud("Ole Pedersen", 1400000, "90522355", 24);
        leil1.nyttBud("John McIntosh", 1500000, "90822655", 12);

        Leilighet leil2 = new Leilighet("Nøstgata 6B", "Alf-Sigurd Jørgensen", 2000000, 65, 12, 123, 0, 0, 2);
        leil2.nyttBud("Anette Gjertsen", 1900000, "12345678", 12);
        //leil.skrivAlleBud();

        System.out.println("Eiendom");

        ArrayList<Eiendom> eiendomSok = new ArrayList<Eiendom>();

        eiendomSok.add(ebl1);
        eiendomSok.add(leil1);
        eiendomSok.add(leil2);


        int gnr;
        int bnr;

        while (true) {
            int command = 0;
            System.out.print("1. Søk Bnr og Gnr, 2. Avslutt\n: ");
            command = input.nextInt();
            if (command == 1) {
                if (eiendomSok.size() > 0) {
                    System.out.println();
                    System.out.printf("Skriv inn Gnr:");
                    gnr = input.nextInt();
                    System.out.printf("Skriv inn Bnr:");
                    bnr = input.nextInt();
                    for (Eiendom e : eiendomSok) {
                        if(e.getBnr() == bnr && e.getGnr() == gnr) {
                            e.skrivAlleBud();
                        }
                    }


                } else if (command == 2) {
                    System.exit(0);
                }
            }


        }

        }
    }
