abstract class Volaille {
    private String numeroIdentification;
    private int id;
    private double poids;
    private double prixParKilo;

    public Volaille(int id, double poids, double prixParKilo, String numeroIdentification) {
        this.id = id;
        this.poids = poids;
        this.prixParKilo = prixParKilo;
        this.numeroIdentification = numeroIdentification;
    }

    public double calculerPrix() {
        return poids * prixParKilo;
    }

    public double getPoids() {
        return poids;
    }

    public String getNumeroIdentification() {
        return numeroIdentification;
    }

    public void setNumeroIdentification(String numeroIdentification) {
        this.numeroIdentification = numeroIdentification;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public double getPrixParKilo() {
        return prixParKilo;
    }

    public void setPrixParKilo(double prixParKilo) {
        this.prixParKilo = prixParKilo;
    }
}
