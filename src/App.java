import java.util.Scanner;

public class App {static Scanner keyb = new Scanner(System.in);


    public static void main(String[] args) throws Exception {

        System.out.println("\n"+"*****Entrer un nombre :");
        double getNombre1 = keyb.nextDouble();
        System.out.println("\n"+"*****Entrer un nombre :");
        double getNombre2 = keyb.nextDouble();
        
        Version1 calcul = new Version1(getNombre1, getNombre2);
        double resultat = calcul.somme();

        System.out.println("******Le Resultat est :" + resultat);
    }
}
