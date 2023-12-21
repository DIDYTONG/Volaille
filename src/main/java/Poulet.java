class Poulet extends Volaille {
    private static double poidsAbattage = 2.5; // Poids d'abattage pour les poulets

    public Poulet(int id, double poids, double prixParKilo, String numeroIdentification) {
        super(id, poids, prixParKilo, numeroIdentification);
    }

    public static double getPoidsAbattage() {
        return poidsAbattage;
    }


}