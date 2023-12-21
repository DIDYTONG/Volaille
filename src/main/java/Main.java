import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Elevage elevage = new Elevage();


        //Initialisation de l'élevage

        Poulet poulet1 = new Poulet(1, 1, "P1");
        Poulet poulet2 = new Poulet(2, 2, "P2");
        Poulet poulet3 = new Poulet(3, 3, "P3");
        Poulet poulet4 = new Poulet(4, 4, "P4");
        Poulet poulet5 = new Poulet(5, 5, "P5");

        Canard canard1 = new Canard(1, 1, "C1");
        Canard canard2 = new Canard(2, 2, "C2");
        Canard canard3 = new Canard(3, 3, "C3");
        Canard canard4 = new Canard(4, 4, "C4");
        Canard canard5 = new Canard(5, 5, "C5");

        Scanner scanner = new Scanner(System.in);

        System.out.println(Poulet.getPrixJour());
        System.out.println(Canard.getPrixJour());

        //Récupération des poids d'abattages
        System.out.print("Saisissez le poids d'abattage des poulets : ");
        double poidsAbattagePoulet = scanner.nextInt();
        Poulet.setPoidsAbattage(poidsAbattagePoulet);


        System.out.print("Saisissez le poids d'abattage des canards : ");
        double poidsAbattageCanard = scanner.nextInt();
        Canard.setPoidsAbattage(poidsAbattageCanard);


        //Récupération des poids des volailles
        System.out.print("Saisissez le prix du jour des poulets (en euros/kilo) : ");
        double prixJourPoulet = scanner.nextInt();
        Poulet.setPrixJour(prixJourPoulet);

        System.out.print("Saisissez le prix du jour des canards (en euros/kilo) : ");
        double prixJourCanard = scanner.nextInt();
        Canard.setPrixJour(prixJourCanard);

        //ajout des poulets
        elevage.ajouterPoulets(poulet1);
        elevage.ajouterPoulets(poulet2);
        elevage.ajouterPoulets(poulet3);
        elevage.ajouterPoulets(poulet4);
        elevage.ajouterPoulets(poulet5);

        //ajout des canards
        elevage.ajouterCanards(canard1);
        elevage.ajouterCanards(canard2);
        elevage.ajouterCanards(canard3);
        elevage.ajouterCanards(canard4);
        elevage.ajouterCanards(canard5);


        //elevage.trierEtAbattrePoulet();
        elevage.trierEtAbattreCanard();
        elevage.trierEtAbattrePoulet();

        System.out.println("Total du prix des canards : " + elevage.trierEtAbattreCanard());
        System.out.println("Total du prix des poulets : " + elevage.trierEtAbattrePoulet());
        System.out.println("Prix total : " + elevage.trierEtAbattreCanard() + elevage.trierEtAbattrePoulet());
    }
}