public class TestVehicules {

    public static void main(String[] args) {
        Voiture voiture = new Voiture("Renault", 15000.0, "Clio", 2018);
        Moto moto = new Moto("Yamaha", 8000.0, "Yamaha", 75);
        Avion avion = new Avion("Tesla", 100000000.0, "Tesla", 988.0);

        voiture.emettreSon();
        voiture.afficherInformations();
        System.out.println();

        moto.emettreSon();
        moto.afficherInformations();
        System.out.println();

        avion.emettreSon();
        avion.afficherInformations();
    }
}
