import java.util.Scanner;

public class Calculatrice {
    private double nombre1;
    private double nombre2;

    static Scanner keyb = new Scanner(System.in);

    // Constructeur
    public Calculatrice(double nombre1, double nombre2) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
    }

    // Méthode pour effectuer une somme
    public double somme() {
        return nombre1 + nombre2;
    }

    // Méthode pour effectuer une soustraction
    public double soustraction() {
        return nombre1 - nombre2;
    }

    // Méthode pour effectuer une multiplication
    public double multiplication() {
        return nombre1 * nombre2;
    }

    // Méthode pour effectuer une division
    public double division() {
        return nombre1 / nombre2;
    }

    // Méthode pour lire la saisir de l'utilisateur
    public double lireNombre() {
        while (true) {// Boucle permettant de demander à l'utilisateur d'entrer un nombre valide si ce n'est pas le cas.
            try {// Le bloc "try" tente de lire un nombre(double) lorsque l'utilisateur appuit sur Entrée
                return keyb.nextDouble();// il retourne la valeur entrée si elle es un nombre sinon le bloc "catch" est executé
            }catch (java.util.InputMismatchException e) {
                System.out.print("\n"+"                      ERREUR !");
                System.out.print("\n"+"                      Entrez un nombre valide: ");
                keyb.nextLine(); // Efface le scanner pour éviter une boucle infinie
            }
        }
    }

    /* public lireOperateur(){
        
    } */

    // Méthode pour obtenir le premier nombre
    public double getNombre1() {
        return nombre1;
    }

    // Méthode pour obtenir le deuxième nombre
    public double getNombre2() {
        return nombre2;
    }
}
