class Poulet extends Volaille {

    //Definition des variables
    private static double poidsAbattage = 0;
    private static double prixJour = 0;


    public Poulet(int id, double poids, String numeroIdentification) {
        super(id, poids, numeroIdentification);
    }


    public static void setPoidsAbattage(double poidsAbattage) {
        Poulet.poidsAbattage = poidsAbattage;
    }

    public static double getPoidsAbattage() {
        return Poulet.poidsAbattage;
    }

    public static void setPrixJour(double prixJour) {
        Poulet.prixJour = prixJour;
    }

    public static double getPrixJour() {
        return Poulet.prixJour;
    }
}