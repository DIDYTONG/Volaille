import java.lang.invoke.VolatileCallSite;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Elevage {
    private List<Poulet> poulets;
    private List<Canard> canards;

    private List<Volaille> volaillesList;

    public Elevage() {
        this.poulets = new ArrayList<>();
        this.canards = new ArrayList<>();
        this.volaillesList = new ArrayList<>();
    }

    public void ajouterPoulets(Poulet poulet) {
        poulets.add(poulet);
    }

    public void ajouterCanards(Canard canard) {
        canards.add(canard);
    }

    public List<Volaille> getVolaillesList() {
        return volaillesList;
    }

    public double trierEtAbattreCanard() {
        double prixCannard = 0;

        System.out.println("Canard à abattre :");
        for (Canard canard : canards) {
            if (canard.getPoidsAbattage() <= canard.getPoids()){
                System.out.println(canard);
                prixCannard += canard.getPoids();
                //volaillesList.add(canard);
            }
        }
        return prixCannard;
    }

    //récupéré poids des canards, les additionner et multiplier le tout pour prix des canards au kilo
    //récupéré poids des poulets, les additionner et multiplier le tout pour prix des poulets au kilo

    public double trierEtAbattrePoulet() {
        double prixPoulet = 0;
        System.out.println("Poulets à abattre :");
        for (Poulet poulet : poulets) {
            if (poulet.getPoidsAbattage() <= poulet.getPoids()){
                System.out.println(poulet);
                prixPoulet += poulet.getPoids();
            }
        }
        return prixPoulet;
    }




}

