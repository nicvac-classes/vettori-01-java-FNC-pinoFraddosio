//LEGGERE LE ISTRUZIONI NEL FILE README.md

//Import di Classi Java necessarie al funzionamento del programma
import java.util.Scanner;

// Classe principale, con metodo main
class Esercizio {
    // Il programma parte con una chiamata a main().
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        String[] V = new String[5];
        
        V[0] = "Matt";
        V[1] = "Chris";
        V[2] = "Dom";
        V[3] = "Adele";
        V[4] = "Celine";

        String[] W = new String[5];

        for(int i = 0; i < W.length; i++){
            System.out.print("Inserire il nome del cantante: ");
            W[i] = in.next();
        }

        int[] X = new int[10];

        for(int i = 0; i < X.length; i++){
            X[i] = i+1;
        }

        int[] Y = new int[10];

        for(int i = 0; i < Y.length; i++){
            Y[i] = (i+1) * 2;
        }

        System.out.println("Visualizzare solo 3 elementi del vettore V: " + V[0] + " " + V[2] + " " + V[4]);

        System.out.println("Visualizzare gli elementi dei vettori V,W,X,Y");

        System.out.print("V: ");

        for(int i = 0; i < V.length; i++){
            System.out.print(V[i] + ", ");
        }

        System.out.println("");
        System.out.print("W: ");
        
        for(int i = 0; i < W.length; i++){
            System.out.print(W[i] + ", ");
        }

        System.out.println("");
        System.out.print("X: ");

        for(int i = 0; i < X.length; i++){
            System.out.print(X[i] + ", ");
        }

        System.out.println("");
        System.out.print("Y: ");

        for(int i = 0; i < Y.length; i++){
            System.out.print(Y[i] + ", ");
        }

        System.out.println("");
        System.out.print("X solo incidici pari: ");

        for(int i = 0; i < X.length; i += 2){
            System.out.print(X[i] + ", ");
        }

        System.out.println("");
        System.out.print("X solo indici dispari: ");

        for(int i = 1; i < X.length; i += 2){
            System.out.print(X[i] + ", ");
        }

        System.out.println("");
        System.out.print("X solo valori pari: ");

        for(int i = 0; i < X.length; i++){
            if(X[i] % 2 == 0){
                System.out.print(X[i] + ", ");
            }
        }

    }
}

//LEGGERE LE ISTRUZIONI NEL FILE README.md