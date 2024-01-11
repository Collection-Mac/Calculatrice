public class Version1 {
    private double nombre1;
    private double nombre2;

    // Constructeur
    public Version1 (double nombre1, double nombre2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    // Méthode pour effectuer la somme
    public double somme() {
        return nombre1 + nombre2;
    }

    // Méthode pour obtenir le premier nombre
    public double getNombre1(){
        return nombre1;
    }

    // Méthode pour obtenir le deuxième nombre
    public double getNombre2(){
        return nombre2;
    }
}
