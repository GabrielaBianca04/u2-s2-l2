import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static <N> void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("Inserisci un intero N che rappresenti il numero di elementi da inserire ");
       int N = input.nextInt();
       System.out.println("L'N inserito è:" + N);

        System.out.println("Inserisci"+ N + "parole");
       String parola = input.nextLine();
        System.out.println("La parola inserita è:" + parola);

    }
    }
