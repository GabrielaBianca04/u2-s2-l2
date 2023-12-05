import Set.HashSet;

import java.util.Scanner;

public class NArray {
    public static <integer, N> void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Inserisci un intero N che rappresenti il numero di elementi da inserire ");
        int N = input.nextInt();

        //Riempio l'array
        int[] Narray = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.print("Stampa l'" + (i + 1) + "-esimo intero:");
            Narray[i] = input.nextInt();
        }

        //Stampo l'array
        System.out.print("[");
        for (int i = 0; i < Narray.length; i++) {
            System.out.print(Narray[i] + "");
            System.out.println("]");
        }

        System.out.println("Inserisci" + N + "parole");
        String[] Parole = new String[]{input.nextLine()};
        for (int i = 0; i < Parole.length; i++) {
            System.out.print("Stampa" + (i + 1));
            Narray[i] = input.nextInt();
        }

        System.out.print("[");
        for (int i = 0; i < Parole.length; i++) {
            System.out.print(Parole[i] + "");
            System.out.println("]");
        }
    }
}





