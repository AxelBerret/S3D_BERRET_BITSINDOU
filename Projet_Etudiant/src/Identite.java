public class Identite {
    private String NIP;
    private String nom;
    private String prenom;

    /**
     * Constructeur de la classe Identite
     */
    public Identite(String num, String n, String p) {
        this.NIP = num;
        this.nom = n;
        this.prenom = p;
    }

    /**
     * getter du NIP
     */
    public String getNIP() {
        return this.NIP;
    }

    /**
     * getter du nom
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * getter du prenom
     */
    public String getPrenom() {
        return this.prenom;
    }
}