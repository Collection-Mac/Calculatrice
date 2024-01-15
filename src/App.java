import java.util.Scanner;

public class App {
    static Scanner keyb = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("\n");
        System.out.println("                      ************************************");
        System.out.println("                      *             BONJOUR !            *");
        System.out.println("                      *                                  *");
        System.out.println("                      *     JE SUIS UNE CALCULATRICE     *");
        System.out.println("                      *               JAVA               *");
        System.out.println("                      *           _______________        *");
        System.out.println("                      *                                  *");
        System.out.println("                      ************************************");
        System.out.println(" ");

        System.out.print("\n" + "                      Entrer un nombre : ");
        Calculatrice lire = new Calculatrice(0,0);
        double getNombre1 = lire.lireNombre();
        System.out.print("\n" + "                      Entrer un nombre : ");
        double getNombre2 = lire.lireNombre();

        Calculatrice calcul = new Calculatrice(getNombre1, getNombre2);
        double resultat = calcul.somme();

        System.out.println("\n"+"                      Le Resultat est : " + resultat +"\n");
    }
}
