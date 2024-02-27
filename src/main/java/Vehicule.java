public class Vehicule {

        protected String nom;
        protected double prix;
    protected String marque;

    public Vehicule(String nom, double prix) {
            this.nom = nom;
            this.prix = prix;
        }

        public void emettreSon() {
            System.out.println("Le véhicule émet un son inconnu.");
        }

        public void afficherInformations() {
            System.out.println("Nom du véhicule : " + nom);
            System.out.println("Prix du véhicule : " + prix + " euros");
        }
    }

    class Voiture extends Vehicule {
        private String modele;
        private int annee;

        public Voiture(String nom, double prix, String modele, int annee) {
            super(nom, prix);
            this.modele = modele;
            this.annee = annee;
        }

        @Override
        public void emettreSon() {
            System.out.println("La voiture vrombit.");
        }

        @Override
        public void afficherInformations() {
            super.afficherInformations();
            System.out.println("Modèle de la voiture : " + modele);
            System.out.println("Année de la voiture : " + annee);
        }
    }

    class Moto extends Vehicule {
        private int puissance;

        public Moto(String nom, double prix, String marque, int puissance) {
            super(nom, prix);
            this.marque = marque;
            this.puissance = puissance;
        }

        @Override
        public void emettreSon() {
            System.out.println("La moto rugit.");
        }

        @Override
        public void afficherInformations() {
            super.afficherInformations();
            System.out.println("Marque de la moto : " + marque);
            System.out.println("Puissance de la moto : " + puissance + " chevaux");
        }
    }

    class Avion extends Vehicule {
        private String compagnie;
        private double vitesseMax;

        public Avion(String nom, double prix, String compagnie, double vitesseMax) {
            super(nom, prix);
            this.compagnie = compagnie;
            this.vitesseMax = vitesseMax;
        }

        @Override
        public void emettreSon() {
            System.out.println("L'avion fait un bruit de moteur puissant.");
        }

        @Override
        public void afficherInformations() {
            super.afficherInformations();
            System.out.println("Compagnie de l'avion : " + compagnie);
            System.out.println("Vitesse maximale de l'avion : " + vitesseMax + " km/h");
        }
    }


