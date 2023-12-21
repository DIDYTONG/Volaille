class Canard extends Volaille {

    //Definition des variables
    private static double poidsAbattage = 0;
    private static double prixJour = 0;


    public Canard(int id, double poids, String numeroIdentification) {
        super(id, poids, numeroIdentification);
    }



    public static void setPoidsAbattage(double poidsAbattage) {
        Canard.poidsAbattage = poidsAbattage;
    }

    public double getPoidsAbattage() {
        return poidsAbattage;
    }

    public static void setPrixJour(double prixJour) {Canard.prixJour = prixJour; }

    public static double getPrixJour() {
        return Canard.prixJour;
    }


}